package org.corgi.refactoring.chapter11.replaceConstructorWithFactoryMethod.before;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shape line = new Shape(Shape.TYPECODE_LINE, 0, 0, 100, 200);
        Shape rectangle = new Shape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40);
        Shape oval = new Shape(Shape.TYPECODE_OVAL, 100, 200, 300, 400);

        Arrays.asList(line, rectangle, oval)
                .forEach(Shape::draw);
    }
}
