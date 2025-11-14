public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a
     * comma and enclosing the output in square brackets [].
     *
     * @param array
     *              The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        String arrayString = "";
        for (int i = 0; i < array.length; i++) {
            arrayString += ", " + array[i];
        }
        if (arrayString.length() > 2) {
            arrayString = "[" + arrayString.substring(2) + "]";
        } else {
            arrayString = "[" + arrayString + "]";
        }
        //arrayString = "[" + arrayString.substring(2) + "]";
        
        
        System.out.println(arrayString);
        return arrayString;
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and
     * enclosing the output in square brackets [].
     *
     * @param array
     *              The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {

        String arrayNums = "";
        for (int i = 0; i < array.length; i++) {
            arrayNums += ", " + array[i];
        }
        if (arrayNums.length() > 2) {
            arrayNums = "[" + arrayNums.substring(2) + "]";
        } else {
            arrayNums = "[" + arrayNums + "]";
        }
        //arrayString = "[" + arrayString.substring(2) + "]";
        
        
        System.out.println(arrayNums);
        return arrayNums;
        //return "";
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array
     *              The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        int max = -50;
        for (int i = 0; i < array.length; i++) {
            if (array != null) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        //if 
        return max;
    }

    /**
     * The method returns the longest String in the array.
     * If two Strings share the longest length, the method will return the one that
     * appears first in the array.
     *
     * @param array
     *              The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        String longest = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].length() > longest.length()) {
                    longest = array[i];
                }
            }
            // if (array[i].length() > longest.length()) {
            //     longest = array[i];
            // }
        }
        //if 
        return longest;
        
        
        //return "";
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array
     *              The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        double average = 0.0;
        int total = 0;
        int divide = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                total += array[i].length();
                divide = divide + 1;
            } //else {
            //     divide = divide - 1;
            // }
            //total += array[i].length();
        }

        if (total == 0 && divide == 0) {
            return 0.0;
        } else {
            average = (double) total / divide;

        
            return average;
        }
        // average = (double) total / divide;

        
        // return average;
    }

    /**
     * Counts the number of times each letter appears in the given String.
     * The method creates an array of integers length 26, where each element
     * represents the
     * frequency of a letter in the alphabet. The first element (index 0) represents
     * the frequency of the letter 'a', the second element (index 1) represents the
     * frequency of the letter 'b', and so on.
     *
     * @param input
     *              The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input
     *         string.
     */
    public static int[] countLetterFrequencies(String input) {
        // int [] alphabet = new int[26];
        // for (int i = 0; i < input.length(); i++) {
        //     char letter = (char) i;
        //     if (input.charAt(i) == letter) {
        //         alphabet[i] += 1;
        //     }
        // }

        int [] alphabet = new int[26];

        if (input == null) {
            return new int[0];
        } else {
            int num = 64;
            for (int i = 0; i < 26; i++) {
                num = num + 1;
                char letter = (char) num;
                for (int j = 0; j < input.length(); j++) {
                    if (Character.toUpperCase(input.charAt(j)) == letter) {
                        alphabet[i] = alphabet[i] + 1;
                    }
                }
                // if (input.charAt(i) == letter) {
                //     alphabet[i] += 1;
                // }
            }
        
        
            //return new int[26];
            return alphabet;
        }

        // int num = 64;
        // for (int i = 0; i < 26; i++) {
        //     num = num + 1;
        //     char letter = (char) num;
        //     for (int j = 0; j < input.length(); j++) {
        //         if (Character.toUpperCase(input.charAt(j)) == letter) {
        //             alphabet[i] = alphabet[i] + 1;
        //         }
        //     }
        //     // if (input.charAt(i) == letter) {
        //     //     alphabet[i] += 1;
        //     // }
        // }
        
        
        // //return new int[26];
        // return alphabet;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by
     * one, and assigns a value of zero to the last element in the array.
     *
     * @param array
     *              The array of int values
     * @param index
     *              The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {
        //array[index] = array[index + 1];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        
        // String arrayNums = "";
        // for (int i = 0; i < array.length; i++) {
        //     arrayNums += ", " + array[i];
        // }
        // if (arrayNums.length() > 2) {
        //     arrayNums = "[" + arrayNums.substring(2) + "]";
        // } else {
        //     arrayNums = "[" + arrayNums + "]";
        // }
        // //arrayString = "[" + arrayString.substring(2) + "]";
        
        
        // System.out.println(arrayNums);
        // return arrayNums;
        //return int array [];
        // return new int[];
        return array;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array
     *              The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        } else {

            int [] finalArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                finalArray[i] = array[i];
            }
            for (int j = array.length; j < array.length * 2; j++) {
                finalArray[j] = 0;
            }

            //return new int[0];

            return finalArray;
        }
    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of
     * each
     * String in the array.
     * For example, if the array contained: {"Hello", "my", "name", "is", "Larry"},
     * then this method would return an array with the contents:
     * {"#0 Hello", "#1 my", "#2 name", "#3 is", "#4 Larry"}.
     *
     * @param array
     *              The array of Strings to modify
     * @return The modified array with the number symbol and element number added to
     *         each String
     */
    public static String[] addNumToStringArray(String[] array) {
        if (array == null) {
            return new String[0];
        } else {

            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = null;
                } else {
                    array[i] = "#" + i + " " + array[i];
                }
                // array[i] = "#" + i + " " + array[i];
            }
            return array;
            
            
            //return new String[0];
        }
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array
     *              The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            return new int[0];
        } else {
        
            int [] finalArray = new int[array.length];
            int num = array.length;
            for (int i = 0; i < array.length; i++) {
                num = num - 1;
                finalArray[i] = array[num];
            }
            
            return finalArray;
            
            //return new int[0];
        }
    }











}
