package org.corgi.refactoring.chapter3.assertion;


public class SortSample {

    private int[] data;

    public SortSample(int[] data) {
        this.data = new int[data.length];
        System.arraycopy(data, 0, this.data, 0, this.data.length);
    }


    public void sort() {

        for (int x=0; x<this.data.length; x++) {
            int m = x;

            for (int y=x+1; y<this.data.length; y++) {
                if (data[m] > data[y]) {
                    m = y;
                }
            }

            // 여기서, data[m]은 data[x] ~ data[data.length-1] 중의 최소값이어야 함
            assert isMin(m, x, data.length-1);

            int v = data[m];
            data[m] = data[x];
            data[x] = v;

            // 여기서 data[0] ~ data[x+1]은 이미 정렬되어 있어야 함
            assert isSorted(0, x+1);
        }
    }


    public boolean isMin(int pos, int start, int end) {

        for (int i=start; i<=end; i++) {
            if (this.data[pos] > this.data[i]) {
                return false;
            }
        }

        return true;
    }


    public boolean isSorted(int start, int end) {

        for (int i=start; i<=end; i++) {
            if (this.data[i] > this.data[i+1]) {
                return false;
            }
        }

        return true;
    }


    public String toString() {

        StringBuffer strBuf = new StringBuffer();
        strBuf.append("[");

        for (int i=0; i<this.data.length; i++) {
            strBuf.append(this.data[i]);
            strBuf.append(", ");
        }

        strBuf.append("]");

        return strBuf.toString();
    }
}
