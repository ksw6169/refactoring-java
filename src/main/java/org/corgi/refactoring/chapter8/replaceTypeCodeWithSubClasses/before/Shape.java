package org.corgi.refactoring.chapter8.replaceTypeCodeWithSubClasses.before;

public class Shape {

    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int typeCode;
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    protected Shape(int typeCode, int startX, int startY, int endX, int endY) {
        this.typeCode = typeCode;
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getTypeCode() {
        return this.typeCode;
    }

    public String getName() {

        switch (this.typeCode) {
            case TYPECODE_LINE:
                return "LINE";
            case TYPECODE_RECTANGLE:
                return "RECTANGLE";
            case TYPECODE_OVAL:
                return "OVAL";
            default:
                return null;
        }
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

    public void draw() {

        switch (this.typeCode) {
            case TYPECODE_LINE:
                drawLine();
                break;
            case TYPECODE_RECTANGLE:
                drawRectangle();
                break;
            case TYPECODE_OVAL:
                drawOval();
                break;
            default:
                ;
        }
    }

    private void drawLine() {
        System.out.println("drawLine: " + this.toString());
    }

    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
    }

    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
    }

}
