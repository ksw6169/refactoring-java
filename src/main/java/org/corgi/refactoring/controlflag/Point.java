package org.corgi.refactoring.controlflag;

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
