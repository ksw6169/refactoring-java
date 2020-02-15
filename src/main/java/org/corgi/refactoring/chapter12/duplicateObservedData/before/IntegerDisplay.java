package org.corgi.refactoring.chapter12.duplicateObservedData.before;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IntegerDisplay extends Frame implements ActionListener {

    private final Label octalLabel = new Label("0");
    private final Label decimalLabel = new Label("0");
    private final Label hexadecimalLabel = new Label("0");
    private final Button incrementButton = new Button("+");
    private final Button decrementButton = new Button("-");

    private int value = 0;

    public IntegerDisplay() {
        super("IntegerDisplay");

        setLayout(new GridLayout(4, 2));
        add(new Label("Octal: "));
        add(this.octalLabel);
        add(new Label("Decimal: "));
        add(this.decimalLabel);
        add(new Label("Hexadecimal: "));
        add(this.hexadecimalLabel);
        add(this.incrementButton);
        add(this.decrementButton);

        this.incrementButton.addActionListener(this);
        this.decrementButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setBounds(500,500, 500, 500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementButton) {
            this.setValue(this.value + 1);
        } else if (e.getSource() == decrementButton) {
            this.setValue(this.value - 1);
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
        this.octalLabel.setText(Integer.toString(this.value, 8));
        this.decimalLabel.setText(Integer.toString(this.value, 10));
        this.hexadecimalLabel.setText(Integer.toString(this.value, 16));
    }
}
