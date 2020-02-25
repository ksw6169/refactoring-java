package org.corgi.refactoring.chapter14.hideDelegate.after;

import java.io.IOException;
import java.util.Enumeration;

public class AddressFile {

    private final Database database;

    public AddressFile(String filename) {
        this.database = new Database(filename);
    }

    public void set(String key, String value) {
        this.database.set(key, value);
    }

    public String get(String key) {
        return this.database.get(key);
    }

    public void update() throws IOException {
        this.database.update();
    }

    public Enumeration names() {
        return this.database.keys();
    }
}
