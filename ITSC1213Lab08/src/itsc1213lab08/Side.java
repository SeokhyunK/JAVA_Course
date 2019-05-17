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
public class Side {
    private Vertex v_start;
    private Vertex v_end;
    private double length;
    
    //constructor
    public Side(Vertex v_start, Vertex v_end) {
        this.v_start=v_start;
        this.v_end=v_end;
        double sx=v_start.getX();
        double sy=v_start.getY();
        double ex=v_end.getX();
        double ey=v_end.getY();
        this.length=sqrt(pow((sx-ex),2)+pow((sy-ey),2));
    }
    //getter setter
    
    public Vertex getV_Start() {
        return v_start;
    }
    public Vertex getV_End() {
        return v_end;
    }
    public double getLength() {
        return length;
    }
    public void setV_Start(Vertex v_start) {
        this.v_start=v_start;
    }
    public void setV_End(Vertex v_end) {
        this.v_end=v_end;
    }
    public void setLength(double length) {
        this.length=length;
    }
    
    public String toString() {
        String result="";
        result+="V_start:("+v_start.getX()+","+v_start.getY()+") V_end:("
                +v_end.getX()+","+v_end.getY()+") Length: "+length;
        return result;
    }
    
}
