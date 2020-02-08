package org.corgi.refactoring.replacetypecodewithclass.before;

public class Item {

    public static final int TYPECODE_BOOK = 0;
    public static final int TYPECODE_DVD = 1;
    public static final int TYPECODE_SOFTWARE = 2;

    private final int typeCode;

    private final String title;
    private final int price;

    public Item(int typeCode, String title, int price) {
        this.typeCode = typeCode;
        this.title = title;
        this.price = price;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {

        StringBuffer strBuf = new StringBuffer();
        strBuf.append("[");
        strBuf.append(this.getTypeCode());
        strBuf.append(",  ");
        strBuf.append(this.getTitle());
        strBuf.append(", ");
        strBuf.append(this.getPrice());
        strBuf.append("]");

        return strBuf.toString();
    }
}
