public class Unit3Exercises {

    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
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
        if (str == reverseString(str)) {
            return true;
        } else {
            return false;
        }
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
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

}
