/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagestudygui;


import java.io.IOException;
import javax.swing.JFrame;
import static languagestudygui.WordFileReader.readWordFromFile;


/**
 *
 * @author seokhyun
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        String filename1="english.txt";
        String filename2="spanish.txt";
   
        WordFile engWord=readWordFromFile(filename1);
        WordFile spnWord=readWordFromFile(filename2);
      
        // Creates FlyDriveFrame and its components
        LanguageStudyGUI myWordQuiz = new LanguageStudyGUI(engWord,spnWord);
        myWordQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
    
        
        myWordQuiz.setVisible(true);
        
   }
    
}
