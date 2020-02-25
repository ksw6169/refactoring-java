package org.corgi.refactoring.chapter15.teaseApartInheritance.before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader extends CSVReader {

    private final BufferedReader bufReader;

    public CSVFileReader(String filename) throws IOException {
        this.bufReader = new BufferedReader(new FileReader(filename));
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
