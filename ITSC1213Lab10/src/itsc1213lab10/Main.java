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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CaesarCipher cCipher= new CaesarCipher(3);
        TrithemiusCipher tCipher= new TrithemiusCipher();
        System.out.println("===========CaesarCipher===========");
        System.out.println(cCipher.encrypt("The encryption is working correctly."));
        System.out.println(cCipher.decrypt("WKH GHFUBSWLRQ LV ZRUNLQJ FRUUHFWOB."));
        
        System.out.println("===========TrithemiusCipher===========");
        System.out.println(tCipher.encrypt("Machine"));
        
        System.out.println(tCipher.encrypt("The encryption is working correctly."));
        System.out.println(tCipher.decrypt("TIG DFEUCUZPWW IT WPTNMSM CPTUIHZSG."));
        
    }
}
