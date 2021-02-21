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
    private String name;
    private double currentBalance;
    private ArrayList<Transaction> transactions;
    
    /*
    *   This is the param constructor for Account class
    */
    public Account(String name, double currentBalance){
        this.name = name;
        this.currentBalance = currentBalance;
        transactions = new ArrayList<Transaction>();
    }
    /*
    *    This is the default constructor for Account class
    */
    public Account(){
        this.name = "default";
        this.currentBalance = 0;
        transactions = new ArrayList<Transaction>();
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the currentBalance
     */
    public double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * @param currentBalance the currentBalance to set
     */
    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     * @return the transactions
     */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

}
