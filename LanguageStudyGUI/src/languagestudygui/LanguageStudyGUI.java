/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languagestudygui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;


/**
 *
 * @author seokhyun
 */


public class LanguageStudyGUI extends JFrame implements ActionListener {
   private JLabel guideLabel;
   private JLabel wordLabel;
   private JButton okButton;
   private JTextField inputField;
   private WordFile[] words=new WordFile[2];
   
   private int wordLanguage;
   private int wordIndex;
   
   
   
   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   LanguageStudyGUI(WordFile words1, WordFile words2) {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;
      
      // get words files
      words[0]=words1;
      words[1]=words2;
      
      

      // Set frame's title
      setTitle("LanguageGUI");
      this.setSize(450, 150);
      

      // Create labels
      guideLabel = new JLabel("Type the translation into the field below.");
      
      wordLabel = new JLabel("Words");

      // Create button and add action listener
      okButton = new JButton("Ok");
      okButton.addActionListener(this);
      

      // Create flight time filed
      inputField = new JTextField(15);
      
      inputField.setEditable(false);
      inputField.addKeyListener(new KeyAdapter() {
          public void keyPressed(KeyEvent e) {
              if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                  test();
              }
          }
      });
      
      
      
     
      // Use a GridBagLayout
      setLayout(new GridBagLayout());

      // Specify component's grid location
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 0, 20, 0);
      layoutConst.gridx = 1;
      layoutConst.gridy = 0;
      add(guideLabel, layoutConst);

    
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0,10,0,10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(wordLabel, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 0, 0, 0);
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(inputField, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(0, 10, 0, 10);
      layoutConst.gridx = 2;
      layoutConst.gridy = 1;
      add(okButton, layoutConst);
      
      timer2.start();
      
   }

   @Override
   public void actionPerformed(ActionEvent event) {
      
      test();
   }
   
   //check if the input is correct or not
   public void test() {
      timer1.stop();
      
      String tempStr;
      inputField.setEditable(false);
      String answer=words[1-wordLanguage].getWord(wordIndex);
      tempStr=inputField.getText().toLowerCase();
      
      if(tempStr.equals(answer.toLowerCase())) {
          guideLabel.setText("Correct!");
      } else {
          guideLabel.setText("Incorrect! Answer: "+answer);
      }
      
      timer2.start();
   }
   
   
   //choose words from file randomly
   public String selectWord() {
       int langSelect=(int)(Math.random()*2+1)-1;//0-1
       int wordSelect=(int)(Math.random()*10+1)-1;//0-9
       String result;
       if(langSelect==0) {
           result=words[0].getWord(wordSelect);
           wordLanguage=0;
       } else {
           result=words[1].getWord(wordSelect);
           wordLanguage=1;
       }
       wordIndex=wordSelect;
       
       return result;
   }
   //timer
   
   Timer timer1 = new Timer(7000,new timeListener1());
   Timer timer2 = new Timer(5000,new timeListener2());
   
    
   class timeListener1 implements ActionListener { 
       public void actionPerformed(ActionEvent e) {  
           
           test();
           
       }
   }
   class timeListener2 implements ActionListener { 
       public void actionPerformed(ActionEvent e) {
           timer2.stop();
           guideLabel.setText("Type the translation into the field below.");
           wordLabel.setText(selectWord());
           inputField.setText("");
           
           inputField.setEditable(true);
           
           
           timer1.start();
       }
   }


}



    
