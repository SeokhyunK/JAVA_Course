/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab1;
import javax.swing.*;

/**
 *
 * @author seokhyun
 */

public class HelloWorld {
    public static int sumForLoop (int[] numbers)
    {
        int result=0;
        for(int i=0; i<numbers.length;i++) {
            result += numbers[i];
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Hello, World!");
        System.out.println("Hello, World!");
        
        for (int i = 0; i<5;i++) {
            System.out.println("Welcome to ITSC1213");
        }
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumForLoop(intArray));
    }
    
}
