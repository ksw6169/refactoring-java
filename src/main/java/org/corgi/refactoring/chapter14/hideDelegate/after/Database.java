package org.corgi.refactoring.chapter14.hideDelegate.after;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Database {

    private final Properties properties;
    private final String filename;

    public Database(String filename) {
        this.filename = filename;
        this.properties = new Properties();

        try {
            this.properties.load(new FileInputStream(this.filename));
        } catch (IOException ignore) {

        }
    }

    public void set(String key, String value) {
        this.properties.setProperty(key, value);
    }

    public String get(String key) {
        return this.properties.getProperty(key);
    }

    public void update() throws IOException {
        this.properties.store(new FileOutputStream(this.filename), "");
    }

    public Properties getProperties() {
        return this.properties;
    }

    public Enumeration keys() {
        return this.properties.propertyNames();
    }
}
