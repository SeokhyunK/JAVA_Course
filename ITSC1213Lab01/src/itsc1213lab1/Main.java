/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab1;
import java.util.Scanner;


/**
 *
 * @author seokhyun
 */
public class Main {
    //methods
    public static boolean stringEqual(String a, String b)
    {
        boolean result=false;
        int iResult=0;
        if (a.length()==b.length()) {
            iResult = 1;
            for (int i=0;i<a.length();i++) {
                if (a.charAt(i)==b.charAt(i))
                    iResult *= iResult;
                else {
                    iResult = 0;
                }
            }
        }
        if (iResult == 1) {
            result = true;
        }
        return result;
    }
    public static int sumUserInput()
    {
        Scanner input = new Scanner (System.in);
        int num1=0;
        int num2=0;
        
        System.out.println("Please enter a number : ");
        Loop1: while (true) {
            if (input.hasNextInt() == true) {
                num1 = input.nextInt();
                if (num1>0) {
                    
                    break Loop1;
                    
                } 
                else {
                    System.out.println("Not a valid number. Try again");
                    //input.next();
                    //System.out.println("done input next test");
                }
            } 
            else{
                System.out.println("Not a valid number. Try again");
                input.next();
            }
        }
        
        System.out.println("Please enter a second number.");
        Loop2: while (true) {
            if (input.hasNextInt() == true) {
                num2 = input.nextInt();
                if (num2>0) {
                    break Loop2;
                } else {
                    System.out.println("Not a valid number. Try again");
                    //input.next();
                }
            } else{
            System.out.println("Not a valid number. Try again");
            input.next();
            }
        }
        System.out.println("sumUserInput returns : ");
        return num1+num2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "Welcome to Java";
        String b = "Welcome to Java";
        System.out.println(stringEqual(a,b));
        b = "Welcomt to C";
        System.out.println(stringEqual(a,b));
        System.out.println(sumUserInput());
        
    }
    
}
