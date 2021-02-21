/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author clarissapun
 */
public class Transaction {
    private Account sender;
    private Account receiver;
    private double balance;

    /**
     *
     * @param sender
     * @param receiver
     * @param balance
     */
    public Transaction(Account sender, Account receiver, double balance){
        this.sender = sender;
        this.receiver = receiver;
        this.balance = balance;
        
        adjustBalance();
    }
    
    /*
    *    This is the default constructor for Account class
    */
    public Transaction(){
        this.sender = new Account();
        this.receiver = new Account();
        this.balance = 0.0;
    }
    
    /**
     *   This adjusts the balances of the appropriate accounts
     */
    public void adjustBalance() {
        getSender().withdraw(getBalance());
        getReceiver().deposit(getBalance());
    }

    /**
     * @return the sender
     */
    public Account getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(Account sender) {
        this.sender = sender;
    }

    /**
     * @return the receiver
     */
    public Account getReceiver() {
        return receiver;
    }

    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(Account receiver) {
        this.receiver = receiver;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

}
