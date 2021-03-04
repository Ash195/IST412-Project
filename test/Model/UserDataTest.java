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
public class UserDataTest {
    
    public UserDataTest() {
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
     * Test of getInstance method, of class UserData.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        UserData expResult = null;
        UserData result = UserData.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class UserData.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserData instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class UserData.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        UserData instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserNameTaken method, of class UserData.
     */
    @Test
    public void testIsUserNameTaken() {
        System.out.println("isUserNameTaken");
        String user = "";
        UserData instance = null;
        boolean expResult = false;
        boolean result = instance.isUserNameTaken(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class UserData.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String user = "";
        String pass = "";
        UserData instance = null;
        instance.registerUser(user, pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLoginCorrect method, of class UserData.
     */
    @Test
    public void testIsLoginCorrect() {
        System.out.println("isLoginCorrect");
        String user = "";
        String pass = "";
        UserData instance = null;
        boolean expResult = false;
        boolean result = instance.isLoginCorrect(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
