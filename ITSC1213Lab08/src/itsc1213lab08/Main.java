/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab08;

import static java.lang.Math.sqrt;

/**
 *
 * @author seokhyun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Triangle
        Vertex va = new Vertex(0,0);
        Vertex vb = new Vertex(1,0);
        Vertex vc = new Vertex(1/2,sqrt(3)/2);
        
        Side sideA = new Side(va, vb);
        Side sideB = new Side(vb, vc);
        Side sideC = new Side(vc, va);
        
        Side[] sides1 = {sideA, sideB, sideC};
        Triangle tri = new Triangle(sides1);
        tri.movePoints(2,-5);
        System.out.println("tri: " + tri.toString());
        
        //Square
        Vertex vd = new Vertex(0,0);
        Vertex ve = new Vertex(1,0);
        Vertex vf = new Vertex(1,1);
        Vertex vg = new Vertex(0,1);
        
        Side sideD = new Side(vd, ve);
        Side sideE = new Side(ve, vf);
        Side sideF = new Side(vf, vg);
        Side sideG = new Side(vg, vd);
        
        Side[] sides2 = {sideD, sideE, sideF, sideG};
        Square sqr = new Square(sides2);
        sqr.movePoints(-2,-1);
        System.out.println("sqr: " + sqr.toString());
        
        //Hexagon
        Vertex vh = new Vertex(0.5,0);
        Vertex vi = new Vertex(1.5,0);
        Vertex vj = new Vertex(2,sqrt(3)/2);
        Vertex vk = new Vertex(1.5,sqrt(3));
        Vertex vl = new Vertex(0.5,sqrt(3));
        Vertex vm = new Vertex(0,sqrt(3)/2);
        
        Side sideH = new Side(vh, vi);
        Side sideI = new Side(vi, vj);
        Side sideJ = new Side(vj, vk);
        Side sideK = new Side(vk, vl);
        Side sideL = new Side(vl, vm);
        Side sideM = new Side(vm, vh);
        
        Side[] sides3 = {sideH, sideI, sideJ, sideK, sideL, sideM};
        Hexagon hex = new Hexagon(sides3);
        sqr.movePoints(-4,1);
        System.out.println("hex: " + hex.toString());
    }
    
}
