/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import main.App;

/**
 *
 * @author clarissapun
 */
public class CreateAccountView{
    JFrame frame;
    JPanel panel;
    JTextField fName, lName, email, phone, username, password;
    JButton next, back, done;
    String firstName, lastName, emailaddress, phonenum;
    Controller controller;
    
    public CreateAccountView(Controller controller){
        this.controller = controller;
        frame = new JFrame("Create Account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(170, 350);
        initComponents();
    }
    public JButton getNext(){
        return next;
    }
    public JButton getDone(){
        return done;
    }
    
    private void initComponents(){
        panel = new JPanel();
        fName = new JTextField(10);
        lName = new JTextField(10);
        email = new JTextField(10);
        phone = new JTextField(10);

        next = new JButton("Next");
        controller.addListener(next);
        panel.add(new JLabel("First Name: "));
        panel.add(fName);
        panel.add(new JLabel("Last Name: "));
        panel.add(lName);
        panel.add(new JLabel("Email: "));
        panel.add(email);
        panel.add(new JLabel("Phone: "));
        panel.add(phone);
        panel.add(new JLabel("Page 1 of 2"));
        panel.add(next);
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }
    public void setUserValues(){
        System.out.println("saved");
        firstName = fName.getText();
        lastName = lName.getText();
        emailaddress = email.getText();
        phonenum = phone.getText();
    }
    public void next() {
        panel = new JPanel();
        username = new JTextField(10);
        password = new JTextField(10);
        
        done = new JButton("Finish");
        controller.addListener(done);
        
        panel.add(new JLabel("username: "));
        panel.add(username);
        panel.add(new JLabel("password: "));
        panel.add(password);
        panel.add(new JLabel("Page 2 of 2"));
        panel.add(done);
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }
    public void cannotCreate(){
        JOptionPane.showMessageDialog(null, "username is taken");
    }
    public String getUsername(){
        return username.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public String getPhonenum() {
        return phonenum;
    }

}
