/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab04;

/**
 *
 * @author seokhyun
 */
public class Item {
    private String name;
    private double price;
    
    //Constructor
    public Item(String n, double p) {
        name=n;
        price=p;
    }
    //Methods
    //name getter
    public String getName() {
        return name;
    }
    //price getter
    public double getPrice() {
        return price;
    }
    //name setter
    public void setName(String n) {
        name=n;
    }
    //price setter
    public void setPrice(double p) {
        price=p;
    }
    //toString: “*name*: *price*” where *name* and *price*
    public String toString() {
        String result="";
        result=getName()+": "+getPrice();
        return result;
    }
}
