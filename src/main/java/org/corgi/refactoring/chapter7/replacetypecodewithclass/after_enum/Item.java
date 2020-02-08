package org.corgi.refactoring.chapter7.replacetypecodewithclass.after_enum;

public class Item {

    private final ItemType type;
    private final String title;
    private final int price;

    public Item(ItemType type, String title, int price) {
        this.type = type;
        this.title = title;
        this.price = price;
    }

    public int getTypeCode() {
        return this.type.getTypeCode();
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
