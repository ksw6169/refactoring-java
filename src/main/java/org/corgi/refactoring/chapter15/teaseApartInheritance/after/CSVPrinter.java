package org.corgi.refactoring.chapter15.teaseApartInheritance.after;

import java.io.IOException;

public abstract class CSVPrinter {

    protected final CSVReader reader;

    protected CSVPrinter(CSVReader reader) {
        this.reader = reader;
    }

    public abstract void print() throws IOException;

}
