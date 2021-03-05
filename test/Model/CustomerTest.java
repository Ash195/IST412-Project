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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        String expResult = "James";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Customer.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Sammy";
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        instance.setFirstName(firstName);
        String result = instance.getFirstName();
        assertEquals(firstName, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        String expResult = "Johnson";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Customer.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Tommy";
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        instance.setLastName(lastName);
        String result = instance.getLastName();
        assertEquals(lastName, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        String expResult = "jakemm@gmail.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "aahhh@gmail.com";
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        instance.setEmail(email);
        String result = instance.getEmail();
        assertEquals(email, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerID method, of class Customer.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        long expResult = 12225;
        long result = instance.getCustomerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Customer.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        String expResult = "26888754";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class Customer.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "225478852";
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        instance.setPhoneNumber(phoneNumber);
        String result = instance.getPhoneNumber();
        assertEquals(phoneNumber, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Customer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Customer instance = new Customer(12225, "James", "Johnson", "jakemm@gmail.com", "26888754");
        String expResult = "Customer Info:\n" + 
                12225 + "\n" +
                "James Johnson" + "\n" +
                "jakemm@gmail.com" + "\n" +
                "26888754" + "\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
