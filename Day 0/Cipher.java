public class Cipher {

    public static String encode(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Cannot be null.");
        }

        String encoded = "";
        for (int i = 0; i < message.length(); i++) {
            encoded += encodeChar(message.charAt(i));
        }
        return encoded;
    }

    private static char encodeChar(char c) {
        // if ((c > 57 && c < 61) || c > 77) {
        // if (c < 41) {
        // return c;
        // }
        if ((c >= 'a' && c <= 'z')) {
            if (c > 'w') {
                return (char) (c - 23);
            } else {
                return (char) (c + 3);
            }
        }
        if ((c >= 'A' && c <= 'Z')) {
            if (c > 'W') {
                return (char) (c - 23);
            } else {
                return (char) (c + 3);
            }
        }
        return c;
    }

    public static String decode(String encodedMessage) {
        if (encodedMessage == null) {
            throw new IllegalArgumentException("Cannot be null.");
        }

        String decoded = "";
        for (int i = 0; i < encodedMessage.length(); i++) {
            decoded += decodeChar(encodedMessage.charAt(i));
        }
        return decoded;
    }

    private static char decodeChar(char c) {
        // if (c < 22 || c <> 77) {
        // return (char) (c + 22);
        // } else {
        // if (c < 41) {
        // return c;
        // }
        if (c >= 'A' && c <= 'Z') {
            if (c <= 'C') {
                return (char) (c + 23);
            } else if (c > 'C') {
                return (char) (c - 3);
            }
        }
        if ((c >= 'a' && c <= 'z')) {
            if (c <= 'c') {
                return (char) (c + 23);
            } else if (c > 'c') {
                return (char) (c - 3);
            }
        }
        return c;
        // return (char) (c - 3);
        // }
    }

    public static String compress(String message) {
        if (message == null) {
            throw new IllegalArgumentException("Cannot be null.");
        }
        if (message.equals("")) {
            return "";
        }
        String compressed = "";
        int num = 0;
        char letter = message.charAt(0);
        // char letter2 = message.charAt(1);
        // int num2 = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == letter) {
                num++;
            } else {
                compressed += "" + letter + num;
                letter = message.charAt(i);
                num = 1;
            }

            // if (i == message.length() - 1) {
            // compressed += "" + letter + num;
            // num2 += num;
            // if (num2 == message.length()) {
            // return compressed;
            // } else {
            // letter = letter2;
            // num = 0;
            // i = 0;
            // }

            // }
        }
        compressed += "" + letter + num;
        if (compressed.charAt(compressed.length() - 1) == '1') {
            compressed = compressed.substring(0, compressed.length() - 1);
        }
        return compressed;
    }

    public static String decompress(String compressedMessage) {
        if (compressedMessage == null || compressedMessage.length() <= 1) {
            throw new IllegalArgumentException("Cannot be null.");
        }
        String decompressed = "";
        // int letterAt = 0;
        int num = 0;
        char letter = compressedMessage.charAt(0);
        for (int i = 0; i < (compressedMessage.length()); i += 2) {
            letter = compressedMessage.charAt(i);
            num = 1;
            if (i < compressedMessage.length() - 1) {
                num = Integer.parseInt("" + compressedMessage.charAt(i + 1));
            }
            if (i < compressedMessage.length() - 2 && compressedMessage.charAt(i + 2) >= '0'
                    && compressedMessage.charAt(i + 2) <= '9') {
                num = Integer.parseInt("" + compressedMessage.charAt(i + 1) + compressedMessage.charAt(i + 2));
                i++;
            }
            if (num == 0) {
                throw new IllegalArgumentException("Number cannot be zero.");
            }
            for (int j = 0; j < num; j++) {
                decompressed += letter;
            }

        }
        return decompressed;
    }

}
