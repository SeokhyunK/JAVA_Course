package itsc1213lab11;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

public class CalculatorGUI extends JFrame implements ActionListener {
   private JLabel calcLabel;
   private JButton addButton;
   private JButton subtractButton;
   private JButton multiplyButton;
   private JButton divideButton;  
   private JButton quitButton;  
   private JTextField inputNum1;
   private JTextField inputNum2;        
   private JTextField resultNum;      

   /* Constructor creates GUI components and adds GUI components
      using a GridBagLayout. */
   CalculatorGUI() {
      // Used to specify GUI component layout
      GridBagConstraints layoutConst = null;

      // Set frame's title
      setTitle("CalculatorGUI");

      // Create labels
      calcLabel = new JLabel("Calculate");

      // Create button and add action listener
      addButton = new JButton("Add");
      addButton.addActionListener(this);
      
      subtractButton = new JButton("Subtract");
      subtractButton.addActionListener(new SubtractListener());
      
      multiplyButton = new JButton("Multiply");
      multiplyButton.addActionListener(new MultiplyListener());
      
      divideButton = new JButton("Divide");
      divideButton.addActionListener(new DivideListener());
      
      quitButton = new JButton("Quit");
      quitButton.addActionListener(new QuitListener());

      // Create flight time filed
      inputNum1 = new JTextField(15);
      inputNum1.setEditable(true);

      // Create driving time field
      inputNum2 = new JTextField(15);
      inputNum2.setEditable(true);
      
      resultNum = new JTextField(15);
      resultNum.setEditable(false);

      // Create and set-up an input field for numbers (not text)
     

      // Use a GridBagLayout
      setLayout(new GridBagLayout());

      // Specify component's grid location
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 0;
      add(calcLabel, layoutConst);

    
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 1;
      add(inputNum1, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 1;
      layoutConst.gridy = 1;
      add(inputNum2, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 2;
      add(addButton, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 3;
      add(subtractButton, layoutConst);

      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 4;
      add(multiplyButton, layoutConst);
      
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 5;
      add(divideButton, layoutConst);
      
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 1;
      layoutConst.gridy = 5;
      add(resultNum, layoutConst);
      
      layoutConst = new GridBagConstraints();
      layoutConst.insets = new Insets(10, 10, 10, 10);
      layoutConst.gridx = 0;
      layoutConst.gridy = 6;
      add(quitButton, layoutConst);
   }
   
   class SubtractListener implements ActionListener { 
       public void actionPerformed(ActionEvent e) {  
        double num1;     
        double num2;     
        double result;    
        String tempStr;
        tempStr=inputNum1.getText();
        num1=Double.parseDouble(tempStr);
        tempStr=inputNum2.getText();
        num2=Double.parseDouble(tempStr);
        result=num1-num2;      
      
        resultNum.setText(Double.toString(result));
      
       }
   }
   class MultiplyListener implements ActionListener { 
       public void actionPerformed(ActionEvent e) {  
   
        double num1;     
        double num2;       
        double result;     
        String tempStr;
      
        tempStr=inputNum1.getText();
        num1=Double.parseDouble(tempStr);
        tempStr=inputNum2.getText();
        num2=Double.parseDouble(tempStr);
        result=num1*num2;      
      
        resultNum.setText(Double.toString(result));
      
       }
   } 
   class DivideListener implements ActionListener { 
       public void actionPerformed(ActionEvent e) {  
       
        double num1;     
        double num2;       
        double result;     
        String tempStr;
      
        tempStr=inputNum1.getText();
        num1=Double.parseDouble(tempStr);
        tempStr=inputNum2.getText();
        num2=Double.parseDouble(tempStr);
        
        if(num2<=0) {
            JOptionPane.showMessageDialog(divideButton,"Enter greater than 0 for divisor");
        }
        result=num1/num2;      
      
        resultNum.setText(Double.toString(result));
   
      
       }
   }
   
   class QuitListener implements ActionListener { 
       public void actionPerformed(ActionEvent e) {  
           dispose();
       }
   }
   @Override
   public void actionPerformed(ActionEvent event) {
      double num1;     
      double num2;       
      double result;     
      String tempStr;
      tempStr=inputNum1.getText();
      num1=Double.parseDouble(tempStr);
      tempStr=inputNum2.getText();
      num2=Double.parseDouble(tempStr);
      result=num1+num2;      
      
      resultNum.setText(Double.toString(result));
      
   }

   
}