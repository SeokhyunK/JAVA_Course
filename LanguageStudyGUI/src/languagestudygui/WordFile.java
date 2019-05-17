/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagestudygui;

/**
 *
 * @author seokhyun
 */import java.util.ArrayList;

/**
 *
 * @author seokhyun
 */
public class WordFile {
    //fields
    private String language;
    private String[] words;
    private int numWords;
    //getter
    public String getLanguage() {
        return language;
    }
    public String getWord(int i) {
        return words[i];
    }
    public int getNumWords() {
        return numWords;
    }
    
    public WordFile(String language, String[] words) {
        this.language=language;
        this.words=words;
        this.numWords=words.length;
    }
    //toString
    public String toString() {
        String result="";
        result +="Language: "+this.language+"\n";
        result +="Number of Words: "+this.numWords+"\n";
        return result;
    }
}
