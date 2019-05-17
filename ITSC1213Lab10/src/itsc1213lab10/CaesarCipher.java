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
public class CaesarCipher implements Cipher{
    private int shift;
    private String lowerAlpha="abcdefghijklmnopqrstuvwxyz";
    private String upperAlpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public CaesarCipher(int shift) {
        this.shift=shift;
    }
    
    public String encrypt(String userStr) {
        final int alphaNum=26;
        String cipherStr="";
        String plainStr=userStr;
        int iKey=shift;
        char cLetter;
        while(iKey<0) {
            iKey+=alphaNum;
        }
        
        for (int i=0;i<plainStr.length();i++) {
            cLetter=plainStr.charAt(i);
            if(Character.isLetter(cLetter)) {
            
                if(lowerAlpha.indexOf(plainStr.charAt(i))!=-1) {
                cipherStr+=lowerAlpha.charAt((lowerAlpha.indexOf(plainStr.charAt(i))+iKey)%alphaNum);
                }
                if(upperAlpha.indexOf(plainStr.charAt(i))!=-1) {
                cipherStr+=upperAlpha.charAt((upperAlpha.indexOf(plainStr.charAt(i))+iKey)%alphaNum);
                }
                
            } else {
                cipherStr+=cLetter;
            }
        }
        
        return cipherStr.toUpperCase();
    
    }
    
    public String decrypt(String userStr) {
        final int alphaNum=26;
        String plainStr="";
        String cipherStr=userStr;
        int iKey=shift;
        char cLetter;
        while(iKey<0) {
            iKey+=alphaNum;
        }
        iKey=(alphaNum-iKey);
        
        for (int i=0;i<cipherStr.length();i++) {
            cLetter=cipherStr.charAt(i);
            if(Character.isLetter(cLetter)) {
            
                if(lowerAlpha.indexOf(cipherStr.charAt(i))!=-1) {
                plainStr+=lowerAlpha.charAt((lowerAlpha.indexOf(cipherStr.charAt(i))+iKey)%alphaNum);
                }
                if(upperAlpha.indexOf(cipherStr.charAt(i))!=-1) {
                plainStr+=upperAlpha.charAt((upperAlpha.indexOf(cipherStr.charAt(i))+iKey)%alphaNum);
                }
                
            } else {
                plainStr+=cLetter;
            }
        }
        
        return plainStr.toUpperCase();
    
    }
}
