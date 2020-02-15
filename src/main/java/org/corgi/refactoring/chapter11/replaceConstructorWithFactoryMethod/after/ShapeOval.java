package org.corgi.refactoring.chapter11.replaceConstructorWithFactoryMethod.after;

public class ShapeOval extends Shape {

    public ShapeOval(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        System.out.println("drawOval : " + this.toString());
    }

    @Override
    public String getName() {
        return "OVAL";
    }
}
