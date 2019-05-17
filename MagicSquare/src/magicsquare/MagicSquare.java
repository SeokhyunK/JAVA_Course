/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

/**
 *
 * @author seokhyun
 */
public class MagicSquare {
    private int[][] nums;
    private int constNum;
    private int msOrder;
    
    public MagicSquare(int[][] nums, int constNum, int msOrder) {
        this.nums=nums;
        this.constNum=constNum;
        this.msOrder=msOrder;
    }
    @Override
    public String toString() {
        
        String result="";
        result+="set of numbers: ";
        for (int i=0; i<msOrder;i++) {
            for (int j=0; j<msOrder;j++) {
                result+=nums[i][j];
                if(i<msOrder-1 || j<msOrder-1) result+=" ";
            }
        }
        result+="\nmagic constant: "+constNum+"\n";
        result+="Order of the magic square: "+msOrder+" * "+msOrder+" square"+"\n";
        for (int i=0; i<msOrder;i++) {
            for (int j=0; j<msOrder;j++) {
                
                result+=nums[i][j];
                if(j<msOrder-1) result+=" ";
                if(i==msOrder-1 && j==msOrder-1) result+=" ";
            }
            result+="\n";
        }
        return result;
    }
    
}
