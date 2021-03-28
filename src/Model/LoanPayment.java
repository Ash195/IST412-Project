/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kelvin
 */
public class LoanPayment {
    
    private double principal;
    private double apr;
    private double total;
    
    public LoanPayment(double principal, double apr) {
        
        this.principal = principal;
        this.apr = apr;
        
        calculateLoanTotal();
    }
    
    private void calculateLoanTotal() {
        setTotal((getPrincipal() * (getApr() / 100)) + getPrincipal());
    }
    
    public double pay(double amount) {
        setTotal(getTotal() - amount);
        
        return getTotal();
    }

    /**
     * @return the principal
     */
    public double getPrincipal() {
        return principal;
    }

    /**
     * @param principal the principal to set
     */
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    /**
     * @return the apr
     */
    public double getApr() {
        return apr;
    }

    /**
     * @param apr the apr to set
     */
    public void setApr(double apr) {
        this.apr = apr;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
}
