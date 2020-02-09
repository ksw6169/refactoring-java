package org.corgi.refactoring.chapter8.replaceTypeCodeWithSubClasses.after;

public class ShapeRectangle extends Shape {

    protected ShapeRectangle(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        this.drawRectangle();
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_RECTANGLE;
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }

    public void drawRectangle() {
        System.out.println("drawRectangle: "+this.toString());
    }

}
