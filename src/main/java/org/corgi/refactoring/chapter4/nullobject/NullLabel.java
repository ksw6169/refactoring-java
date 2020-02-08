package org.corgi.refactoring.chapter4.nullobject;

public class NullLabel extends Label {

    private static NullLabel singleton = new NullLabel();

    private NullLabel() {
        super("(none)");
    }

    @Override
    public void display() {

    }

    @Override
    public boolean isNull() {
        return true;
    }

    public static synchronized Label getInstance() {
        return singleton;
    }
}
