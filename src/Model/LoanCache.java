/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Hashtable;

/**
 *
 * @author Aung Nay
 */
public class LoanCache {
    private static Hashtable<String, Loan> loanMap  = new Hashtable<String, Loan>();

   public static Loan getLoan(String loanId) {
      Loan cachedLoan = loanMap.get(loanId);
      return (Loan) cachedLoan.clone();
   }

   // for each shape run database query and create shape
   // shapeMap.put(shapeKey, shape);
   // for example, we are adding three shapes
   
   public static void loadCache() {
      Personal personal = new Personal();
      personal.setLoanID("1");
      loanMap.put(personal.getLoanID(),personal);

      Business business = new Business();
      business.setLoanID("2");
      loanMap.put(business.getLoanID(),business);

      Vehicle vehicle = new Vehicle();
      vehicle.setLoanID("3");
      loanMap.put(vehicle.getLoanID(),vehicle);
      
      Renovation renovation = new Renovation();
      renovation.setLoanID("4");
      loanMap.put(renovation.getLoanID(),renovation);
      
      Project project = new Project();
      project.setLoanID("5");
      loanMap.put(project.getLoanID(),project);
   }
}
