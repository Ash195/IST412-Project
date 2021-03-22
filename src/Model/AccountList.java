/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aung Nay
 */
public class AccountList {
    private ArrayList<Account> accountList = new ArrayList<>();
    private String accountListFile = "accountData.ser";
    //private LinkedList<Account> accountOrder = new LinkedList();
     
    public AccountList(){
//        printProjectList();
//        buildProjectList();
//        printProjectList();
        
        this.readAccountListFile();
        //|| listOfUsers == null
        if(accountList.isEmpty() || accountList == null){
            //this.createTestUserList();
            //this.writeUserListFile();
            //this.readUserListFile();
            addAccountTest();
            writeAccountListFile();
            
        }
       
    }

    
    public ArrayList<Account> getAccountList(){
        return accountList;
    }
    
    public void readAccountListFile(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        
        try {
            fis = new FileInputStream(accountListFile);
            in = new ObjectInputStream(fis);
            accountList = (ArrayList)in.readObject();
            in.close();
            
            if(!accountList.isEmpty()){
                System.out.println("Accounts in file");
            }
            
        } catch(FileNotFoundException ex) {
            System.out.println("File not found, new one created");
        } catch (IOException ex){
            ex.printStackTrace();
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        } 
        
    }
    
    public void writeAccountListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(accountListFile);
            out = new ObjectOutputStream(fos);
            out.writeObject(accountList);
            out.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void printAccountList(){
//        for (ProjectInfo project : projectList){
//            System.out.println(project.toString());
//        }
    Iterator<Account> accountIterator = accountList.iterator();
        while(accountIterator.hasNext()){
            Account acnt = accountIterator.next();
            System.out.println(acnt.toString());
        }
    }
    
    private void addAccountTest(){
 
        
        Customer testCustomer = new Customer("John", "Doe", "testemail@gmail.com", "123-456-7890");
        Account ac1 = new Account(testCustomer);
        ac1.createAccount("Sammy123", "dsjj@9348");
        
        testCustomer = new Customer("Frank", "Rpl", "testemail@gmail.com", "123-455-8982");
        Account ac2 = new Account(testCustomer);
        ac2.createAccount("fonny", "48523@9348");
        
        testCustomer = new Customer("Home", "Boy", "testema11il@gmail.com", "889-456-5884");
        Account ac3 = new Account(testCustomer);
        ac3.createAccount("honny", "dsjj@9348");
        
        accountList.add(ac1);
        accountList.add(ac2);
        accountList.add(ac3);
        
    }
    
    
    public Object removeAccount(Object account){
        Account accountToRemove = (Account)account;
        Iterator<Account> accountIterator = accountList.iterator();
        while(accountIterator.hasNext()){
            if(accountIterator.next().getUsername().compareTo(accountToRemove.getUsername()) == 0){
                accountIterator.remove();
                return accountToRemove;
            }
        }
        return null;
    }
    
    public boolean checkUserName(String username) {
        Iterator<Account> accountIterator = accountList.iterator();
        while(accountIterator.hasNext()){
            if(accountIterator.next().getUsername().compareTo(username) == 0){                
                return true;
            }
        }
        return false;
    }
    
    public boolean getAccount(String accountTitle){
        Iterator<Account> accountIterator = accountList.iterator();
        while(accountIterator.hasNext()){
            Account account = accountIterator.next();
            if(account.getUsername().compareTo(accountTitle) == 0) {
                return true;
            }
        }        
        return false;
    }
    
    public Account getAccountInfo(String accountTitle){
        Iterator<Account> accountIterator = accountList.iterator();
        while(accountIterator.hasNext()){
            Account account = accountIterator.next();
            if(account.getUsername().compareTo(accountTitle) == 0) {
                return account;
            }
        }        
        
        return null;
    }
    
    
    
    public void addAccount(Account accountToAdd){      
        accountList.add(accountToAdd);
        writeAccountListFile();
    }
}
