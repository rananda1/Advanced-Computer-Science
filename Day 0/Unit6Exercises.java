public class Unit6Exercises {

    /**
     * Problem 1 - Factorial: Write a recursive and non-recursive method that
     * returns the factorial
     * of a given number n.
     */
    public static int factorial(int n) {
        int num = 1;
        for (int i = n; i >= 0; i--) {
            num = num * i;
        }
        return num;
    }

    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialRecursive(n - 1);

    }

    /**
     * Problem 2 - Fibonacci Sequence: Write a recursive and non-recursive method
     * that returns the
     * nth number in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int behind = 0;
        int current = 1;
        int next = 0;
        for (int i = 2; i <= n; i++) {
            next = behind + current;
            behind = current;
            current = next;
        }
        return current;

    }

    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * Problem 3 - Sum of Digits: Write a recursive and non-recursive method that
     * returns the sum of
     * the digits of a given integer.
     */
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;

        // return 0;

    }

    public static int sumDigitsRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        // int sum = sumDigitsRecursive(n % 10);
        int sum = sumDigitsRecursive(n / 10);
        sum += n % 10;
        // n = n / 10;
        return sum;

    }

    /**
     * Problem 4 - Count X: Write a recursive and non-recursive method that returns
     * the count of
     * occurrences of 'x' in a given string.
     */
    public static int countX(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                num++;
            }
        }
        return num;
    }

    public static int countXRecursive(String str) {
        if (str.length() == 1) {
            if (str.charAt(0) == 'x') {
                return 1;
            } else {
                return 0;
            }
        }
        int leftOver = countXRecursive(str.substring(1));
        if (str.charAt(0) == 'x') {
            return 1 + leftOver;
        } else {
            return leftOver;
        }

    }

    /**
     * Problem 5 - Reverse String: Write a recursive and non-recursive method that
     * returns the
     * reverse of a given string.
     */
    public static String reverseString(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str2;
    }

    public static String reverseStringRecursive(String str) {
        if (str.length() == 1) {
            return str;
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    /**
     * Problem 6 - Power of a Number: Write a recursive and non-recursive method
     * that calculates and
     * returns the valtue of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        int num = 1;
        for (int i = 0; i < exponent; i++) {
            num = num * base;
        }
        return num;
    }

    public static int powerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        int num = powerRecursive(base, exponent - 1);

        return base * num;

        // return 0;

    }

    /**
     * Problem 7 - Palindrome Checker: Write a recursive and non-recursive method
     * that checks
     * whether a given string is a palindrome.
     */
    public static boolean isPalindrome(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        if (str2.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromeRecursive(String str) {
        if (reverseStringRecursive(str).equals(str)) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Problem 8 - Greatest Common Divisor (GCD): Write a recursive and
     * non-recursive method that
     * finds and returns the greatest common divisor of two numbers.
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temporary = b;
            b = a % b;
            a = temporary;
        }
        return a;
    }

    public static int gcdRecursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdRecursive(b, a % b);

    }

    /**
     * Problem 9 - Bunny Ears 2: We have bunnies standing in a line, numbered 1, 2,
     * ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll
     * say have 3 ears,
     * because they each have a raised foot. Recursively return the number of "ears"
     * in the bunny
     * line 1, 2, ... n (without loops or multiplication).
     */

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < bunnies; i++) {
            if (bunnies % 2 == 0) {
                sum += 3;
            } else {
                sum += 2;
            }
        }
        return sum;

    }

    public static int bunnyEarsRecursive(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return bunnyEarsRecursive(bunnies - 1) + 3;
        } else {
            return bunnyEarsRecursive(bunnies - 1) + 2;
        }

    }

    /**
     * Problem 10 - Binary Search: Write a recursive and non-recursive method that
     * implements the
     * binary search algorithm to find and return the index of a given element in a
     * sorted array.
     */
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (low > high) {
                return -1;
            }
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid]) {
                low = mid + 1;
                // return binarySearchRecursiveHelper(arr, key, mid + 1, high);
            } else {
                high = mid - 1;
                // return binarySearchRecursiveHelper(arr, key, low, mid - 1);
            }
        }
        return -1; // Element not found
    }

    public static int binarySearchRecursiveHelper(int[] arr, int key, int low, int high) {
        // if (arr[low] == key) {
        // return low;
        // }
        // if (arr[high] == key) {
        // return high;
        // }
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (key > arr[mid]) {
            return binarySearchRecursiveHelper(arr, key, mid + 1, high);
        } else {
            return binarySearchRecursiveHelper(arr, key, low, mid - 1);
        }
        // else {
        // return binarySearchRecursiveHelper(arr, key, low + 1, high -1);
        // }
        // return binarySearchRecursiveHelper(arr, key, low + 1, high -1);

        // return -1;
    }

    // DO NOT EDIT! Work on the helper version above this method. This method is to
    // be used for testing purposes only.
    public static int binarySearchRecursive(int[] arr, int key) {
        return binarySearchRecursiveHelper(arr, key, 0, arr.length - 1); // Element not found
    }

}
