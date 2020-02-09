package org.corgi.refactoring.chapter8.replaceTypeCodeWithSubClasses.after;

public class ShapeLine extends Shape {

    protected ShapeLine(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        this.drawLine();
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_LINE;
    }

    @Override
    public String getName() {
        return "LINE";
    }

    public void drawLine() {
        System.out.println("drawLine: "+this.toString());
    }
}
