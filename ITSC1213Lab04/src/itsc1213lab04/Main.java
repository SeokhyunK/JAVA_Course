/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab04;

import java.util.ArrayList;

/**
 *
 * @author seokhyun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------------Part1------------");
        /*
        Part1: Create three Item Objects abd create an ArrayList of Item, add in it.
        Create Transaction Object and set its member to the ArrayList, 
        print out the info by toString() that is stored in member of ArrayList
        */
        
        Item grape = new Item("Grape",5);
        Item apple = new Item("Apple",3);
        Item orange = new Item("Orange",7);
        ArrayList<Item> fruits = new ArrayList<Item>();
        fruits.add(grape);
        fruits.add(apple);
        fruits.add(orange);
        Transaction trItems = new Transaction(fruits);
        
        for (int i=0;i<trItems.getItems().size();i++) {
            System.out.println(trItems.getItems().get(i).toString());
        }
        
        System.out.println("------------Part2------------");
        /*
        Part2: Create Receipt class and Transaction Method
        */
        Receipt rcTrans = new Receipt(trItems);
        System.out.println(trItems.computeSubTotal());
        System.out.println(trItems.computeTax());
        System.out.println(trItems.computeTotal());
        
        System.out.println("------------Part3------------");
        /*
        Part3: Create getReceiptString() method.
        */
        
        System.out.println(rcTrans.getReceiptString());
        System.out.println("------------Part4------------");
        /*
        Part4: 
        */
        trItems.computeTotal();
        trItems.takePayment();
        System.out.println(rcTrans.getReceiptString());
        
    }
    
}
