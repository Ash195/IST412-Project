/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.RegisterUI;
import Model.Account;
import Model.AccountList;
import Model.Customer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.Scene;

/**
 *
 * @author Aung Nay
 */
public class RegisterCntl implements ActionListener{
    private RegisterUI regUI;
    private LoginDataCntl ldc;
    private Account account;
    private AccountList accountList;
    private Customer customer;
    private LoginCntl loginCntl;
    

    public RegisterCntl(LoginDataCntl ldc) {
        createRegisterUI();
        regUI.setVisible(true);
        
        this.ldc = ldc;
        this.account = ldc.getAccount();
        this.accountList = ldc.getAccountList();
        this.customer = ldc.getCustomer();
        System.out.println(accountList.toString());
    }

    public void createRegisterUI() {
        regUI = new RegisterUI(this, account);
        regUI.submitBtn.addActionListener(this);
        regUI.clearBtn.addActionListener(this);
        regUI.checkUsername.addActionListener(this);
        regUI.backBtn.addActionListener(this);
    }
    
    public RegisterUI getRegisterUI() {
        return regUI;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == regUI.clearBtn){
            regUI.newData();
        }
        
        if(obj == regUI.checkUsername){
            if(!regUI.getUsername().equals(""))
            {
                if(accountList.checkUserName(regUI.getUsername())){
                regUI.userNameTakenError();
                } else {
                    regUI.userNameTakenAccept();
                }
                
            }
            
        }
        
        if(obj == regUI.submitBtn){
            if(regUI.checkPassword()) {
                account.setCustomerInfo(regUI.getCustomer());
                account.createAccount(regUI.getUsername(), regUI.getPassword());
                accountList.addAccount(account);
                regUI.registerSuccess();
                accountList.printAccountList();
            }
        }
        
        if(obj == regUI.backBtn){
            regUI.dispose();
            loginCntl = new LoginCntl();
            loginCntl.getLoginUI().toFront();
        }
    }
    
}
