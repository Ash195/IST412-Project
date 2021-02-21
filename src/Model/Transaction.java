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
    private Account reciever;
    private double balance;
    public Transaction(Account sender, Account reciever, double balance){
        this.sender = sender;
        this.reciever = reciever;
        this.balance = balance;
    }

    public Account getSender() {
        return sender;
    }

    public void setSender(Account sender) {
        this.sender = sender;
    }

    public Account getReciever() {
        return reciever;
    }

    public void setReciever(Account reciever) {
        this.reciever = reciever;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    } 
    
}
