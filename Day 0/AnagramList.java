import java.util.ArrayList;
import java.util.AbstractList;

public class AnagramList extends AbstractList {

    private ArrayList<Word> wordList;

    public ArrayList<Word> getWordList() {
        return this.wordList;
    }

    public AnagramList() {
        this.wordList = new ArrayList<Word>();
    }

    public boolean add(Word word) {

        getWordList().add(word);
        return true;
    }

    public boolean checkAnagram(Word word1, Word word2) {
        if (word1.sortWord().equals(word2.sortWord())) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Word> searchAnagrams(String key) {
        ArrayList<Word> words = new ArrayList<Word>();
        for (int i = 0; i < getWordList().size(); i++) {
            if (checkAnagram(new Word(key), getWordList().get(i))) {
                words.add(getWordList().get(i));
            }
        }

        String arrayString = "";
        for (int i = 0; i < words.size(); i++) {
            arrayString += ", " + words.get(i);
        }
        if (arrayString.length() > 2) {
            arrayString = "[" + arrayString.substring(2) + "]";
        } else {
            arrayString = "[" + arrayString + "]";
        }

        System.out.println(arrayString);

        return words;
    }

    public int size() {
        return wordList.size();
    }

    public Object get(int index) {
        return wordList.get(index);
    }

    public void set() {

    }

    public void remove() {

    }

}
