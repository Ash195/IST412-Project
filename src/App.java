import Model.Account;
import Model.Customer;
import Model.Transaction;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer testCustomer = new Customer("TestUser", "TestPassword", "testemail@gmail.com", "123-456-7890");
        testCustomer.addNewAccount("Checkings", 500.00);
        
        Customer testCustomer2 = new Customer("TestUser2", "TestPassword2", "testemail2@gmail.com", "234-567-8901");
        testCustomer2.addNewAccount("Checkings", 1250.00);
        
        System.out.println(testCustomer);
        System.out.println(testCustomer2);
        
        Transaction testTransaction = new Transaction(testCustomer.getAccounts().get(0), testCustomer2.getAccounts().get(0), 72.50);
        
        System.out.println(testCustomer);
        System.out.println(testCustomer2);
        
        System.out.println("test");
    }
    
}
