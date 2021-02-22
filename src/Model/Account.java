/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author clarissapun
 */
public class Account {
    private long accountID;
    private String username;
    private Customer customerInfo;
    private final UserData udata;
    private ArrayList<Loan> loans;
    
    /**
     * This is the default constructor for Account class
     * @param info Sets the customer's information
     */
    public Account(Customer info){
        this.udata = UserData.getInstance();
        this.customerInfo = info;
    }
    /*
    *    
    */
    public Account(){
        this.udata = UserData.getInstance();        
    }

    public Customer getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(Customer customerInfo) {
        this.customerInfo = customerInfo;
    }
    
    
    
    public void createAccount(){
        Scanner s = new Scanner(System.in);        
        boolean accountCreated = false;
        while(accountCreated == false){
            String userName = s.next();
            String passWord = s.next();
            System.out.println(udata.isUserNameTaken(userName));
            if(!udata.isUserNameTaken(userName)){
                udata.registerUser(userName, passWord);
                //will add more password restriction and username restriction
                System.out.println("Account created successfully");
                accountCreated = true;
                username = userName;
            } 
            else{
                System.out.println("Username is taken. Try again");
                accountCreated = false;
            }
        }        
    }
    
    public void setUserName(){
        
    }
    
    public boolean checkLogin(String user, String pass){
        //udata.printMap(); used to check if the login informatio matches
        return udata.isLoginCorrect(user, pass);
    }
    
    @Override
    public String toString(){
        String text = 
        return text;
    }
}
