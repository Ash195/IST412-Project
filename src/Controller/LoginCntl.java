/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Account;
import Model.AccountList;
import Model.Customer;
import View.LoginUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.Scene;

/**
 *
 * @author Aung Nay
 */
public class LoginCntl implements ActionListener{
    private LoginUI loginUI;
    private RegisterCntl registerCntl;
    private Account account;
    private AccountList accountList;
    private Customer customer;
    private LoginDataCntl loginData;
    private DashboardCntl dashboardCntl;

    public LoginCntl() {
        loginData = new LoginDataCntl();
        account = loginData.getAccount();
        accountList = loginData.getAccountList();
        loginUI = new LoginUI(this);
        loginUI.setVisible(true);
        
        loginUI.registerBtn.addActionListener(this);
        loginUI.loginBtn.addActionListener(this);
        
    }

    public LoginUI getLoginUI() {
        return loginUI;
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == loginUI.registerBtn){
            loginUI.dispose();
            RegisterCntl rc = new RegisterCntl(loginData);            
        }
        
        if(obj == loginUI.loginBtn) {
            if(!account.checkLogin(loginUI.getUsername(), loginUI.getPassword())) {
                loginUI.incorrectLogin();
            } else {
                System.out.println("Login Success");
                dashboardCntl = new DashboardCntl(account);
            }
        }
    }
}
