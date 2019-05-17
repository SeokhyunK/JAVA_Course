/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab11;



import javax.swing.JFrame;


/**
 *
 * @author skim102
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Creates FlyDriveFrame and its components
      CalculatorGUI myCalc = new CalculatorGUI();
      myCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myCalc.pack();
      myCalc.setVisible(true);
   }
    
}
