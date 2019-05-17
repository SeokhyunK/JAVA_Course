/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab3​;

import java.util.Scanner;

/**
 *
 * @author seokhyun
 */
public class Main {
    static Scanner sc= new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-------------------\nStep1\n-------------------");
        
        BankAccount bankAccount1 = new BankAccount(12345,100000);
        System.out.println("result of the object's getId() method: "+bankAccount1.getId());
        System.out.println("result of the object's getBalance() method: "+bankAccount1.getBalance());
        bankAccount1.setBalance(999999);
        System.out.println("result of the object's getBalance() method: "+bankAccount1.getBalance());
        System.out.println("result of the object’s toString() method: "+bankAccount1.toString());
        
        System.out.println("-------------------\nStep2\n-------------------");
        
        ATM atm=new ATM(bankAccount1);
        System.out.println(atm.getAccountInformation());
        System.out.println(atm.getBalance());
        atm.withdraw(99999);
        System.out.println(atm.getBalance());
        atm.deposit(87654);
        System.out.println(atm.getBalance());
        
        BankAccount bankAccount2 = new BankAccount(54321,200000);
        atm.setAccount(bankAccount2);
        System.out.println(atm.getAccountInformation());
        
        System.out.println("-------------------\nStep3\n-------------------");
        
        
        BankAccount bankAccount3 = new BankAccount(1234,1000);
        ATM atm3 = new ATM(bankAccount3);
        printOptions();
        
        int choice=0;
        while (4!=choice) {
            
            if (sc.hasNextInt()==true) {
                choice=sc.nextInt();
                if (choice == 1||choice==2||choice==3||choice==4) {
                    handleSelection(choice,atm3);
                    
                } else {
                    System.out.println("Please enter correct option number");
                    

                }
                   
            }
            else {
                System.out.println("Please enter correct option as an integer");
                sc.next();
            }
            printOptions();
            
        }
        
    }
    //Methods
    public static void printOptions() {
        System.out.println("1. Get account balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Quit");
    }
    public static void handleSelection(int choice, ATM atm3) {
        double dTemp=0;
        
        switch (choice) {
            case 1:
                System.out.println("Account balance: "+atm3.getBalance());
                break;
            case 2:
                System.out.println("Withdraw selected. How much would you like to withdraw?");
                
                if (sc.hasNextDouble()==true) {
                    dTemp=sc.nextDouble();
                    if (dTemp > 0 && dTemp<atm3.getBalance() ) {
                        atm3.withdraw(dTemp);
                } else {
                        System.out.println("Withdraw cancelled. Please enter a number greater than 0 and less than the acocunt balance "+atm3.getBalance());
                            
                }
            }
            else {
                System.out.println("Please enter amount using numbers");
            }
                break;
            case 3:
                System.out.println("Deposit selected. How much would you like to deposit?");
                
                if (sc.hasNextDouble()==true) {
                    dTemp=sc.nextDouble();
                    if (dTemp > 0) {
                        atm3.deposit(dTemp);
                } else {
                    System.out.println("Deposit cancelled. Please enter a number greater than 0");
                }
            }
            else {
                System.out.println("Please enter amount using numbers");
                sc.next();
            }
                break;
            case 4:
                sc.close();
                break;
            }
    }
}
