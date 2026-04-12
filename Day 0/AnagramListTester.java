public class AnagramListTester {

    public static void main(String[] args) {

        AnagramList words = new AnagramList();
        Word word1 = new Word("Dog");
        Word word2 = new Word("Apple");
        Word word3 = new Word("Cat");
        Word word4 = new Word("Pineapple");
        Word word5 = new Word("Flow");
        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);
        words.add(word5);
        words.searchAnagrams("wolf");

    }

}
