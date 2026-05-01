
public class BinaryAndHexadecimalConversion {

    // Given an int, returns the binary representation of that int as a String
    // Precondition: num >= 0
    public static String convertIntToBinary(int num) {
        String binary = "";
        while (num >= 0) {
            if (num % 2 == 0) {
                binary += "0";
            } else {
                binary += "1";
            }
            num = num / 2;
        }
        return binary;
    }

    // Given a String of a binary representation of an int, returns that int
    // Precondition: binary string is not negative
    public static int convertBinaryToInt(String binary) {
        int mulitplyBy = 10;
        int num = 0;
        for (int i = 0; i < binary.length(); i++) {

        }
        return 0;
    }

    // Given an int, returns the hexadecimal representation of that int as a String
    // Precondition: num >= 0
    public static String convertIntToHexadecimal(int num) {
        return "";
    }

    // Given a String of a hexadecimal representation of an int, returns that int
    // Precondition: hexadecimal string is not negative
    public static int convertHexadecimalToInt(String hex) {
        return 0;
    }

    // Given a String of a hexadecimal representation of an int,
    // returns the String of the binary representation
    // Precondition: hexadecimal string is not negative
    public static String convertHexadecimalToBinary(String hex) {
        return "";
    }

    // Given a String of a binary representation of an int,
    // returns the String of the hexadecimal representation
    // Precondition: hexadecimal string is not negative
    public static String convertBinaryToHexadecimal(String binary) {
        return "";
    }

    // Converts the String representation of the number to an int.
    // If the String starts with 0b, then convert the rest of the String as if it
    // were binary.
    // If the String starts with 0x, then convert the rest of the String as if it
    // were hexadecimal.
    // If the String starts with neither, then convert the rest of the String as if
    // it were decimal.
    public static int convertStringToInt(String numString) {
        return 0;
    }
}
