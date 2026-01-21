// import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        // to-do: implement the method
        int num = 0;
        for (int o = 0; o < n; o++) {
            if (nums[o] == nums[nums.length - n + o]) {
                num += 1;
            }
        }
        if (num == n) {
            return true;
        } else {
            return false;
        }

    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        // to-do: implement the method
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1 && nums[i - 1] == nums[i] - 2
                    && nums[i + 1] == nums[i] + 2) {
                num = 3;
            }
        }
        if (num == 3) {
            return true;
        } else {
            return false;
        }
        // i > 1 && i < nums.length - 2 &&

    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        // to-do: implement the method
        int num = -1;
        int[] array1 = new int[end - start];
        // for (int h = 0; h < end - start; h++) {
        for (int j = start; j < end; j++) {
            num += 1;
            array1[num] = j;
        }
        // }
        // return array1;

        // String arrayString = "";
        String array2 = "";
        for (int i = 0; i < array1.length; i++) {
            array2 += ", " + array1[i];
        }
        if (array2.length() > 2) {
            array2 = "[" + array2.substring(2) + "]";
        } else {
            array2 = "[" + array2 + "]";
        }
        System.out.println(array2);

        return array1;

    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        // to-do: implement the method

        String[] array1 = new String[end - start];
        int num = -1;
        int[] array2 = new int[end - start];
        for (int h = start; h < end; h++) {
            num += 1;
            array2[num] = h;
            if (array2[num] % 3 == 0 && array2[num] % 5 == 0) {
                array1[num] = "FizzBuzz";
            } else if (array2[num] % 3 == 0) {
                array1[num] = "Fizz";
            } else if (array2[num] % 5 == 0) {
                array1[num] = "Buzz";
            } else {
                array1[num] = "" + h;
            }
        }
        // if (array2[h] % 3 == 0) {
        // array1[h] = "Fizz";
        // } else if (array2[h] % 5 == 0) {
        // array1[h] = "Buzz";
        // } else {
        // array1[h] = "" + array2[h];
        // }

        String arrayString = "";
        for (int i = 0; i < array1.length; i++) {
            arrayString += ", " + array1[i];
        }
        if (arrayString.length() > 2) {
            arrayString = "[" + arrayString.substring(2) + "]";
        } else {
            arrayString = "[" + arrayString + "]";
        }

        System.out.println(arrayString);

        return array1;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // to-do: implement the method

        int num = -1;
        int evenNum = 0;
        int[] array1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // num += 1;
            if (nums[i] % 2 == 0) {
                num += 1;
                array1[num] = nums[i];
                evenNum += 1;
            }
        }
        int num2 = evenNum - 1;
        for (int e = 0; e < nums.length; e++) {
            // num2 += 1;
            if (nums[e] % 2 != 0) {
                num2 += 1;
                array1[num2] = nums[e];
            }
        }

        String arrayString = "";
        for (int i = 0; i < array1.length; i++) {
            arrayString += ", " + array1[i];
        }
        if (arrayString.length() > 2) {
            arrayString = "[" + arrayString.substring(2) + "]";
        } else {
            arrayString = "[" + arrayString + "]";
        }

        System.out.println(arrayString);

        return array1;
    }

    // ArrayList Methods

    // // Method 1: noNegatives
    // public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
    // // to-do: implement the method
    // return new ArrayList<>();

    // }

    // // Method 2: excludeTeenNumbers
    // public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums)
    // {
    // // to-do: implement the method
    // return new ArrayList<>();
    // }

    // // Method 3: appendY
    // public static ArrayList<String> appendY(ArrayList<String> strs) {
    // // to-do: implement the method
    // return new ArrayList<>();
    // }

    // // Method 4: squarePlus10
    // public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
    // // to-do: implement the method
    // return new ArrayList<>();
    // }

}