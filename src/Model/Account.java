/**
 * 
 */
package Model;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Account class that combines customer information, loans, and user data.
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
            System.out.println("");
            System.out.println("Username " + userName + " is not taken.");
            if(!udata.isUserNameTaken(userName)){
                udata.registerUser(userName, passWord);
                //will add more password restriction and username restriction
                System.out.println("Account created successfully");
                accountCreated = true;
                
                //will get edited to be more secured
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
    
    //method to add loan will go here.
    
    @Override
    public String toString(){
        String text = "Username: " + username + "\n" + customerInfo.toString();
        return text;
    }
}
