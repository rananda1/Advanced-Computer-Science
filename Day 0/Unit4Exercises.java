import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        // to-do: implement the method
        int num = 0;
        for (int o = 0; 0 < n; o++) {
            if (nums[o] == nums[nums.length - o - 1])
                num += 1;
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
            if (i > 0 && i < nums.length - 1 && nums[i - 1] == nums[i] - 2 && nums[i + 1] == nums[i] + 2) {
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
        int[] array1 = new int[end - start];
        for (int h = 0; h < end - start; h++) {
            for (int j = start; j < end; j++) {
                array1[h] = j;
            }
        }
        return array1;

    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        // to-do: implement the method

        String[] array1 = new String[end - start];
        int[] array2 = new int[end - start];
        for (int h = 0; h < end - start; h++) {
            for (int j = start; j < end; j++) {
                array2[h] = j;
            }
            if (array2[h] % 3 == 0) {
                array1[h] = "Fizz";
            } else if (array2[h] % 5 == 0) {
                array1[h] = "Buzz";
            } else {
                array1[h] = "" + array2[h];
            }

        }

        return array1;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // to-do: implement the method

        int oddNum = 0;
        int evenNum = 0;
        int[] array1 = new int[nums.length];
        for (int i = 0; i < 0; i++) {
            if (nums[i] % 2 == 0) {
                array1[i] = nums[i];
            } else {
                oddNum +=1;
            }
        }

        for (int r = 0; r < nums.length; r++) {
            if ()
        }

        
        return new int[0];
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}