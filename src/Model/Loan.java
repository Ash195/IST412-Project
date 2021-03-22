/**
 * 
 */
package Model;

import java.text.DecimalFormat;

/**
 * Loan class that calculate loan based on the loan type.
 * @author Aung Nay
 */
public abstract class Loan implements Cloneable{
    private String loanID;
    private LoanType loanType;
    private double principal;
    private double interestRate; //annually
    private double interest;
    private double fee;
    private double apr;
    private boolean secured = false;
    private int loanTerm; //number of days
    
//    /**
//     *
//     * @param loanType Sets the loan type of the loan.
//     * @param principal Sets the principal amount of the loan.
//     * @param secured Sets if the loan is secured.
//     * @param loanTerm Sets the length of the loan term.
//     */
//    public Loan(double principal, boolean secured, int loanTerm) {
//        //this.loanType = loanType;
//        this.principal = principal;
//        this.secured = secured;
//        this.loanTerm = loanTerm; //set the loan values based on loan type.
//    }
    
    public Loan(){}
    
    public String getLoanID() {
        return loanID;
    }

    public void setLoanID(String loanID) {
        this.loanID = loanID;
    }
    
    /**
     * Calculate all the necessary numbers needed for a loan based on the provided interest rate.
     * @param interestRate Sets the interest rate of the loan.
     */
    abstract void computeLoanCalculation(double interestRate);

    /**
     * Set the correct rates based on the loan type.
     * 
     */
    public final void setLoanTypeValue() {
    switch(loanType){
        case Personal:
            break;

        case Business:
            break;

        case Vehicle: 
            break;
            
        case Renovation:
            break;
            
        case Project:
            break;
            
        default:
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
    
    public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
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
