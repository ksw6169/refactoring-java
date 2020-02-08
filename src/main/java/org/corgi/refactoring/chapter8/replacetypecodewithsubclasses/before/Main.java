package org.corgi.refactoring.chapter8.replacetypecodewithsubclasses.before;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shape line = new Shape(Shape.TYPECODE_LINE, 0,0,100,200);
        Shape rectangle = new Shape(Shape.TYPECODE_RECTANGLE, 10,20,30,40);
        Shape oval = new Shape(Shape.TYPECODE_OVAL, 100,200,300,400);

        Shape[] shape = {
            line, rectangle, oval
        };

        Arrays.stream(shape)
                .forEach(s -> s.draw());
    }
}
