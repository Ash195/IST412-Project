/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aung Nay
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCustomerInfo method, of class Account.
     */
    @Test
    public void testGetCustomerInfo() {
        System.out.println("getCustomerInfo");
        Account instance = new Account();
        Customer expResult = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        instance.setCustomerInfo(expResult);
        Customer result = instance.getCustomerInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerInfo method, of class Account.
     */
    @Test
    public void testSetCustomerInfo() {
        System.out.println("setCustomerInfo");
        Customer customerInfo = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        Account instance = new Account();
        instance.setCustomerInfo(customerInfo);
        Customer result = instance.getCustomerInfo();
        assertEquals(customerInfo, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createAccount method, of class Account.
     */
    @Test
    public void testCreateAccount() {
        System.out.println("createAccount");
        Account instance = new Account();
        boolean result = instance.createAccount("default", "password");
        assertEquals(true, result);
        result = instance.createAccount("default", "password");
        assertEquals(false, result);
        
        result = instance.createAccount("another1121", "password");
        assertEquals(true, result);
        
        result = instance.createAccount("another1121", "password");
        assertEquals(false, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of checkLogin method, of class Account.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");
        String user = "";
        String pass = "";
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.checkLogin(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer c = new Customer(0, "default", "customer", "default@gmail.com", "1234567890");
        Account instance = new Account(c);
        instance.createAccount("admin", "password");
        String expResult = "Username: admin\nCustomer Info:\n0\ndefault customer\ndefault@gmail.com\n1234567890\n";
        String result = instance.toString();  //gives null
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
