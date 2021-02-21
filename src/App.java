import Model.Account;
import Model.Customer;
import Model.Transaction;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer testCustomer = new Customer(125445, "John", "Doe", "testemail@gmail.com", "123-456-7890");
        System.out.println(testCustomer.toString());
        
        Customer testCustomer2 = new Customer(1254555, "Will", "Smith", "testemail2@gmail.com", "234-567-8901");
        System.out.println(testCustomer2.toString());
        
        System.out.println(testCustomer);
        System.out.println(testCustomer2);
        
        //Transaction testTransaction = new Transaction(testCustomer.getAccounts().get(0), testCustomer2.getAccounts().get(0), 72.50);

    }
    
}
