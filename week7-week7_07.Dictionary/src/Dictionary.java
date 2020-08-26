/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Evan
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {

    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.dictionary.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();
        for(String key: this.dictionary.keySet()){
            String value = this.dictionary.get(key);
            String translation = key + " = " +  value;
            translationList.add(translation);
        }
        return translationList;
    }

}
