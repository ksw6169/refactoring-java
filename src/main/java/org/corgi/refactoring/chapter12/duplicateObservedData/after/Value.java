package org.corgi.refactoring.chapter12.duplicateObservedData.after;

import java.util.ArrayList;
import java.util.List;

public class Value {

    private int value;
    private final List<ValueListener> listeners = new ArrayList<>();

    public Value(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
        this.notifyToListeners();
    }

    public int getValue() {
        return this.value;
    }

    public void addValueListener(ValueListener listener) {
        this.listeners.add(listener);
    }

    public boolean removeValueListener(ValueListener listener) {
        return this.listeners.remove(listener);
    }

    private void notifyToListeners() {
        for (ValueListener listener : this.listeners) {
            listener.valueChanged(new ValueChangeEvent(this));
        }
    }
}
