package org.corgi.refactoring.controlflag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {

    private Map<String, String> map = new HashMap<>();

    public SimpleDatabase(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);

        while (true) {
            String line = reader.readLine();

            if (line == null) {
                break;
            }

            if (line.contains("=")) {
                String[] lineArr = line.split("=");
                String key = lineArr[0];
                String value = lineArr[1];

                map.put(key, value);
            }
        }
    }


    public void putValue(String key, String value) {
        map.put(key, value);
    }


    public String getValue(String key) {
        return map.get(key);
    }


    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }
}
