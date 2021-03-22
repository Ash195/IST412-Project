/**
 * 
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
/**
 * Account class that combines customer information, loans, and user data.
 * @author clarissapun
 */
public class Account implements Serializable{
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
    
    /**
     * This is the alternative constructor for Account class with no parameter.
     * 
     */
    public Account(){
        this.udata = UserData.getInstance();        
    }

    /**
     * Returns the Customer associated with a particular UserData (username and password)
     * @return A Customer object with information on the customer.
     */
    public Customer getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the customer of the account.
     * @param customerInfo Sets the account customer.
     */
    public void setCustomerInfo(Customer customerInfo) {
        this.customerInfo = customerInfo;
    }
    
    
    /**
     * Returns the boolean if the account was created successfully. 
     * Will return false if the username already exist
     * @param newUser Customer's account username.
     * @param newPass Customer's account password.
     * @return A boolean if the account was created.
     */
    public boolean createAccount(String newUser, String newPass){
       boolean accountCreated = false;
       System.out.println("");
        if(!udata.isUserNameTaken(newUser)){
            System.out.println("Username " + newUser + " is not taken.");
            udata.registerUser(newUser, newPass);
            //will add more password restriction and username restriction
            System.out.println("Account created successfully");


            //will get edited to be more secured
            username = newUser;
            accountCreated = true;
        } 
        else{
            System.out.println("Username is taken. Try again");
            accountCreated = false;
        }     
        return accountCreated;
    }
    
    

    /**
     * Returns the boolean if the account was created successfully. 
     * Will return false if the username already exist
     * @param user Customer's account username.
     * @param pass Customer's account password.
     * @return A boolean if the login information entered is correct.
     */
    public boolean checkLogin(String user, String pass){
        //udata.printMap(); used to check if the login informatio matches
        return udata.isLoginCorrect(user, pass);
    }
    
    //method to add loan will go here.
    
    public String getUsername(){
        return username;
    }    
    
    @Override
    public String toString(){
        String text = "Username: " + username + "\n" + customerInfo.toString();
        return text;
    }
}
