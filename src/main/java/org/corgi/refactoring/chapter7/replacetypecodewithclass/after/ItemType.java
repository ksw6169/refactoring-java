package org.corgi.refactoring.chapter7.replacetypecodewithclass.after;

public class ItemType {

    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFT = new ItemType(2);

    private final int typeCode;

    private ItemType(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return typeCode;
    }
}
