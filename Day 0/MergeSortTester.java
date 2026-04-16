public class MergeSortTester {

    public static void main(String[] args) {

        int[] a = { 0, 4, 7, 8, 9, 11, 12 };
        int[] b = { 3, 5, 6, 10, 11, 13, 15 };

        MergeSort.combineSortedArrays(a, b);

        MergeSort.printAll(a, b, MergeSort.combineSortedArrays(a, b));

    }

}
