package org.corgi.refactoring.chapter10.replaceErrorCodeWithException.after;

public class Direction {

    public int x;
    public int y;

    public Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setDirection(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
