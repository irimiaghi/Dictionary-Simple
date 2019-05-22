package com.company;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    Map<String, Words> listWords = new HashMap<String, Words>();

    public void addListEnhanced (String word, String translation, String opposite, Boolean overwrite) throws Error {
        if(word.trim().length() == 0 || translation.trim().length() == 0) {
            throw new Error("There has been an error!");
        }

        Words newWord = new Words(word, translation, opposite);
        Words oldWord = this.listWords.put(word, newWord);
        if(!overwrite && oldWord != null) {
            this.listWords.put(word, oldWord);
        }
    }

    public Words removeListEnhanced (String word) {
        return this.listWords.remove(word);
    }

    public Words findList (String word) {
        return this.listWords.get(word);
    }
    /*
    public boolean addList (String word, String translation, String opposite) {
        if(this.listWords.containsKey(word)) {
            return false;
        }
        this.listWords.put(word, new Words(word, translation, opposite));
        return true;
    }
    public boolean removeList (String word) {
        if(!this.listWords.containsKey(word)) {
            return false;
        }
        this.listWords.remove(word);
        return true;
    }
    */
}
