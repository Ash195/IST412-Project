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
public class LoanTest {
    
    public LoanTest() {
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
     * Test of setLoanTypeValue method, of class Loan.
     */
    @Test
    public void testSetLoanTypeValue() {
        System.out.println("setLoanTypeValue");
        Loan instance = null;
        instance.setLoanTypeValue();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanTerm method, of class Loan.
     */
    @Test
    public void testGetLoanTerm() {
        System.out.println("getLoanTerm");
        Loan instance = null;
        int expResult = 0;
        int result = instance.getLoanTerm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanTerm method, of class Loan.
     */
    @Test
    public void testSetLoanTerm() {
        System.out.println("setLoanTerm");
        int loanTerm = 0;
        Loan instance = null;
        instance.setLoanTerm(loanTerm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanType method, of class Loan.
     */
    @Test
    public void testGetLoanType() {
        System.out.println("getLoanType");
        Loan instance = null;
        LoanType expResult = null;
        LoanType result = instance.getLoanType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanType method, of class Loan.
     */
    @Test
    public void testSetLoanType() {
        System.out.println("setLoanType");
        LoanType loanType = null;
        Loan instance = null;
        instance.setLoanType(loanType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrincipal method, of class Loan.
     */
    @Test
    public void testGetPrincipal_0args() {
        System.out.println("getPrincipal");
        Loan instance = null;
        double expResult = 0.0;
        double result = instance.getPrincipal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrincipal method, of class Loan.
     */
    @Test
    public void testGetPrincipal_double() {
        System.out.println("getPrincipal");
        double principal = 0.0;
        Loan instance = null;
        instance.getPrincipal(principal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestRate method, of class Loan.
     */
    @Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        Loan instance = null;
        double expResult = 0.0;
        double result = instance.getInterestRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterestRate method, of class Loan.
     */
    @Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate");
        double interestRate = 0.0;
        Loan instance = null;
        instance.setInterestRate(interestRate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInterest method, of class Loan.
     */
    @Test
    public void testGetInterest() {
        System.out.println("getInterest");
        Loan instance = null;
        double expResult = 0.0;
        double result = instance.getInterest();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterest method, of class Loan.
     */
    @Test
    public void testSetInterest() {
        System.out.println("setInterest");
        double interest = 0.0;
        Loan instance = null;
        instance.setInterest(interest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFee method, of class Loan.
     */
    @Test
    public void testGetFee() {
        System.out.println("getFee");
        Loan instance = null;
        double expResult = 0.0;
        double result = instance.getFee();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFee method, of class Loan.
     */
    @Test
    public void testSetFee() {
        System.out.println("setFee");
        double fee = 0.0;
        Loan instance = null;
        instance.setFee(fee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApr method, of class Loan.
     */
    @Test
    public void testSetApr() {
        System.out.println("setApr");
        double apr = 0.0;
        Loan instance = null;
        instance.setApr(apr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateApr method, of class Loan.
     */
    @Test
    public void testCalculateApr() {
        System.out.println("calculateApr");
        Loan instance = null;
        double expResult = 0.0;
        double result = instance.calculateApr();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApr method, of class Loan.
     */
    @Test
    public void testGetApr() {
        System.out.println("getApr");
        Loan instance = null;
        double expResult = 0.0;
        double result = instance.getApr();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSecured method, of class Loan.
     */
    @Test
    public void testIsSecured() {
        System.out.println("isSecured");
        Loan instance = null;
        boolean expResult = false;
        boolean result = instance.isSecured();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecured method, of class Loan.
     */
    @Test
    public void testSetSecured() {
        System.out.println("setSecured");
        boolean secured = false;
        Loan instance = null;
        instance.setSecured(secured);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Loan.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Loan instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
