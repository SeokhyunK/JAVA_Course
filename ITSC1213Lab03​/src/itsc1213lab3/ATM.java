/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213lab3;

/**
 *
 * @author seokhyun
 */
public class ATM {
    private BankAccount account;
    
    public ATM(BankAccount bAct) {
        account=bAct;
    }
    public void withdraw(double withdraw) {
        account.setBalance(account.getBalance()-withdraw);
        System.out.println("Withdraw successful. The new balance is "+account.getBalance());
    }
    public void deposit(double deposit) {
        account.setBalance(account.getBalance()+deposit);
        System.out.println("Deposit successful. The new balance is "+account.getBalance());
    }
    public double getBalance() {
        return account.getBalance();
    }
    public void setAccount(BankAccount n) {
        account=n;
    }
    public String getAccountInformation() {
        String result = "";
        result += "Account Id: "+account.getId()+", Balance: "+account.getBalance();
        return result;
    }

}
