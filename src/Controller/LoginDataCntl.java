/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import Model.AccountList;
import Model.Customer;

/**
 *
 * @author Aung Nay
 */
public class LoginDataCntl {
    private Account account;
    private AccountList accountList;
    private Customer customer;

    
    public LoginDataCntl() {
        customer = new Customer();
        account = new Account();
        accountList = new AccountList();
    }
    
    // Returning Account List
    public AccountList getAccountList() {
        return accountList;
    }
    
    public void setAccountList(AccountList al) {
        this.accountList = al;
    }
    
    // Returning Account
    public Account getAccount() {
        return account;
    }
    
    public void setAccount(Account acc) {
        this.account = acc;
    }
    
    // Returning Customer
    public Customer getCustomer() {
        return customer;
    }
    
}
