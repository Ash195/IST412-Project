/**
 * 
 */
package Model;

import java.util.ArrayList;
/**
 * Account class that combines customer information, loans, and user data.
 * @author clarissapun
 */
public class Account {
    private long accountID;
    private Customer customerInfo;
    private UserData udata = UserData.getInstance();
    private ArrayList<Loan> loans;
    
    /**
     *
     * @param name
     * @param currentBalance
     */
    public Account(String name, double currentBalance){
        
    }
    /*
    *    This is the default constructor for Account class
    */
    public Account(){
        
    }
    
    // method for creating username from udata.
    // storing customer information inside the account.
    // linking the loans to an account.
    // option to delete and remove an account.

}
