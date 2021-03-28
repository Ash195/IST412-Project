/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Kelvin
 */
public class AccountDashboard extends JPanel {
    
    private GridLayout gl;
    private JLabel accountID, loanTotal, loanMonthly;
    private JButton payLoan;
    
    public AccountDashboard() {
        super();
        
        gl = new GridLayout(5, 1, 10, 10);
        setLayout(gl);
        
        accountID = new JLabel();
        loanTotal = new JLabel();
        loanMonthly = new JLabel();
        
        payLoan = new JButton("Make Payment");
        
        accountID.setHorizontalAlignment(JLabel.CENTER);
        loanTotal.setHorizontalAlignment(JLabel.CENTER);
        loanMonthly.setHorizontalAlignment(JLabel.CENTER);
        
        add(accountID);
        add(loanTotal);
        add(loanMonthly);
        add(payLoan);
    }
    
    public void setUpDashboard(int id, double total, double monthly) {
        DecimalFormat df2 = new DecimalFormat("#.##");
        String text = String.valueOf(id);
        accountID.setText("Account ID: " + text);
        
        String text2 = String.valueOf(df2.format(total));
        loanTotal.setText("Current Loan Balance: " + text2);
        
        String text3 = String.valueOf(df2.format(monthly));
        loanMonthly.setText("Monthly Balance Due: " + text3);
    }
}
