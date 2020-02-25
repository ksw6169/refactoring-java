package org.corgi.refactoring.chapter15.teaseApartInheritance.after;

import java.io.IOException;

public class CSVTablePrinter extends CSVPrinter {

    public CSVTablePrinter(CSVReader reader) {
        super(reader);
    }

    public String[] readCSV() throws IOException {
        return this.reader.readCSV();
    }

    @Override
    public void print() throws IOException {

        System.out.println("<table>");

        for (int row=0; true; row++) {
            String[] item = readCSV();

            if (item == null) {
                break;
            }

            System.out.println("<tr>");

            for (int column=0; column<item.length; column++) {
                System.out.print("<td>");
                System.out.print(item[column]);
                System.out.print("</td>");
            }

            System.out.println("</tr>");
        }

        System.out.println("</table>");
    }
}
