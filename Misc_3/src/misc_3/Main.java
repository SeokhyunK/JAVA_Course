/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc_3;

import static java.lang.Math.sqrt;

/**
 *
 * @author seokhyun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myAry = {5,4,3,2,1};
        for (int i=0;i<myAry.length;i++) {
            System.out.print(revAry(myAry)[i]);
        }
        System.out.println("\n-----------------");
        
        System.out.println(isPrimeNum(13));
        
    }
   
    //methods
    public static int[] revAry(int[] myAry) {
        int[] revAry = new int[myAry.length];
        
        for (int i=1; i<=myAry.length;i++) {
            revAry[i-1]=myAry[myAry.length-i];
        }
        
        return revAry;
    }
    public static boolean isPrimeNum(int num) {
        int checkNum = num;
        int lastDiv = num/2;
        if (checkNum<=1) {
            return false;
        }
        for (int i =2; i<=lastDiv;i++) {
            if ((checkNum%i)==0) return false;
                
        }
        return true;
    }
    
}
