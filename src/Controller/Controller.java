package Controller;

import Model.UserData;
import View.CreateAccountView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author clarissapun
 */
public class Controller implements ActionListener{
    CreateAccountView view;
    UserData model;
    
    public Controller(UserData database){
        view = new CreateAccountView(this);
        model = database;
    }
    private void createAccount(){
        if(!model.isUserNameTaken(view.getUsername())){
            model.registerUser(view.getUsername(), view.getPassword());
        }else{
            view.cannotCreate();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.getNext()){
            view.setUserValues();
            view.next();
        }
        if(e.getSource()==view.getDone()){
            createAccount();
        }
    }
    public void addListener(JButton b){
        b.addActionListener(this);
    }
}
