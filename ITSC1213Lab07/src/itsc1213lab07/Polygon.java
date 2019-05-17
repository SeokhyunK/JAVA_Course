/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab07;

/**
 *
 * @author seokhyun
 */
public abstract class Polygon {
    protected int numSides;
    protected Side[] sides;
    
    //constructor
    public Polygon(int numSides, Side[] sides) {
        this.numSides=numSides;
        this.sides=sides;
    }
    //methods
    public double computePerimeter() {
        double result=0;
        for(int i=0;i<numSides;i++) {
            result+=sides[i].getLength();
        }
        return result;
    }
    public abstract double computeArea();
    
    //getter setter
    public int getNumSides() {
        return numSides;
    }
    public Side[] getSides() {
        return sides;
    }
    public void setNumSides(int numSides) {
        this.numSides=numSides;
    }
    public void setSides(Side[] sides) {
        this.sides=sides;
    } 
    
    public String toString() {
        String result="\n";
        for (int i=0; i<numSides;i++) {
            result+="Side "+(i+1)+": ";
            result+="V_start:("+sides[i].getV_Start().getX()+","+sides[i].getV_Start().getY()+") V_end:("
                +sides[i].getV_End().getX()+","+sides[i].getV_End().getY()+") Length: "+sides[i].getLength()+"\n";
            
        }
        
        return result;
    }
    
}
