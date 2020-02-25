package org.corgi.refactoring.chapter15.teaseApartInheritance.before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class CSVStringReader extends CSVReader{

    private final BufferedReader bufReader;

    public CSVStringReader(String string) {
        this.bufReader = new BufferedReader(new StringReader(string));
    }

    @Override
    public String[] readCSV() throws IOException {

        String line = this.bufReader.readLine();

        if (line == null) {
            return null;
        } else {
            String[] item = CSV_PATTERN.split(line);
            return item;
        }
    }

    @Override
    public void close() throws IOException {
        this.bufReader.close();
    }
}
