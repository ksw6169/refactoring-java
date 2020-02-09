package org.corgi.refactoring.chapter10.replaceErrorCodeWithException.after;

public class Position {

    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void relativeMove(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
