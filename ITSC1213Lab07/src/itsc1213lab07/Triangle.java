/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab07;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 *
 * @author seokhyun
 */
public class Triangle extends Polygon {
    public Triangle(Side[] sides) {
        super(3,sides);
    }
    
    @Override
    public double computeArea() {
        double result=0;
        result=((sqrt(3)/4)*pow(sides[0].getLength(),2));
        return result;
    }
    @Override
    public String toString() {
        String result="";
        result=super.toString();
        result+="Area: "+computeArea()+"\n";
        return result;
    }
}
