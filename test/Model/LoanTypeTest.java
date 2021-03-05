/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.LoanType.Business;
import static Model.LoanType.Personal;
import static Model.LoanType.Project;
import static Model.LoanType.Renovation;
import static Model.LoanType.Vehicle;
import java.util.Arrays;
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
public class LoanTypeTest {
    
    public LoanTypeTest() {
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
     * Test of values method, of class LoanType.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        LoanType[] expResult = {Personal, Business, Vehicle, Renovation, Project};
        LoanType[] result = LoanType.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class LoanType.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "Personal";
        LoanType expResult = Personal;
        LoanType result = LoanType.valueOf(name);
        assertEquals(expResult, result);
        name = "Vehicle";
        expResult = Vehicle;
        result = LoanType.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
