package org.corgi.refactoring.chapter8.replaceTypeCodeWithSubClasses.after;

public abstract class Shape {

    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public static Shape createShape(int typeCode, int startX, int startY, int endX, int endY) {

        switch (typeCode) {
            case TYPECODE_LINE:
                return new ShapeLine(startX, startY, endX, endY);
            case TYPECODE_RECTANGLE:
                return new ShapeRectangle(startX, startY, endX, endY);
            case TYPECODE_OVAL:
                return new ShapeOval(startX, startY, endX, endY);
            default:
                throw new IllegalArgumentException("typeCode = " + typeCode);
        }
    }


    protected Shape(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public String toString() {

        StringBuffer strBuf = new StringBuffer();
        strBuf.append("[");
        strBuf.append(this.getName());
        strBuf.append(", ");
        strBuf.append("(");
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

    public abstract int getTypeCode();
    public abstract String getName();
    public abstract void draw();
}
