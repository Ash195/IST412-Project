/**
 */
package Model;

/**
 * Customer class with customer personal information
 * @author Kelvin
 */
public class Customer {
    
    private long custID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    //private double creditScore; maybe hashed
    
    /**
     * 
     *  This is the default constructor for the Customer class.
     */
    public Customer(){
        
    }
    
    
    /**
     * @param id Set the customer id.
     * @param first Set the customer first name.
     * @param last Set the customer last name.
     * @param em Set the customer email.
     * @param phone Set the customer phone.
     * 
     * This is the constructor with input values provided. 
     */    
    public Customer(long id, String first, String last, String em, String phone) {
        
        custID = id; //will be auto generated
        firstName = first;
        lastName = last;
        email = em;
        phoneNumber = phone;
    }
    
    /**
     * Returns the customer's first name.
     * @return A String representing the customer's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the customer's first name.
     * @param firstName Sets the customer's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the customer's last name.
     * @return A String representing the customer's first name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the customer's last name.
     * @param lastName Sets the customer's last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the customer's email.
     * @return A String representing the customer's email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the customer's email.
     * @param email Sets the customer's email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the customer ID of the customer.
     * @return A long representing the customer ID.
     */
    public long getCustomerID() {
        return custID;
    }

    /**
     * Returns the phone number of the customer.
     * @return A String representing the  customer's phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the customer's phone number.
     * @param phoneNumber Sets the customer's phone number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    
    /**
     *  
     * Returns the customer's information.
     * @return A String of customer's information.
     */
    @Override
    public String toString() {
        
        String text = "Customer Info:\n" + 
                getCustomerID() + "\n" +
                getFirstName() + " " + getLastName() + "\n" +
                getEmail() + "\n" +
                getPhoneNumber() + "\n";
        return text;
    }
}
