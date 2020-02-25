package org.corgi.refactoring.chapter14.hideDelegate.before;

import java.util.Enumeration;

public class AddressFile {

    private final Database database;

    public AddressFile(String filename) {
        this.database = new Database(filename);
    }

    public Database getDatabase() {
        return this.database;
    }

    public Enumeration names() {
        return this.database.getProperties().propertyNames();
    }
}
