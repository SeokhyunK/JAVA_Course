/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab06;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author seokhyun
 */
public class BookChapterReadWrite {
    public static BookChapter loadBookChapterFromFile(String filename) 
    throws FileNotFoundException, IOException {
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        
        
        fileByteStream = new FileInputStream(filename);
        inFS = new Scanner(fileByteStream);
        //title
        String title = inFS.nextLine();
        //author
        String author = inFS.nextLine();
        //linsperpage
        int linePerPage = inFS.nextInt();
        
        ArrayList<String> lines = new ArrayList<String>();
        while (inFS.hasNext()) {
            
            lines.add(inFS.nextLine());
        }
        ArrayList<Page> pages = new ArrayList<Page>();
        
        int pCount=lines.size()/linePerPage;
        int rLines = lines.size()%linePerPage;
        
        for (int i=0;i<pCount;i++) {
            Page page= new Page(linePerPage);
            pages.add(page);
        }
        if (rLines != 0) {
            Page lastPage =new Page(rLines);
            pages.add(lastPage);
        }
        int lc=0;
        for (int i=0;i<pCount;i++) {
            for (int j=0;j<linePerPage;j++) {
                pages.get(i).getLines()[j]=lines.get(lc);
                lc++;
            }
        }
        for (int i=0;lc<lines.size();i++ ) {
            pages.get(pCount).getLines()[i]=lines.get(lc);
            lc++;
        }
        
        
        BookChapter bookChapter = new BookChapter(linePerPage,pages,title,author);
        
        fileByteStream.close();
        inFS.close();
        return bookChapter;
    }
    
    public static void writeBookChapterToFile(BookChapter book, String filename) 
    throws FileNotFoundException, IOException {
        FileOutputStream fileByteStream = null;
        PrintWriter outFS = null;
        
        fileByteStream = new FileOutputStream(filename);
        outFS=new PrintWriter(fileByteStream);
        
        outFS.println(book.getTitle());
        
        outFS.println(book.getAuthor());
        
        outFS.print(book.getLinesPerPage());
        
        
        for (int i = 0; i < book.getPages().size();i++) {
            for (int j=0;j<book.getPages().get(i).getLines().length;j++) {
                
                outFS.println(book.getPages().get(i).getLines()[j]);
                
            }
        }
        outFS.close();
    }
    
}
