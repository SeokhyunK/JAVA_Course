/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc;

/**
 *
 * @author seokhyun
 */
public class Main {
    //methods
    public static int[] randomArray() {
        int arySize = (int)(Math.random()*100000+1);
        int[] rdArray = new int [arySize];
        for (int i=0;i<rdArray.length;i++) {
            rdArray[i] = (int)(Math.random()*100+1);
        }
        return rdArray;
    }
    public static double computeAverage(int[] myArray) {
        double result=0;
        for (int i=0; i<myArray.length; i++) {
            result+=(double) myArray[i];
        }
        result=result/ (double)myArray.length;
        return result;
    }
    public static int findMaxIndex(int[] myArray) {
        int result=0;
        int iTemp=0;
        for (int i=0; i<myArray.length;i++) {
            if (iTemp<myArray[i]) {
                iTemp=myArray[i];
                result = i;
            }
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] myArray = randomArray();
        System.out.println(computeAverage(myArray));
        System.out.println(findMaxIndex(myArray));
        System.out.println(myArray[findMaxIndex(myArray)]);
    }
    
}
