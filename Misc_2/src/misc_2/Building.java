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
public class Building {
    private static int count;
    private String name;
    private Room[] rooms;
    
    public String getName() {
        return name;
    }
    public Room[] getRooms() {
        return rooms;
    }
    //cons
    public Building(String name, int numRooms) {
        this.name=name;
        rooms = new Room[numRooms];
        count++;
    }
    public Building(String name, Room[] rooms) {
        this.name=name;
        this.rooms=rooms;
        count++;
    }
    public int getCount() {
        return count;
    }
    
    public int getTotalNumPeople() {
        int result=0;
        for (int i = 0; i < rooms.length;i++) {
            result+=rooms[i].getNumPeople();
        }
        return result;
    }
    
}

