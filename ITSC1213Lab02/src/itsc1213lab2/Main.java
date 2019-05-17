/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab2;



/**
 *
 * @author seokhyun
 */
public class Main {
    
    public static int findMax (int[] aryNums) {
        int result=aryNums[0];
        
        for (int i=1; i<aryNums.length; i++) {
            if (aryNums[i]>aryNums[i-1]) {result=aryNums[i];}
        }
        return result;
    }
    public static double avgAry (int[] aryNums) {
        double result=(double)aryNums[0];
        
        for (int i=1; i<aryNums.length; i++) {
            result = result + aryNums[i];
        }
        result = result/aryNums.length;
        return result;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] testNums = {1,2,3,4,5,6,7,8,9,10};
        int[] negaNums = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        
        System.out.println("Max pos ints: " + findMax(testNums));
        System.out.println("Max neg ints: " + findMax(negaNums));
        System.out.println("Average of pos ints: " + avgAry(testNums));
    }
    
}
