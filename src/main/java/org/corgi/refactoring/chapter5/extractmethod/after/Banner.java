package org.corgi.refactoring.chapter5.extractmethod.after;

public class Banner {

    private final String content;

    public Banner(String content) {
        this.content = content;
    }

    public void print(int times) {
        printBorder();
        printContent(times);
        printBorder();
    }


    public void printBorder() {

        System.out.print("+");

        for (int i=0; i<content.length(); i++) {
            System.out.print("-");
        }

        System.out.println("+");
    }


    public void printContent(int times) {

        for (int i=0; i<times; i++) {
            System.out.println("|"+content+"|");
        }
    }
}
