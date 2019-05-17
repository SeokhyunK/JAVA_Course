/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author seokhyun
 */
public class NumberReader {
    public static int[][] readNumberFromFile(String filename) 
    throws FileNotFoundException, IOException {
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        int result[][];
        
        fileByteStream = new FileInputStream(filename);
        inFS = new Scanner(fileByteStream);
        //title
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int num;
        while (inFS.hasNextInt()) {
            num=inFS.nextInt();
            nums.add(new Integer(num));
            }
        double msSize = sqrt(nums.size());
        result=new int[(int)msSize][(int)msSize];
        int counter=0;
        for (int i=0; i<msSize; i++) {
            for (int j=0;j<msSize; j++) {
                result[i][j]=nums.get(counter);
                counter+=1;
            }
        }
        
        return result;
        }
    }

