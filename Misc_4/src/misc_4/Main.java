/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc_4;

import java.util.Scanner;

/**
 *
 * @author seokhyun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static String reverseStr(String str) {
        String tempStr=str;
        String result="";
        for (int i=1; i<= tempStr.length();i++) {
            result+=tempStr.charAt(str.length()-i);
        }
        return result;
    }
    static Scanner sc= new Scanner(System.in);

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter some input: ");
        String userInput="";
        
        userInput+=sc.nextLine();
        System.out.println(reverseStr(userInput));
    }
    
}
