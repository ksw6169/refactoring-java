package org.corgi.refactoring.chapter2.controlflag;

public class FindInt {

    public static boolean find(int[] data, int target) {

        for (int i=0; i<data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }

        return false;
    }
}