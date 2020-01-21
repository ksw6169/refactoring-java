package org.corgi.refactoring.nullobject;


public class Label {

    private final String label;

    public Label(String label) {
        this.label = label;
    }

    public static Label newNull() {
        return NullLabel.getInstance();
    }

    public void display() {
        System.out.println("display: "+label);
    }

    public String toString() {
        return label;
    }

    public boolean isNull() {
        return false;
    }
}
