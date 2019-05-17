/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab04;

/**
 *
 * @author seokhyun
 */
public class Receipt {
    private Transaction rcTrans;
    
    public Receipt(Transaction t) {
        rcTrans=t;
    }
    public Transaction getrcTrans() {
        return rcTrans;
    }
    
   
    
    public String getReceiptString() {
        String result="";
        for(int i=0; i<rcTrans.getItems().size() ;i++) {
            result+=rcTrans.getItems().get(i).toString(); 
            result+="\n";
        }
        result+="---------------------------------------------\n";
        result+="Subtotal: \t"+rcTrans.computeSubTotal()+"\n"+"Tax: \t\t"+rcTrans.computeTax()+"\n"+"Total: \t\t"+rcTrans.computeTotal()+"\n";
        for (int i=0; i<rcTrans.getPayments().size();i++) {
            if (rcTrans.getPayments().get(i).getPaymentType()==PaymentType.CASH) result+="Cash: \t\t"+rcTrans.getPayments().get(i).getAmount()+"\n";
            if (rcTrans.getPayments().get(i).getPaymentType()==PaymentType.CHECK) result+="Check: \t\t"+rcTrans.getPayments().get(i).getAmount()+"\n";
            if (rcTrans.getPayments().get(i).getPaymentType()==PaymentType.CREDIT_CARD) result+="Debit: \t\t"+rcTrans.getPayments().get(i).getAmount()+"\n";
            if (rcTrans.getPayments().get(i).getPaymentType()==PaymentType.DEBIT_CARD) result+="Credit: \t"+rcTrans.getPayments().get(i).getAmount()+"\n";
            
        }
        result+="change: \t"+rcTrans.getChange()+"\n";
        
        return result;
    }
}
