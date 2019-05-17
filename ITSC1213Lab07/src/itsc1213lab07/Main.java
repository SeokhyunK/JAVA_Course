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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vertex va=new Vertex(-0.5,0);
        Vertex vb=new Vertex(0.5,0);
        Vertex vc=new Vertex(0,0.866);
        Side sideA=new Side(va,vb);
        Side sideB=new Side(vb,vc);
        Side sideC=new Side(vc,va);
        Side[] sides={sideA,sideB,sideC};
        Triangle tri=new Triangle(sides);
        System.out.println("tri: "+tri.toString());
    }
    
}
