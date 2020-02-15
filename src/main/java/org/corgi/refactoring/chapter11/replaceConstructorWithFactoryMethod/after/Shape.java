package org.corgi.refactoring.chapter11.replaceConstructorWithFactoryMethod.after;

public abstract class Shape {

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    protected Shape(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public static Shape createLine(int startX, int startY, int endX, int endY) {
        return new ShapeLine(startX, startY, endX, endY);
    }

    public static Shape createRectangle(int startX, int startY, int endX, int endY) {
        return new ShapeRectangle(startX, startY, endX, endY);
    }

    public static Shape createOval(int startX, int startY, int endX, int endY) {
        return new ShapeOval(startX, startY, endX, endY);
    }

    public String toString() {
        StringBuffer strBuf = new StringBuffer();
        strBuf.append("[");
        strBuf.append(this.getName());
        strBuf.append(", (");
        strBuf.append(this.startX);
        strBuf.append(", ");
        strBuf.append(this.startY);
        strBuf.append(")-(");
        strBuf.append(this.endX);
        strBuf.append(", ");
        strBuf.append(this.endY);
        strBuf.append(")]");

        return strBuf.toString();
    }

    public abstract void draw();
    public abstract String getName();
}
