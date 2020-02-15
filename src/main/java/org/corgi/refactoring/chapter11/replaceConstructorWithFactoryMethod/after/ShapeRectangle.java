package org.corgi.refactoring.chapter11.replaceConstructorWithFactoryMethod.after;

public class ShapeRectangle extends Shape {

    public ShapeRectangle(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        System.out.println("drawRectangle : " + this.toString());
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }
}
