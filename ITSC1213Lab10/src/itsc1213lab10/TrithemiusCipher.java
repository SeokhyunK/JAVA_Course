/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab10;

/**
 *
 * @author seokhyun
 */
public class TrithemiusCipher implements Cipher{
    
    private String lowerAlpha="abcdefghijklmnopqrstuvwxyz";
    private String upperAlpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int shift=0;
    private boolean shiftReset=false;
    
    public String encrypt(String userStr) {
        final int alphaNum=26;
        String cipherStr="";
        String plainStr=userStr;
        
        char cLetter;
        
        
        shift=0;
        for (int i=0;i<plainStr.length();i++) {
            cLetter=plainStr.charAt(i);
            if(Character.isLetter(cLetter)) {
                
                if(shift>25) shift=shift-alphaNum;
                if(shiftReset) shift=0; shiftReset=false;
            
                if(lowerAlpha.indexOf(plainStr.charAt(i))!=-1) {
                cipherStr+=lowerAlpha.charAt((lowerAlpha.indexOf(plainStr.charAt(i))+shift)%alphaNum);
                }
                if(upperAlpha.indexOf(plainStr.charAt(i))!=-1) {
                cipherStr+=upperAlpha.charAt((upperAlpha.indexOf(plainStr.charAt(i))+shift)%alphaNum);
                }
                
            } else {
                cipherStr+=cLetter;
                shiftReset=true;
            } shift++;
        }
        
        return cipherStr.toUpperCase();
    
    }
    
    public String decrypt(String userStr) {
        final int alphaNum=26;
        String plainStr="";
        String cipherStr=userStr;
        char cLetter;
        
        shift=0;
        
        for (int i=0;i<cipherStr.length();i++) {
            cLetter=cipherStr.charAt(i);
            if(Character.isLetter(cLetter)) {
                if(shift<0) shift=shift+alphaNum;
                if(shiftReset) shift=0; shiftReset=false;
            
                if(lowerAlpha.indexOf(cipherStr.charAt(i))!=-1) {
                plainStr+=lowerAlpha.charAt((lowerAlpha.indexOf(cipherStr.charAt(i))+shift)%alphaNum);
                }
                if(upperAlpha.indexOf(cipherStr.charAt(i))!=-1) {
                plainStr+=upperAlpha.charAt((upperAlpha.indexOf(cipherStr.charAt(i))+shift)%alphaNum);
                }
                
            } else {
                plainStr+=cLetter;
                shiftReset=true;
            } shift--;
        }
        
        return plainStr.toUpperCase();
    
    }
}
