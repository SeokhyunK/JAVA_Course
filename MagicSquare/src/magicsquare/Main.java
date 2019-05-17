/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

import java.io.IOException;
import static magicsquare.NumberReader.readNumberFromFile;

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
        int numberSet[][];
        numberSet=readNumberFromFile("MagicSquareNumbers.txt");
        MagicSquareDetector msDetector = new MagicSquareDetector(numberSet);
        MagicSquare magicSquare = null;
        if (msDetector.isMagicSquare()) {
            magicSquare=new MagicSquare(msDetector.getTestSquare(),
                    msDetector.getConstNum(),msDetector.getMsOrder());
            System.out.println(magicSquare.toString());
        }
        else {
            System.out.println("the given set of numbers is not a magic square.");
            System.out.println("Please check your numbers and try again.");
        }
    }
    
}
