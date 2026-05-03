
public class BinaryAndHexadecimalConversion {

    // Given an int, returns the binary representation of that int as a String
    // Precondition: num >= 0
    public static String convertIntToBinary(int num) {
        if (num == 0) {
            return "0";
        }
        String binary = "";
        while (num > 0) {
            if (num % 2 == 0) {
                binary = "0" + binary;
            } else {
                binary = "1" + binary;
            }
            num = num / 2;
        }
        return binary;
    }

    // Given a String of a binary representation of an int, returns that int
    // Precondition: binary string is not negative
    public static int convertBinaryToInt(String binary) {
        int multiplyBy = 1;
        int num = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            num += (binary.charAt(i) - '0') * multiplyBy;
            multiplyBy *= 2;
        }
        return num;
    }

    // Given an int, returns the hexadecimal representation of that int as a String
    // Precondition: num >= 0
    public static String convertIntToHexadecimal(int num) {
        if (num == 0) {
            return "0";
        }
        String hexadecimal = "";
        while (num > 0) {
            if (num % 16 >= 10) {
                hexadecimal = (char) ('A' + ((num % 16) - 10)) + hexadecimal;
            } else {
                hexadecimal = (num % 16) + hexadecimal;
            }
            num = num / 16;
        }
        return hexadecimal.toLowerCase();
    }

    // Given a String of a hexadecimal representation of an int, returns that int
    // Precondition: hexadecimal string is not negative
    public static int convertHexadecimalToInt(String hex) {
        int multiplyBy = 1;
        int num = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            // if (hex.charAt(i) - '0' > 9) {
            // if (hex.charAt(i) >= 'A') {
            // num += ((int) (hex.charAt(i) - 'A' + 10)) * multiplyBy;
            // } else if (hex.charAt(i) >= 'a') {
            // num += ((int) (hex.charAt(i) - 'a' + 10)) * multiplyBy;
            // } else {
            // num += (hex.charAt(i) - '0') * multiplyBy;
            // }
            if (hex.charAt(i) <= '9') {
                num += (hex.charAt(i) - '0') * multiplyBy;
            } else if (hex.charAt(i) <= 'F') {
                num += ((int) (hex.charAt(i) - 'A' + 10)) * multiplyBy;
            } else {
                num += ((int) (hex.charAt(i) - 'a' + 10)) * multiplyBy;
            }
            multiplyBy *= 16;
        }
        return num;

    }

    // Given a String of a hexadecimal representation of an int,
    // returns the String of the binary representation
    // Precondition: hexadecimal string is not negative
    public static String convertHexadecimalToBinary(String hex) {
        return convertIntToBinary(convertHexadecimalToInt(hex));
    }

    // Given a String of a binary representation of an int,
    // returns the String of the hexadecimal representation
    // Precondition: hexadecimal string is not negative
    public static String convertBinaryToHexadecimal(String binary) {
        return convertIntToHexadecimal(convertBinaryToInt(binary));
    }

    // Converts the String representation of the number to an int.
    // If the String starts with 0b, then convert the rest of the String as if it
    // were binary.
    // If the String starts with 0x, then convert the rest of the String as if it
    // were hexadecimal.
    // If the String starts with neither, then convert the rest of the String as if
    // it were decimal.
    public static int convertStringToInt(String numString) {
        if (numString.toLowerCase().substring(0, 2).equals("0b")) {
            return convertBinaryToInt(numString.substring(2));
        } else if (numString.toLowerCase().substring(0, 2).equals("0x")) {
            return convertHexadecimalToInt(numString.substring(2));
        } else {
            return Integer.parseInt(numString);
        }
    }
}
