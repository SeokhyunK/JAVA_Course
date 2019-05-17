/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquare;

import java.util.ArrayList;

/**
 *
 * @author seokhyun
 */
public class MagicSquareDetector {
    private int[][] testSquare;
    private int constNum;
    private int msOrder;
    boolean isMagicSquare;
    
    public boolean isMagicSquare() {
        return isMagicSquare;
    }
    public int[][] getTestSquare() {
        return testSquare;
    }
    public int getConstNum() {
        return constNum;
    }
    public int getMsOrder() {
        return msOrder;
    }
    
    public MagicSquareDetector(int[][] testSquare) {
        this.testSquare=testSquare;
        if(eachNumUnique()) {
            if(hasSameSum()) {
                for(int i=0;i<testSquare.length;i++) {
                    constNum+=testSquare[0][i];
                }
                msOrder=testSquare.length;
                isMagicSquare=true;
            } else {
                isMagicSquare=false;
            }
        } else {
            isMagicSquare=false;
        }
    }
    public boolean eachNumUnique() {
        
        ArrayList<Integer> numList=new ArrayList<Integer>();
        for(int i=0; i<testSquare.length;i++){
            for (int j=0; j< testSquare[i].length; j++) {
                numList.add(new Integer(testSquare[i][j]));
            }
        }
        for(int i=0; i<numList.size();i++) {
            for (int j=i+1;j<numList.size() ;j++) {
                boolean tempResult = numList.get(i).equals(numList.get(j));
                if (tempResult) return false;
            }
        }
        return true;
    }
    public boolean hasSameSum() {
        int sumCols[]=new int[testSquare.length];
        int sumRows[]=new int[testSquare.length];
        int sumCros[]=new int[2];
        for(int i=0; i<testSquare.length;i++){
            for (int j=0; j< testSquare[i].length; j++) {
                sumRows[i]+=testSquare[i][j];
                sumCols[j]+=testSquare[j][i];
                if(i==j) sumCros[0]+=testSquare[i][j];
                if((i+j)==(testSquare.length-1)) sumCros[1]+=testSquare[i][j];
            }
        }
        for (int i=0; i<sumCols.length-1;i++) {
            if(sumCols[i]!=sumCols[i+1]) return false;
        }
        for (int i=0; i<sumRows.length-1;i++) {
            if(sumRows[i]!=sumRows[i+1]) return false;
        }
        if (sumCros[0]!=sumCros[1]) return false;
        if (sumCols[0]!=sumCros[0]) return false;
        if (sumCros[0]!=sumRows[0]) return false;
        if (sumRows[0]!=sumCols[0]) return false;
        
        return true;
    }

}
