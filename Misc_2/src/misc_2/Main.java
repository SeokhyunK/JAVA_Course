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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Room room1 = new Room(4,4);
        Room room2 = new Room(5,5);
        
        Room[] rooms = new Room[2];
        rooms[0]=room1;
        rooms[1]=room2;
        
        Building buildRoom = new Building("myRoom",rooms);
        
        
        
    }
    
}

