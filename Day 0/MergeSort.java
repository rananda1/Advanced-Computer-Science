public class MergeSort {

    // private int indexA;
    // private int indexB;
    // private int index;

    // public int getIndex() {
    // return index;
    // }

    // public int getIndexA() {
    // return indexA;
    // }

    // public int getIndexB() {
    // return indexB;
    // }

    // public void setIndex(int index) {
    // this.index = index;
    // }

    // public void setIndexA(int indexA) {
    // this.indexA = indexA;
    // }

    // public void setIndexB(int indexB) {
    // this.indexB = indexB;
    // }

    // int[] a = { 0, 4, 8, 9, 11, 12 };
    // int[] b = { 3, 5, 6, 10, 11, 13, 15 };
    // int[] c = new int[a.length + b.length];

    static int[] combineSortedArrays(int[] a, int[] b) {
        int indexA = 0;
        int indexB = 0;
        // int index = 0;
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < c.length; i++) {
            if (indexA < a.length && indexB < b.length) {
                if (a[indexA] < b[indexB]) {
                    c[i] = a[indexA];
                    indexA++;
                } else {
                    c[i] = b[indexB];
                    indexB++;
                }
            } else if (indexA < a.length) {
                c[i] = a[indexA];
                indexA++;
            } else {
                c[i] = b[indexB];
                indexB++;
            }
        }

        // for (int i = 0; i < c.length; i++) {
        // if (indexA < a.length && (a[indexA] < b[indexB] || indexB >= b.length)) {
        // c[i] = a[indexA];
        // indexA++;
        // } else {
        // // if (a[indexA] > b[indexB]) {
        // if (indexB < b.length) {
        // c[i] = b[indexB];
        // indexB++;
        // }
        // }
        // }

        // while (index <= c.length)
        // for (int i = 0; i < c.length; i++) {
        // if (indexA < a.length && a[indexA] < b[indexB]) {
        // c[i] = a[indexA];
        // indexA++;
        // } else {
        // // if (a[indexA] > b[indexB]) {
        // if (indexB < b.length) {
        // c[i] = b[indexB];
        // indexB++;
        // }

        // }
        // index++;
        // }

        // index++;

        return c;
    }

    static void print(int[] a) {
        String arrayString1 = "";
        for (int i = 0; i < a.length; i++) {
            arrayString1 += ", " + a[i];
        }
        if (arrayString1.length() > 2) {
            arrayString1 = "[" + arrayString1.substring(2) + "]";
        } else {
            arrayString1 = "[" + arrayString1 + "]";
        }

        System.out.println(arrayString1);
    }

    static void printAll(int[] a, int[] b, int[] c) {

        print(a);
        print(b);
        print(c);

    }

}
