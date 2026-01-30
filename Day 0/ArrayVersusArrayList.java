import java.util.ArrayList;

public class ArrayVersusArrayList {

    public static void main(String[] args) {

        System.out.println("== Testing Arrays lastComesFirst() ==");
        testLastComesFirst1();
        System.out.println();

        System.out.println("== Testing ArrayLists lastComesFirst() ==");
        testLastComesFirst2();
        System.out.println();

        System.out.println("== Testing Arrays firstComesLast() ==");
        testFirstComesLast1();
        System.out.println();

        System.out.println("== Testing ArrayLists firstComesLast() ==");
        testFirstComesLast2();

    }

    // modifies the given array by moving the last element to the first index, and
    // shifting all
    // other elements to the right.
    public static void lastComesFirst(String[] arr) {
        // to-do: implement method
        if (arr != null && arr.length != 0) {
            String[] example = new String[arr.length];
            for (int i = 0; i < example.length; i++) {
                example[i] = arr[i];
            }
            arr[0] = arr[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) { // length - 1
                arr[i + 1] = example[i];
            }
        } else if (arr == null) {
            throw new IllegalArgumentException("Cannot be null.");
        } else {
            return;
        }

    }

    // modifies the given array by moving the last element to the first index, and
    // shifting all
    // other elements to the right.
    public static void lastComesFirst(ArrayList<String> arrList) {
        // to-do: implement method
        if (arrList != null && arrList.size() != 0) {
            String[] example = new String[arrList.size()];
            for (int i = 0; i < example.length; i++) {
                example[i] = arrList.get(i);
            }
            arrList.set(0, arrList.get(arrList.size() - 1));
            for (int i = 0; i < arrList.size() - 1; i++) {
                arrList.set(i + 1, example[i]);
            }
        } else if (arrList == null) {
            throw new IllegalArgumentException("Cannot be null.");
        } else {
            return;
        }

    }

    // modifies the given array by moving the first element to the last index, and
    // shifting all
    // other elements to the left.
    public static void firstComesLast(String[] arr) {
        // to-do: implement method
        if (arr != null && arr.length != 0) {
            String[] example = new String[arr.length];
            for (int i = 0; i < example.length; i++) {
                example[i] = arr[i];
            }
            arr[arr.length - 1] = arr[0];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i - 1] = example[i];
            }
        } else {
            throw new IllegalArgumentException("Cannot be null.");
        }

    }

    // modifies the given array by moving the first element to the last index, and
    // shifting all
    // other elements to the left.
    public static void firstComesLast(ArrayList<String> arrList) {
        // to-do: implement method
        if (arrList != null && arrList.size() != 0) {
            String[] example = new String[arrList.size()];
            for (int i = 0; i < example.length; i++) {
                example[i] = arrList.get(i);
            }
            arrList.set(arrList.size() - 1, arrList.get(0));
            for (int i = arrList.size() - 1; i > 0; i--) {
                arrList.set(i - 1, example[i]);
            }
        } else {
            throw new IllegalArgumentException("Cannot be null.");
        }

    }

    // Test Methods
    // method to print an array
    public static String printArray(String[] arr) {
        String arrayStr = "[";
        for (int k = 0; k < arr.length; k++) {
            if (k < arr.length - 1) {
                arrayStr += arr[k] + ", ";

            } else {
                arrayStr += arr[k] + "]";
            }
        }

        return arrayStr;
    }

    public static void testLastComesFirst1() {
        String[] strArray = { "first", "second", "third", "fourth", "fifth" };
        String[] expectedArray = { "fifth", "first", "second", "third", "fourth" };

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + printArray(strArray));
        System.out.println("\tExpecting: " + printArray(expectedArray));

        lastComesFirst(strArray);
        System.out.println("\tOutput: " + printArray(strArray));
        System.out.println("\tResult: "
                + (printArray(expectedArray).equals(printArray(strArray)) ? "PASS" : "FAIL"));

    }

    public static void testFirstComesLast1() {
        String[] strArray = { "one", "two", "three", "four", "five" };
        String[] expectedArray = { "two", "three", "four", "five", "one" };

        System.out.println("\tTesting firstComesLast():");
        System.out.println("\tOriginal: " + printArray(strArray));
        System.out.println("\tExpecting: " + printArray(expectedArray));

        firstComesLast(strArray);
        System.out.println("\tOutput: " + printArray(strArray));
        System.out.println("\tResult: "
                + (printArray(expectedArray).equals(printArray(strArray)) ? "PASS" : "FAIL"));
    }

    public static void testLastComesFirst2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("fifth");
        expectedList.add("first");
        expectedList.add("second");
        expectedList.add("third");
        expectedList.add("fourth");

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + list);
        System.out.println("\tExpecting: " + expectedList);

        lastComesFirst(list);

        System.out.println("\tOutput: " + list);
        boolean result = (expectedList).equals(list);
        System.out.println("\tResult: " + (result ? "PASS" : "FAIL"));

    }

    public static void testFirstComesLast2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("two");
        expectedList.add("three");
        expectedList.add("four");
        expectedList.add("five");
        expectedList.add("one");

        System.out.println("\tTesting firstComesLast():");
        System.out.println("\tOriginal: " + list);
        System.out.println("\tExpecting: " + expectedList);

        firstComesLast(list);

        System.out.println("\tOutput: " + list);
        boolean result = (expectedList).equals(list);
        System.out.println("\tResult: " + (result ? "PASS" : "FAIL"));

    }

}
