package org.corgi.refactoring.chapter12.duplicateObservedData.after;

public class ValueChangeEvent {

    private final Value source;

    public ValueChangeEvent(Value source) {
        this.source = source;
    }

    public Value getSource() {
        return this.source;
    }
}
