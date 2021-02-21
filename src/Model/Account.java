/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
/**
 *
 * @author clarissapun
 */
public class Account {
    private double currentBalance;
    private ArrayList<Transaction> transactions;
    
    public Account(double currentBalance){
        this.currentBalance = currentBalance;
        transactions = new ArrayList<Transaction>();
    }
    public Account(){
        this.currentBalance = 0;
        transactions = new ArrayList<Transaction>();
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    
}
