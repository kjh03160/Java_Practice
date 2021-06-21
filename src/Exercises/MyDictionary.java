package Exercises;

import java.util.HashMap;
import java.util.Locale;

public class MyDictionary {
    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("Movie", "영화");
        dictionary.addWord("cat", "고양이");
        dictionary.addWord("Dog", "개");
        dictionary.addWord("book", "책");
        dictionary.addWord("soap", "비누");
        dictionary.addWord("Glasses", "안경");

        System.out.println(dictionary.find("Book"));
        System.out.println(dictionary.find("glasses"));
    }
}

class WordDictionary {
    private HashMap<String, String> WordNoteBook;

    public WordDictionary(){
        WordNoteBook = new HashMap<>();
    }
    public void addWord(String english, String korean){
        this.WordNoteBook.put(english.toLowerCase(), korean);
    }

    public String find(String english){
        return this.WordNoteBook.get(english.toLowerCase());
    }
}