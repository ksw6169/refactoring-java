package org.corgi.refactoring.chapter11.replaceConstructorWithFactoryMethod.after;

public class ShapeLine extends Shape {

    public ShapeLine(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        System.out.println("drawLine : " + this.toString());
    }

    @Override
    public String getName() {
        return "LINE";
    }
}
