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
        Customer expResult = null;
        Customer result = instance.getCustomerInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerInfo method, of class Account.
     */
    @Test
    public void testSetCustomerInfo() {
        System.out.println("setCustomerInfo");
        Customer customerInfo = null;
        Account instance = new Account();
        instance.setCustomerInfo(customerInfo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createAccount method, of class Account.
     */
    @Test
    public void testCreateAccount() {
        System.out.println("createAccount");
        Account instance = new Account();
        instance.createAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class Account.
     */
    @Test
    public void testSetUserName() {
        System.out.println("setUserName");
        Account instance = new Account();
        instance.setUserName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Account.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Account instance = new Account();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
