public class Unit6Worksheet {

    public static void main(String[] args) {

        // public static int mystery2(int n) {
        // if (n == 0) {
        // return 0;
        // }
        // return n + mystery2(n - 1);
        // }
        System.out.println(mystery2(4));

        System.out.println(mystery3("hello"));

        System.out.println(mystery4(234));

        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        System.out.println(mystery5(numbers, 0));

    }

    public static int mystery2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + mystery2(n - 1);
    }

    public static String mystery3(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return mystery3(str.substring(1)) + str.charAt(0);
    }

    // Method call: System.out.println(mystery3("hello"));

    public static int mystery4(int n) {
        if (n < 10) {
            return n;
        }
        return mystery4(n / 10) + n % 10;
    }

    // Method call: System.out.println(mystery4(234));

    public static int mystery5(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        if (arr[index] % 2 == 0) {
            return arr[index] + mystery5(arr, index + 1);
        }
        return mystery5(arr, index + 1);
    }

    // Method call:
    // int[] numbers = {1, 2, 3, 4, 5, 6};
    // System.out.println(mystery5(numbers, 0));

}
