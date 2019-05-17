/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab3;

/**
 *
 * @author seokhyun
 */
public class BankAccount {
    final private int id;
    private double balance;
    
    public BankAccount(int id, double initialBalance) {
        this.id=id;
        this.balance=initialBalance;
    }
    public int getId() {
        return this.id;
    }
    public void setBalance(double balance) {
        this.balance=balance;
    }
    public double getBalance() {
        return this.balance;
    }
    public String toString() {
        String result="";
        result += "Account ID: ";
        result += id;
        result += " Balance: ";
        result += balance;
        //format “Account ID: * Balance: *”, 
        //where * are the id and balance members
        return result;
    }
    
    
}
