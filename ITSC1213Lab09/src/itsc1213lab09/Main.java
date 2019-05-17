/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab09;

import java.io.File;
import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author seokhyun
 */
public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static int addUserInput() {    
        int num1=0, num2=0, result;
        boolean checker = true;
        while(checker) {
            try {
                System.out.println("Please enter an integer.");
                num1=sc.nextInt();
                checker=false;
            }
            catch (Exception excpt) {
                System.out.println("Invalid input");
                sc.next();
            }
        }
        checker=true;
        while(checker) {
            try {
                System.out.println("Please enter a second integer.");
                num2=sc.nextInt();    
                checker=false;
            }
        
            catch (Exception excpt) {
                System.out.println("Invalid input");
                sc.next();
            }
        }
        result = num1+num2;
        System.out.println("The sum is: "+result);
        return result;
    }
    
    public static int divideUserInput() {
        
        int num1=0, num2=0, result=0;
        boolean checker= true;
        while(checker) {
            try {
                System.out.println("Please enter an integer.");
                num1=sc.nextInt();
                checker=false;
            }
            catch (ArithmeticException arithExcpt) {
                System.out.println("Invalid arithmetic.");
                
            }
            catch (InputMismatchException inputExcpt) {
                System.out.println("Invalid input.");
                sc.next();
            }
        }
        checker=true;
        while(checker) {
            try {
                System.out.println("Please enter an integer divisor.");
                num2=sc.nextInt();    
                result=num1/num2;
                checker=false;
            }
            catch (ArithmeticException arithExcpt) {
                System.out.println("Invalid arithmetic.");
                
            }
            catch (InputMismatchException inputExcpt) {
                System.out.println("Invalid input.");
                sc.next();
            }
        }
        System.out.println("The quotient is: "+result);
        return result;
    }
    ///////////////////////////////////////////////////////////////////////////
    
    
        
    
    public static int addFromFile(String filename) {
        int num1=0,num2=0; char c=',', tc;
        int sum=0;
        
        Scanner myScanner = null;
        File myFile = null;
        myFile = new File(filename);
        try {
            myScanner = new Scanner(myFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            String str="";
            while (myScanner.hasNext()) {
            str+=myScanner.nextLine();
            }
            String[] numArray = str.split("\\s*,\\s*");

            num1=Integer.parseInt(numArray[0]);
            num2=Integer.parseInt(numArray[1]);
            
            sum=num1+num2;
            System.out.println("The sum is: "+sum);
        //NumberFormatException
        
        } catch (NumberFormatException numFormatE) {
            System.out.println(numFormatE.getMessage());
        }
        
        return sum;
    }
    
    public static int divideFromFile(String filename) {
        int num1,num2;
        int result=0;
        try {
            
            
            File myFile = new File(filename);
            Scanner myScanner = new Scanner(myFile);
            
            try {
                num1=myScanner.nextInt();
                num2=myScanner.nextInt();
                
                result=num1/num2;
                System.out.println("The quotient is: "+result);
                
            } catch (NumberFormatException e1) {
                System.out.println("Number Format Exception");
            } catch (InputMismatchException e2) {
                System.out.println("Input Mismatch Exception");
            } catch (ArithmeticException e3) {
                System.out.println("Arithmethic Exception");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            //addUserInput();
            //divideUserInput();
            //addFromFile("myFileNum.txt");
            divideFromFile("myFileNum.txt");
            
    }
    
}
