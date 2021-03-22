/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aung Nay
 */
public class Business extends Loan {
    final LoanType lt = LoanType.Business;
    
    public Business() {
        setLoanType(lt);
    }
    

    
    @Override
    public void computeLoanCalculation(double interestRate)
    {
        //method to calculate interest rate based on credit score.
        setFee(getPrincipal()/12); //example test cases for now will add formula later.
        setInterestRate(interestRate);
        setInterest(getPrincipal()/getInterestRate());
        setApr(calculateApr());
    }
}
