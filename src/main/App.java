package main;

import Model.Account;
import Model.Customer;
import Model.Loan;
import Model.LoanType;
import Model.UserData;
import View.AccountDashboard;
import View.MainFrame;
import java.util.Arrays;


public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Testing customers");
        Customer testCustomer = new Customer(125445, "John", "Doe", "testemail@gmail.com", "123-456-7890");
        System.out.println(testCustomer.toString());
        System.out.println("");
        Customer testCustomer2 = new Customer(1254555, "Will", "Smith", "testemail2@gmail.com", "234-567-8901");
        System.out.println(testCustomer2.toString());
        
        System.out.println("");
        System.out.println("Testing hash function of user name and password");
        UserData account1 = UserData.getInstance();
        account1.registerUser("Jakieee", "Meaodf@@");
        account1.isLoginCorrect("Jakieee", "Meaodf@@");
        account1.isLoginCorrect("Jakieee", "Meaoddf");
        
        System.out.println("");
        System.out.println("Testing the loan types and the different values");
        Loan loan1 = new Loan(LoanType.Business, 200000, true, 365);
        System.out.println(loan1.toString());
        System.out.println("");
        Loan loan2 = new Loan(LoanType.Personal, 1520, false, 120);
        System.out.println(loan2.toString());
        
        System.out.println();
        loan1.pay(25000.0);
        
        MainFrame mf = new MainFrame();
        mf.getDashboard().setUpDashboard(123456, loan1.getCurrentBalance(), (loan1.getFee()*(loan1.getApr()/100))+loan1.getFee());
        
        //Transaction testTransaction = new Transaction(testCustomer.getAccounts().get(0), testCustomer2.getAccounts().get(0), 72.50);

    }
    
}
