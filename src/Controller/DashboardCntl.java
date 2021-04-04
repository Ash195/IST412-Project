/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.DashboardView;
import Model.Account;
import Model.AccountList;
import Model.Customer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kelvin
 */
public class DashboardCntl {
    
    private Account account;
    private DashboardView dashboard;
    
    public DashboardCntl(Account account) {
        this.account = account;
        
        dashboard = new DashboardView(this, account.getCustomerInfo().getFirstName(), account.getBalance());
        
    }
    
    public void buttonListeners() {
        
        dashboard.getProfileBtn().addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        dashboard.getPayBtn().addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        dashboard.getRequestBtn().addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        dashboard.getHistoryBtn().addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
}
