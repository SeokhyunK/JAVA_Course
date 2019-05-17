/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab08;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 *
 * @author seokhyun
 */
public class Square implements Polygon{
    /*
public Triangle(Side[] sides) {
        super(3,sides);
    }
*/
    final int sideNum=4;
    Side[] sides = new Side[sideNum];
    public Side[] getSides() {
        return sides;
    }
    public void setSides(Side[] sides) {
        this.sides=sides;
    }
    public Square(Side[] sides) {
        setSides(sides);
    }
    
    public double computeArea() {
        double result=0;
        result=(sides[0].getLength())*(sides[1].getLength());
        return result;
    }
    public double computePerimeter() {
        double result=0;
        for(int i=0;i<sideNum;i++) {
            result+=sides[i].getLength();
        }
        return result;
    }

    public void movePoints(double delta_x, double delta_y) {
        for(int i=0; i<sideNum;i++) {
            getSides()[i].getV_Start().setX(getSides()[i].getV_Start().getX()+(delta_x));
            getSides()[i].getV_Start().setY(getSides()[i].getV_Start().getY()+(delta_y));
            getSides()[i].getV_End().setX(getSides()[i].getV_End().getX()+(delta_x));
            getSides()[i].getV_End().setY(getSides()[i].getV_End().getY()+(delta_y));
        }
    }

    
    public String toString() {
        String result="\n";
        
        for (int i=0; i<sideNum;i++) {
            result+="Side "+(i+1)+": ";
            result+="V_start:("+sides[i].getV_Start().getX()+","+sides[i].getV_Start().getY()+") V_end:("
                +sides[i].getV_End().getX()+","+sides[i].getV_End().getY()+") Length: "+sides[i].getLength()+"\n";
        }
        result+="Perimeter: "+computePerimeter()+"\n";
        result+="Area: "+computeArea()+"\n";
        return result;
    }

}
