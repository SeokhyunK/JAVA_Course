/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misc_2;

/**
 *
 * @author seokhyun
 */
public class Room {
    private static int count;
    private int numPeople;
    private int number;
    
    public Room(int numPeople, int number) {
        this.numPeople = numPeople;
        this.number = number;
        count++;
    }
    public int getCount() {
        return count;
    }
    
    public int getNumPeople() {
        return numPeople;
    }
    public int getNumber() {
        return number;
    }
}
