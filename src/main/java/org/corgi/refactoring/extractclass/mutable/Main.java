package org.corgi.refactoring.extractclass.mutable;

public class Main {

    public static void main(String[] args) {

        Book refactoring = new Book(
            "Refactoring: improving the design of existing code",
            "ISBN0201485672",
            "$44.95",
        "Martin Fowler",
        "fowler@acm.org");

        // refactoring.getAuthor().setName("");     -> 사용 불가(ImmutableAuthor 타입이므로)
    }
}
