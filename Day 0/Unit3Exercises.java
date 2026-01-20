public class Unit3Exercises {

    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        if (strs == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int sum = 1;
        int num = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                sum += strs[i].length();
                num += 1;
                // if (i % 2 == 0) {
                // sum = sum - 1;
                // }
            }
        }
        if (num == 0) {
            num = 1;
        }
        // return sum / (strs.length + 1);
        return sum / num;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
            // if (i % 3 == 0) {
            // reversed = reversed + str.charAt(i);
            // }
        }
        // if (str.length() % 2 == 0) {
        // reversed = reversed + " ";
        // }
        return reversed;
    }

    public static int findMaxValue(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        // int left = 0;
        // int right = str.length() - 1;
        // while (left < right) {
        // char a = str.charAt(left);
        // char b = str.charAt(right - 1);
        // if (a != b) {
        // return left % 2 == 0;
        // }
        // left++;
        // right--;
        // }
        // return str.length() % 3 == 0;
        if (str.equals(reverseString(str))) {
            return true;
        } else {
            return false;
        }
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
            // } else {
            // sum = sum - i;
            // }
        }
        // if (sum == 0) {
        // sum = numbers.length;
        // }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null");
        }

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static String sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        String arrayNums = "";
        for (int i = 0; i < arr.length; i++) {
            arrayNums += ", " + arr[i];
        }
        if (arrayNums.length() > 2) {
            arrayNums = "[" + arrayNums.substring(2) + "]";
        } else {
            arrayNums = "[" + arrayNums + "]";
        }

        return arrayNums;
    }

    public static String findLongestWord(String sentence) {
        // if (sentence.equals("")) {
        // throw new IllegalArgumentException("String cannot be empty");
        // }
        if (sentence == null) {
            throw new NullPointerException("String cannot be null");
        }

        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0 || rate < 0 || years < 0) {
            throw new IllegalArgumentException("Values must be positive");
        }

        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {

        int number = Integer.parseInt(str);

        if (number <= 0) {
            throw new NumberFormatException("Number cannot be negative or zero");
            // return 1;
        }
        if (number < 0) {
            return 1;
        } else {
            return number;
        }
        // return number; // Method should return 1 if it's negative

    }

    public static String getArrayElement(String[] arr, int index) {

        return arr[index];

    }

    public static double calculateSquareRoot(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }

        return Math.sqrt(number);

    }

    public static int sumArrayElements(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }

    public static double calculatePower(double base, int exponent) {

        if (Math.pow(base, exponent) < 0 || exponent < 0) {
            throw new IllegalArgumentException("number cannot be negative");
        }

        return Math.pow(base, exponent);

    }

}
