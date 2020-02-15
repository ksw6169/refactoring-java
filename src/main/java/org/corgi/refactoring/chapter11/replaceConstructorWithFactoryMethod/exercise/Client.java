package org.corgi.refactoring.chapter11.replaceConstructorWithFactoryMethod.exercise;

import java.util.Arrays;

public class Client {

    private final Printer printer;

    public Client(Printer printer) {
        this.printer = printer;
    }

    public void execute() {
        Arrays.asList(3,1,4,1,5,9)
                .forEach(this.printer::println);
    }
}
