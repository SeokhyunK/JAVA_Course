/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagestudygui;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class WordFileReader {
    public static WordFile readWordFromFile(String filename) 
    throws FileNotFoundException, IOException {
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        
        
        fileByteStream = new FileInputStream(filename);
        inFS = new Scanner(fileByteStream);

        String language=filename.substring(0, filename.length()-4);
        
        ArrayList<String> words = new ArrayList<String>();
        while (inFS.hasNext()) {
            
            words.add(inFS.nextLine());
        }
        String[] sWords=new String[words.size()];
        for (int i=0;i<words.size();i++) {
            sWords[i]=words.get(i);
        }
        
        
        WordFile wordFile= new WordFile(language, sWords);
        
        fileByteStream.close();
        inFS.close();
        
        
        
        return wordFile;
    }
}
    