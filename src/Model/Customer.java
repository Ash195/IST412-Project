package Model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Kelvin
 */
public class Customer {
    
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private int customerID;
    private ArrayList<Account> accounts;
    
    /**
     *
     * @param user
     * @param pass
     * @param em
     * @param phone
     */
    public Customer(String user, String pass, String em, String phone) {
        
        username = user;
        password = pass;
        email = em;
        phoneNumber = phone;
        customerID = 123456;
        accounts = new ArrayList<Account>();
    }
    
    /**
     *
     * @param name
     * @param bal
     */
    public void addNewAccount(String name, double bal) {
        Account newAcc = new Account(name, bal);
        getAccounts().add(newAcc);
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the customer's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the customer ID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @return the accounts
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    
    /**
     *
     * @return
     */
    public String toString() {
        
        String text = "Customer: " + username + "\n";
        for(int i = 0; i < accounts.size(); i++) {
            text += accounts.get(i).toString();
            text += "\n";
        }
        return text;
    }
}
