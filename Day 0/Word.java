import java.util.ArrayList;

public class Word {

    private String originalWord;
    private String sortedWord;

    public Word(String originalWord) {
        this.originalWord = originalWord;
        this.sortedWord = sortWord();
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getSortedWord() {
        return sortedWord;
    }

    public String sortWord() {

        String newWord = "";
        char[] letters = originalWord.toLowerCase().toCharArray();

        for (int i = 0; i < letters.length; i++) {

            int starting = i;

            for (int o = i + 1; o < letters.length; o++) {
                if (letters[o] < letters[starting]) {
                    starting = o;
                }
            }

            char temporary = letters[i];
            letters[i] = letters[starting];
            letters[starting] = temporary;
        }

        for (int index = 0; index < letters.length; index++) {
            newWord += letters[index];
        }

        return newWord;

    }

}
