package org.corgi.refactoring.chapter8.replacetypecodewithsubclasses.after;

public class ShapeOval extends Shape {

    protected ShapeOval(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        this.drawOval();
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_OVAL;
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    public void drawOval() {
        System.out.println("drawOval: "+this.toString());
    }
}
