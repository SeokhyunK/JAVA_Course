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
public class Payment {
    private PaymentType type;
    private double amount;
    
    public Payment (PaymentType type, double amount) {
        this.type=type;
        this.amount=amount;
    }
    public PaymentType getPaymentType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }
    public void setPaymentType(PaymentType type) {
        this.type=type;
    }
    public void setAmount(double amount) {
        this.amount=amount;
    }
    
}
