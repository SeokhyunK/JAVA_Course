/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author seokhyun
 */
public class Transaction {
    private ArrayList<Item> alItems;
    
    private double subTotal;
    private double tax;
    private double total;
    private double change;
    private ArrayList<Payment> pays= new ArrayList<Payment>();
    
    //Contructor
    public Transaction(ArrayList<Item> items) {
        alItems=items;
    }
    //getter alItems
    public ArrayList<Item> getItems() {
        return alItems;
    }
    //setter alItems
    public void setItems(ArrayList<Item> items) {
        alItems=items;
    }
    
    //getter subTotal
    public double getSubTotal() {
        return subTotal;
    }
    //getter tax
    public double getTax() {
        return tax;
    }
    //getter total
    public double getTotal() {
        return total;
    }
    //getter change
    public double getChange() {
        return change;
    }
    //setter subTotal
    public void setSubTotal(double st) {
        subTotal=st;
    }
    //setter tax
    public void setTax(double tx) {
        tax=tx;
    }
    //setter total
    public void setTotal(double tl) {
        total=tl;
    }
    //setter change
    public void setChange(double ch) {
        change=ch;
    }
     //Methods with Transaction
    public double computeSubTotal() {
        setSubTotal(0);
        for(int i=0;i<getItems().size();i++) {
            setSubTotal(getSubTotal()+getItems().get(i).getPrice());
        }
        return getSubTotal();
    }
    public double computeTax() {
        setTax(0);
        setTax((computeSubTotal())*(0.08));
        return getTax();
    }
    public double computeTotal() {
        setTotal(0);
        setTotal((computeTax())+(getSubTotal()));
        return getTotal();
    }
    
    //getter for payments
    public ArrayList<Payment> getPayments() {
        return pays;
    }
    
    //Methods with Payment
    public void takePayment() {
        Scanner sc=new Scanner(System.in);
        pays.clear();
        double totalPaid=0;
        double paid;
        Payment pay = null;
        
        int choice;
        System.out.println("Your Total is :"+total);
        while(totalPaid<total) {
            choice=0;
            paid=0;
            while(true) {
                System.out.println("Please enter payment type");
                System.out.println("1. Cash\n2. Debit card\n3. Credit card\n4. Check");
                choice=(int)sc.nextDouble();
                if(choice>=1&&choice<=4) break;
                System.out.println("Please enter type number 1 to 4");
            }
            
            while (true) {
                System.out.println("Enter the amount to pay with this type");
                paid=sc.nextDouble();
                if (paid>0) break;
                System.out.println("Please enter amount greater than 0");
            }
            if (choice==1) pay = new Payment(PaymentType.CASH,paid);
            if (choice==2) pay = new Payment(PaymentType.DEBIT_CARD,paid);
            if (choice==3) pay = new Payment(PaymentType.CREDIT_CARD,paid);
            if (choice==4) pay = new Payment(PaymentType.CHECK,paid);
            pays.add(pay);
            totalPaid+=paid;
            if(totalPaid>total) break;
            System.out.println("Remaining total is "+(total-totalPaid));
        }
        setChange(totalPaid-total);
    }
}
