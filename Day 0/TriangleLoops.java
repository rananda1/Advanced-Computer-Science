public class TriangleLoops {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        System.out.println(createLetterTriangleUp(3, 'A'));
        System.out.println(createLetterTriangleUp(15, 'B'));

    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        //int i = 0;
        //while (i < numberOfRows) {
            //i = i + 1;
            //for (int j = 0; j < i; j++) {
                //String triangle = "" + letter;
                //letter = letter + letter
            //}
            //String triangle = "" + i;
            //return triangle;
        //}

        String triangle = "";
        String finalLetter = "";
        for (int i = 0; i < numberOfRows; i++) {
            finalLetter = "" + finalLetter + letter;
            triangle = triangle + finalLetter;
            triangle = triangle + "\n";
        }
        return triangle;
    
    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        
        String triangle = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = numberOfRows; j > i; j--) {
                triangle = triangle + letter;
            }

            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        String numTriangle = "";
        String finalNumber = "";
        for (int i = 0; i < numberOfRows; i++) {
            
            //numTriangle = "" + (i + 1) + 
            finalNumber = (finalNumber + (i + 1)) + " ";
            numTriangle = "" + numTriangle + finalNumber;
            //finalLetter = "" + finalLetter + letter;
            //numTriangle = numTriangle + finalNumber;
            numTriangle = numTriangle + "\n";
        }
        return numTriangle;
        
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        
        String alphabetTriangle = "";
        for(int i = 0; i < numberOfRows; i++) {
	        String spaces = "";
            String ascendingLetters = "";
            String descendingLetters = "";
            //String alphabetTriangle = "";
            // for(int j = numberOfRows; j > i; j--) {
		    //     spaces = spaces + "*"; // spaces
	        // }
	        for(int l = numberOfRows; l > numberOfRows - i; l--) {
		        ascendingLetters = ascendingLetters + (char) ('A' + (numberOfRows - l));
                // ascending letters
	        }
	        // for(int f = numberOfRows; f > i; f--) {
		    //     descendingLetters = descendingLetters + (char) ('A' + (f - 1));
            //     // descending letters
	        // }
            alphabetTriangle += "" + spaces + ascendingLetters + descendingLetters + "\n";

        }
        return alphabetTriangle;










        // String triangle = "";
        // return triangle;


        // String triangle = "";
        // String spaces = "";
        // String firstHalf = "";
        // for (int i = 0; i < numberOfRows; i++) {
        //     firstHalf = "" + 'A' +

        // }
        // (char) ('A' + (j - 1)) //this is for the last half of triangle 



        // for (int j = i; j > 0; j--) {
        //     s += (char) ('A' + (j - 1));
        // }
    }










}