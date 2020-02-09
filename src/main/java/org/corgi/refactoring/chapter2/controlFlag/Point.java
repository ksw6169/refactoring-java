package org.corgi.refactoring.chapter2.controlFlag;

public class Point {

    private int x;
    private int y;
    private Point[] points;

    public boolean existPoint(int x, int y) {

        for (Point point : points) {
            if (point.x == x && point.y == y) {
                return true;
            }
        }

        return false;
    }
}
