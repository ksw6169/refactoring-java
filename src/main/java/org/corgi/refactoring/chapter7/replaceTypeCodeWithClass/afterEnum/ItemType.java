package org.corgi.refactoring.chapter7.replaceTypeCodeWithClass.afterEnum;

public enum ItemType {

    BOOK(0),
    DVD(1),
    SOFT(2);

    private final int typeCode;

    private ItemType(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return this.typeCode;
    }
}
