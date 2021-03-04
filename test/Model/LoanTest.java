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
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        test.setLoanTypeValue();
        double result = test.getInterestRate();
        double expResult = .045;
        assertEquals(expResult, result, expResult/100000);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanTerm method, of class Loan.
     */
    @Test
    public void testGetLoanTerm() {
        System.out.println("getLoanTerm");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        int expResult = 365;
        int result = test.getLoanTerm();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanTerm method, of class Loan.
     */
    @Test
    public void testSetLoanTerm() {
        System.out.println("setLoanTerm");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        int loanTerm = 730;
        test.setLoanTerm(loanTerm);
        assertEquals(loanTerm, test.getLoanTerm());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLoanType method, of class Loan.
     */
    @Test
    public void testGetLoanType() {
        System.out.println("getLoanType");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        LoanType expResult = LoanType.Business;
        LoanType result = test.getLoanType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanType method, of class Loan.
     */
    @Test
    public void testSetLoanType() {
        System.out.println("setLoanType");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        LoanType loanType = LoanType.Project;
        test.setLoanType(loanType);
        assertEquals(loanType, test.getLoanType());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrincipal method, of class Loan.
     */
    @Test
    public void testGetPrincipal() {
        System.out.println("getPrincipal");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        double expResult = 20000;
        double result = test.getPrincipal();
        assertEquals(expResult, result, expResult/100000);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrincipal method, of class Loan.
     */
    @Test
    public void testSetPrincipal() {
        System.out.println("setPrincipal");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        double principal = 30000;
        test.setPrincipal(principal);
        assertEquals(principal, test.getPrincipal(), principal/100000);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInterestRate method, of class Loan.
     */
    @Test
    public void testGetInterestRate() {
        System.out.println("getInterestRate");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        double expResult = 0.045;
        double result = test.getInterestRate();
        assertEquals(expResult, result, expResult/100000);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInterestRate method, of class Loan.
     */
    @Test
    public void testSetInterestRate() {
        System.out.println("setInterestRate");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        double interestRate = 0.043;
        test.setInterestRate(interestRate);
        assertEquals(interestRate, test.getInterestRate(), interestRate/100000);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInterest method, of class Loan.
     */
    @Test
    public void testGetInterest() {
        System.out.println("getInterest");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        double expResult = 20000/.045;
        double result = test.getInterest();
        assertEquals(expResult, result, expResult/100000);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInterest method, of class Loan.
     */
    @Test
    public void testSetInterest() {
        System.out.println("setInterest");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        double interest = 10000;
        test.setInterest(interest);
        assertEquals(interest, test.getInterest(), interest/100000);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFee method, of class Loan.
     */
    @Test
    public void testGetFee() {
        System.out.println("getFee");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        double expResult = 20000/12;
        double result = test.getFee();
        assertEquals(expResult, result, 1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFee method, of class Loan.
     */
    @Test
    public void testSetFee() {
        System.out.println("setFee");
        Loan test = new Loan(LoanType.Business, 20000, true, 365);
        double fee = 1724.0;
        test.setFee(fee);
        assertEquals(fee, test.getFee(), fee/100000);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
