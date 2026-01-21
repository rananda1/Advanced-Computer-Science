public class Unit4ExercisesTester {

    public static void main(String[] args) {

        int[] array1 = { 5, 6, 45, 99, 13, 5, 6 };

        System.out.println(Unit4Exercises.matchingEndSequences(array1, 2));

        int[] array2 = { 2, 1, 3, 5 };

        int[] array3 = { 1, 0, 1, 0, 0, 3, 1 };

        System.out.println(Unit4Exercises.hasThreeConsecutive(array2));

        System.out.println(Unit4Exercises.generateNumberSequence(5, 10));

        System.out.println(Unit4Exercises.fizzBuzz(1, 6));

        System.out.println(Unit4Exercises.moveEvenBeforeOdd(array3));

    }

}
