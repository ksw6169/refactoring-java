package org.corgi.refactoring.chapter11.replaceConstructorWithFactoryMethod.exercise;

public class Main {

    public static void main(String[] args) {
        new Client(new DigitPrinter()).execute();
        new Client(new GraphPrinter()).execute();
    }
}
