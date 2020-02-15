package org.corgi.refactoring.chapter11.replaceConstructorWithFactoryMethod.after;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shape line = Shape.createLine(0, 0, 100, 200);
        Shape rectangle = Shape.createLine(10, 20, 30, 40);
        Shape oval = Shape.createLine(100, 200, 300, 400);

        Arrays.asList(line, rectangle, oval)
                .forEach(Shape::draw);
    }
}
