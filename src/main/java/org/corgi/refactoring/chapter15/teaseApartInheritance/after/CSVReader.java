package org.corgi.refactoring.chapter15.teaseApartInheritance.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class CSVReader {

    protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
    protected final BufferedReader bufReader;

    protected CSVReader(BufferedReader bufReader) {
        this.bufReader = bufReader;
    }

    public String[] readCSV() throws IOException {

        String line = this.bufReader.readLine();

        if (line == null) {
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }

    }

    public void close() throws IOException {
        this.bufReader.close();
    }
}
