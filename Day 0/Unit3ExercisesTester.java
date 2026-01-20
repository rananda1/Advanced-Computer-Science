public class Unit3ExercisesTester {

    public static void main(String[] args) {

        // Test Case - Main Case
        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge Case: Null element rray
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));

        // Test Case - Edge CAse: Null array
        try {
            letters = null;
            // expected output: 0
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
        }

        // Test Case - Main Case
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));

        int[] nums = { 1, 2, 3, 4, 5, 6 };
        int[] nums2 = null;
        int[] nums3 = { 3, 2, 5, 6, 1, 4 };

        System.out.println(Unit3Exercises.sumEvenNumbers(nums));

        System.out.println(Unit3Exercises.reverseString("race"));
        System.out.println(Unit3Exercises.isPalindrome("racecar"));

        System.out.println(Unit3Exercises.findLongestWord("word words"));

        // part 2

        System.out.println("part 2\n\n");

        System.out.println(Unit3Exercises.calculateSumOfSquares(nums));

        System.out.println(Unit3Exercises.getNthFibonacci(1));

        System.out.println(Unit3Exercises.sortArrayDescending(nums3));

        System.out.println(Unit3Exercises.findLongestWord("word words"));

        System.out.println(Unit3Exercises.calculateInterest(100.0, 10, 1));

        // part 3

        System.out.println("\npart 3\n\n");

        try {
            System.out.println(Unit3Exercises.parsePositiveInteger("-123"));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an intentional exception because the number was negative or zero");
        }

        try {
            System.out.println(Unit3Exercises.getArrayElement(letters, 10));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an intentional exception because the index was out of bounds");
        }

        try {
            System.out.println(Unit3Exercises.calculateSquareRoot(-3));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an intentional exception because the number was negative");
        }

        try {
            System.out.println(Unit3Exercises.sumArrayElements(nums2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The array cannot be null");
        }

        try {
            System.out.println(Unit3Exercises.calculatePower(10, 2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The official error is Double.NaN, because no real number can be returned");
        }

    }

}
