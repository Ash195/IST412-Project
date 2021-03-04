/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;
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
//    @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        UserData expResult = new UserData();
//        UserData result = UserData.getInstance();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of hashCode method, of class UserData.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        UserData instance = UserData.getInstance();;
        int expResult = 7;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isUserNameTaken method, of class UserData.
     */
    @Test
    public void testIsUserNameTaken() {
        System.out.println("isUserNameTaken");
        String user = "Sammyboy299";
        String pass = "2658421fkf";
        UserData instance = UserData.getInstance();
        instance.registerUser(user, pass);
        boolean expResult = true;
        boolean result = instance.isUserNameTaken("Sammyboy299");
        assertEquals(expResult, result);
        
        expResult = false;
        result = instance.isUserNameTaken("Sammybodddy299");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class UserData.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String user = "Sammyboy99";
        String pass = "2658421kf";
        UserData instance = UserData.getInstance();
        instance.registerUser(user, pass);
        boolean expResult = true;
        boolean result = instance.isLoginCorrect("Sammyboy99", "2658421kf");
        assertEquals(expResult, result);
        
        expResult = false;
        result = instance.isLoginCorrect("Saannyy32", "2658421kf");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isLoginCorrect method, of class UserData.
     */
    @Test
    public void testIsLoginCorrect() {
        System.out.println("isLoginCorrect");
        String user = "Sammyssboy99";
        String pass = "265842fdsfs1kf";
        UserData instance = UserData.getInstance();;
        instance.registerUser(user, pass);
        boolean expResult = false;
        boolean result = instance.isLoginCorrect("Sammyboy99", "265421kf");
        assertEquals(expResult, result);
        
        expResult = true;
        result = instance.isLoginCorrect("Sammyssboy99", "265842fdsfs1kf");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
