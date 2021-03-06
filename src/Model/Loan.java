/**
 * 
 */
package Model;

import java.text.DecimalFormat;

/**
 * Loan class that calculate loan based on the loan type.
 * @author Aung Nay
 */
public class Loan {
    private long loanID;
    private LoanType loanType;
    private double principal;
    private double interestRate; //annually
    private double interest;
    private double fee;
    private double apr;
    private boolean secured = false;
    private int loanTerm; //number of days
    
    /**
     *
     * @param loanType Sets the loan type of the loan.
     * @param principal Sets the principal amount of the loan.
     * @param secured Sets if the loan is secured.
     * @param loanTerm Sets the length of the loan term.
     */
    public Loan(LoanType loanType, double principal, boolean secured, int loanTerm) {
        this.loanType = loanType;
        this.principal = principal;
        this.secured = secured;
        this.loanTerm = loanTerm;
        setLoanTypeValue(); //set the loan values based on loan type.
    }
    
    /**
     * Calculate all the necessary numbers needed for a loan based on the provided interest rate.
     * @param interestRate Sets the interest rate of the loan.
     */
    private void computeLoanCalculation(double interestRate)
    {
        //method to calculate interest rate based on credit score.
        setFee(principal/12); //example test cases for now will add formula later.
        setInterestRate(interestRate);
        setInterest(getPrincipal()/getInterestRate());
        setApr(calculateApr());
    }

    /**
     * Set the correct rates based on the loan type.
     * 
     */
    public final void setLoanTypeValue() {
        double interestRr = 0;
    switch(loanType){
        case Personal:
            //System.out.println("Personal Loan");
            interestRr = .04;
            computeLoanCalculation(interestRr); 
            break;

        case Business:
            //System.out.println("Business Loan");
            interestRr = .045; 
            computeLoanCalculation(interestRr); 
            break;

        case Vehicle: 
            //System.out.println("Vehicle Loan");
            interestRr = .052; 
            computeLoanCalculation(interestRr);
            break;
            
        case Renovation:
            //System.out.println("Vehicle Loan");
            interestRr = .03; 
            computeLoanCalculation(interestRr);
            break;
            
        case Project:
            //System.out.println("Vehicle Loan");
            interestRr = .07; 
            computeLoanCalculation(interestRr);
            break;
            
        default:
            //System.out.println("");
            interestRr = .05;
            computeLoanCalculation(interestRr);
            break;
        }
    
    
    }
    
    /**
     * Returns the loan term duration.
     * @return A integer representation of the loan term length in days.
     */
    public int getLoanTerm() {
        return loanTerm;
    }

    /**
     * Sets the loan term duration.
     * @param loanTerm Sets the loan term duration.
     */
    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * Returns the current loan type.
     * @return A enumeration representation of the loan type.
     */
    public LoanType getLoanType() {
        return loanType;
    }

    /**
     * Sets the loan term type.
     * @param loanType Sets the loan term type.
     */
    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    /**
     * Returns the principal of the loan.
     * @return A double representation of the loan principal amount.
     */
    public double getPrincipal() {
        return principal;
    }

    /**
     * Sets the loan principal amount.
     * @param principal Sets the loan principal amount.
     */
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    /**
     * Returns the interest rate of the loan.
     * @return A double representation of the loan interest rate.
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
    * Sets the loan interest rate amount.
    * @param interestRate Sets the loan interest rate.
    */
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Returns the interest of the loan.
     * @return A double representation of the loan interest.
     */
    public double getInterest() {
        return interest;
    }

    /**
     * Sets the loan interest.
     * @param interest Sets the loan interest.
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     * Returns the fee amount of the loan.
     * @return A double representation of the loan fee.
     */
    public double getFee() {
        return fee;
    }

    /**
     * Sets the loan fee.
     * @param fee Sets the loan fee.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
    
    /**
     * Sets the loan APR value.
     * @param apr Sets the loan APR value.
     */
    public void setApr(double apr) {
        this.apr = apr;

    }

    /**
     * Calculated the loan APR through a formula.
     * @return A double representing the loan APR.
     */
    public double calculateApr() {
        double apr;
        if(getPrincipal() == 0){
            apr = 0;
        }else{
            double top = (getFee() + getInterest())/ getPrincipal();
            //System.out.println(top);
            apr = (top/getLoanTerm()) * 365; //one year, into percentage value
            
        }
        return apr;
    }
    
    
    /**
     * Returns the loan APR.
     * @return A double representing the loan APR.
     */
    public double getApr() {
        return apr;
    }

    /**
     * Returns if the loan type is secured.
     * @return A boolean representing the loan secured.
     */
    public boolean isSecured() {
        return secured;
    }

    /**
     * Sets the loan secured.
     * @param secured Sets the loan secured.
     */
    public void setSecured(boolean secured) {
        this.secured = secured;
    }
    
    @Override
    public String toString() {
        DecimalFormat df2 = new DecimalFormat("#.##");
        String text = "Loan Info:\n" + 
            getLoanType() + "\n" +
            "Secured: " + isSecured() + "\n" +
            "Principal: " + getPrincipal() + "\n" +
            "Interest Rate: " + getInterestRate() + "\n" +
            "Loan Term: " + getLoanTerm() + "\n" +
            "Fee: " + df2.format(getFee()) + "\n" +
            "APR: " + df2.format(getApr());
        return text;
    }
    
    
}
