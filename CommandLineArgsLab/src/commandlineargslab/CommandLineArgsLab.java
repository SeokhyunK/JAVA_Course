/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandlineargslab;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author seokhyun
 */
public class CommandLineArgsLab {
    static public double addUserInput() {
        double a=0, b=0, result;
        System.out.println("Please Enter two number");
        a=sc.nextDouble();
        b=sc.nextDouble();
        result=a+b;
        System.out.println(result);
        return result;
    }
    static public double addRandom() {
        final double rangeMin=0;
        final double rangeMax=100;
        double result;
        Random r= new Random();
        double randomValue1 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        double randomValue2 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        result=randomValue1+randomValue2;
        System.out.println(result);
        return result;
    }

    /**
     * @param args the command line arguments
     */
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        if ( args.length==1 && args[0].equals("--random" )) {
            addRandom();
        } else if ( args.length==1 && args[0].equals("--user-input")) {
            addUserInput();
        } else { // help
            System.out.println("Arguments:\n--random \nGenerates and adds two random numbers\n--user-input \nAsks the user for two numbers to add\n--help \nDisplays this message");
        }
    }
    
}
