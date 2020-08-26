/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author Evan
 */
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class WordInspection {

    private File file;
    private Scanner reader;
    private List<String> words;
    private String vowels = "aeiouyäö";

    public WordInspection(File file) throws FileNotFoundException {
        this.file = file;
        this.words = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");

        while (this.reader.hasNextLine()) {
            this.words.add(reader.nextLine());
        }
        reader.close();

    }

    public int wordCount() throws Exception {
        return this.words.size();
    }

    public List<String> wordsContainingZ() {
        List<String> zWords = new ArrayList<String>();
        for (String word : this.words) {
            if (word.contains("z")) {
                zWords.add(word);
            }
        }
        return zWords;
    }

    public List<String> wordsEndingInL() {
        List<String> lWords = new ArrayList<String>();
        for (String word : this.words) {
            if (word.endsWith("l")) {
                lWords.add(word);
            }
        }
        return lWords;
    }

    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>(); //return list
        String reversed;                                    //variable to hold reversed string
        for (String word : this.words) {
            reversed = "";
            for (int i = (word.length() - 1); i >= 0; i--) {
                reversed += word.charAt(i);
            }
            if (word.equals(reversed)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> vowelWords = new ArrayList<String>();
        for (String word : this.words) {
            if(containsAllVowels(word)){
                vowelWords.add(word);
            }
        }
        return vowelWords;
    }

    private boolean containsAllVowels(String word) {
        String iChar;
        for (int i = 0; i < this.vowels.length(); i++) {
            iChar = "" +vowels.charAt(i);
            if (!word.contains(iChar)) {
                return false;
            }
        }
        return true;
    }

}
