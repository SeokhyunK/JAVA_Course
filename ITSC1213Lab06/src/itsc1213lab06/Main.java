/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab06;

import static itsc1213lab06.BookChapterReadWrite.*;

import java.io.IOException;





/**
 *
 * @author seokhyun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BookChapter book;
        
        String filename = "game_of_thrones_chapter_1.txt";
        book = loadBookChapterFromFile(filename);
        System.out.println(book.toString());
        String wFileName = "this is copy.txt";
        writeBookChapterToFile(book,wFileName);
        
    }
    
}
