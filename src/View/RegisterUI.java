/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;



import Controller.RegisterCntl;
import java.util.Date;
import java.util.HashSet;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import Model.Account;
import Model.Customer;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Aung Nay
 */
public class RegisterUI extends javax.swing.JFrame {
    private Account account;
    private RegisterCntl regCntl;
    //private ImageIcon icon = new ImageIcon("/Resource/ok-icon.png", "accepted");
    /**
     * Creates new form ProjectUI
     */
    public RegisterUI(RegisterCntl regCntl, Account account) {
        this.regCntl = regCntl;
        this.account = account;
        initComponents();
        initData();
    }
    
    public void initData(){
        check.setVisible(false);
    }

    public void setEmail(String email) {
        this.email.setText(email);
    }

    public void setFirstName(String firstName) {
        this.firstName.setText(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.setText(lastName);
    }

    public void setPassword(String password) {
        this.password.setText(password);
    }

    public void setPhNumber(String phNumber) {
        this.phNumber.setText(phNumber);
    }

    public void setUsername(String username) {
        this.username.setText(username);
    }
    
    public void setPassword2(String password) {
        this.password2.setText(password);
    }

    public String getFirstName() {
        return firstName.getText();
    }
    
    public String getLastName() {
        return lastName.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    public String getPassword2() {
        return password2.getText();
    }

    public String getPhoneNumber() {
        return phNumber.getText();
    }

    public String getUsername() {
        return username.getText();
    }
    
    public String getEmail() {
        return email.getText();
    }
    
    

    public void newData() {
        setFirstName("");
        setLastName("");
        setEmail("");
        setPhNumber("");
        
        setUsername("");
        setPassword("");
        setPassword("");
    }
    
    public void resetLogin() {
        setUsername("");
        setPassword("");
        setPassword("");
    }

    @Override
    public String getTitle() {
        return lastName.getText();
    }

    @Override
    public void setTitle(String title) {
        this.lastName.setText(title);
    }
    
    public void updateData(Account account){
        this.account = account;
        setFirstName(account.getCustomerInfo().getFirstName());
        setLastName(account.getCustomerInfo().getLastName());
        setEmail(account.getCustomerInfo().getEmail());
        setPhNumber(account.getCustomerInfo().getPhoneNumber());
    }
    
    //method to check for username violation
    public void userNameTakenError() {
        JOptionPane.showMessageDialog(rootPane, "Username is taken, please try a different username", "Username Error", JOptionPane.ERROR_MESSAGE);
        check.setVisible(false);
    }
    
    public void userNameTakenAccept() {
        check.setVisible(true);
    }
    
    public boolean checkPassword() {
        
        char[] charArray = new char[] 
        {'@', '%', '$', '#', '&', '!', '*', '?', '[', ']'};
        int conditions = 0;
        String pass = password.getText();
        
        
        //System.out.println(charArray);
        
        //checking for 9 charcters length password
        if(pass.length() >= 9) {
            charCheck.setForeground(Color.decode("#68D06F"));
            conditions++;
        } else charCheck.setForeground(Color.RED);
        
        //checking for number in password
        for(int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if(Character.isDigit(ch)){
                numCheck.setForeground(Color.decode("#68D06F"));
                conditions++;
                break;
            } else numCheck.setForeground(Color.RED);            
        }
        
        // checking for special character in password
        for(int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if(new String(charArray).contains(Character.toString(ch))){
                specialCheck.setForeground(Color.decode("#68D06F"));
                conditions++;
                break;
            } else specialCheck.setForeground(Color.RED);            
        }
        
        if(!pass.equals(pass.toLowerCase()) && !pass.equals(pass.toUpperCase())) {
            caseCheck.setForeground(Color.decode("#68D06F"));
            conditions++;
        } else caseCheck.setForeground(Color.RED);
        
        
        System.out.println(conditions);
        
        
        if(conditions == 4) {
            if(!pass.equals(password2.getText())) { 
                JOptionPane.showMessageDialog(null, "Password entered does not match", "Password Error", JOptionPane.ERROR_MESSAGE);
            }
            else return true;
        }
        return false;
    }
    
    public void registerSuccess(){
        ImageIcon icon = new ImageIcon("/Resource/ok-icon.png");
        JOptionPane.showMessageDialog(rootPane, "Account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    
    public Customer getCustomer(){
        return new Customer(getFirstName(), getLastName(), getEmail(), getPhoneNumber());
        
    }
    
//    public Account getEnterProject(){
//        Account pro1 = new ProjectInfo(getTitle(), getDateStart(), getDateEnd(), getProjectRole(), getDateEndCurrent()); 
//        pro1.setDescription(getDescription());
//        return pro1;
//    } 

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        projectHeader = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        loginInfo = new javax.swing.JPanel();
        titleLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        dateStartLabel2 = new javax.swing.JLabel();
        charCheck = new javax.swing.JLabel();
        numCheck = new javax.swing.JLabel();
        specialCheck = new javax.swing.JLabel();
        caseCheck = new javax.swing.JLabel();
        password2 = new javax.swing.JTextField();
        dateStartLabel3 = new javax.swing.JLabel();
        check = new javax.swing.JLabel();
        customerInfo = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        dateStartLabel = new javax.swing.JLabel();
        dateStartLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        phNumber = new javax.swing.JTextField();
        dateEndLabel = new javax.swing.JLabel();
        checkUsername = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        projectHeader.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        projectHeader.setText("Register");

        submitBtn.setText("Submit");

        clearBtn.setText("Clear");
        clearBtn.setActionCommand("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        titleLabel1.setText("User Name");
        titleLabel1.setToolTipText("");

        username.setToolTipText("Enter your username");

        password.setToolTipText("Enter your password");

        dateStartLabel2.setText("Password");

        charCheck.setText("At least 9 characters");

        numCheck.setText("Include number");

        specialCheck.setText("Include at least one special character, e.g., ! @ # ? ]");

        caseCheck.setText("Include both lower and uppercase letters");

        password2.setToolTipText("Enter your password again");

        dateStartLabel3.setText("Comfim Password");

        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/ok-icon.png"))); // NOI18N
        check.setPreferredSize(new java.awt.Dimension(34, 34));

        javax.swing.GroupLayout loginInfoLayout = new javax.swing.GroupLayout(loginInfo);
        loginInfo.setLayout(loginInfoLayout);
        loginInfoLayout.setHorizontalGroup(
            loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(caseCheck)
                    .addComponent(specialCheck)
                    .addComponent(numCheck)
                    .addComponent(charCheck)
                    .addGroup(loginInfoLayout.createSequentialGroup()
                        .addGroup(loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginInfoLayout.createSequentialGroup()
                                .addGroup(loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateStartLabel2)
                                    .addComponent(dateStartLabel3))
                                .addGap(156, 156, 156))
                            .addGroup(loginInfoLayout.createSequentialGroup()
                                .addComponent(titleLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(password2)
                            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        loginInfoLayout.setVerticalGroup(
            loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel1)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateStartLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateStartLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(charCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specialCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caseCheck)
                .addGap(31, 31, 31))
        );

        username.getAccessibleContext().setAccessibleDescription("Enter your username here");
        password.getAccessibleContext().setAccessibleDescription("Enter your password here");

        titleLabel.setText("First Name");
        titleLabel.setToolTipText("");

        lastName.setToolTipText("Enter your last name here");

        firstName.setToolTipText("Enter your first name here");

        dateStartLabel.setText("Last Name");

        dateStartLabel1.setText("Email");

        email.setToolTipText("Enter your email here");

        phNumber.setToolTipText("Enter your phone number here");
        phNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phNumberActionPerformed(evt);
            }
        });

        dateEndLabel.setText("Phone Number");
        dateEndLabel.setToolTipText("Enter the date (mm/yy) when you finished your project");

        javax.swing.GroupLayout customerInfoLayout = new javax.swing.GroupLayout(customerInfo);
        customerInfo.setLayout(customerInfoLayout);
        customerInfoLayout.setHorizontalGroup(
            customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerInfoLayout.createSequentialGroup()
                        .addComponent(dateStartLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerInfoLayout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerInfoLayout.createSequentialGroup()
                        .addGroup(customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateStartLabel1)
                            .addComponent(dateEndLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(email))))
                .addGap(20, 20, 20))
        );
        customerInfoLayout.setVerticalGroup(
            customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerInfoLayout.createSequentialGroup()
                .addGroup(customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerInfoLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(dateStartLabel)
                        .addGap(25, 25, 25)
                        .addComponent(dateStartLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(dateEndLabel))
                    .addGroup(customerInfoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(customerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        lastName.getAccessibleContext().setAccessibleDescription("Enter your last name here");
        firstName.getAccessibleContext().setAccessibleDescription("Enter your first name here");
        email.getAccessibleContext().setAccessibleDescription("Enter your email here");
        phNumber.getAccessibleContext().setAccessibleDescription("Enter your phone number here");

        jLayeredPane1.setLayer(loginInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(customerInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(customerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        checkUsername.setText("Check Username");
        checkUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUsernameActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearBtn)
                .addGap(18, 18, 18)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn)
                    .addComponent(clearBtn)
                    .addComponent(checkUsername)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clearBtn.getAccessibleContext().setAccessibleName("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void phNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phNumberActionPerformed

    private void checkUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUsernameActionPerformed
        
    
    }//GEN-LAST:event_checkUsernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caseCheck;
    private javax.swing.JLabel charCheck;
    private javax.swing.JLabel check;
    public javax.swing.JButton checkUsername;
    public javax.swing.JButton clearBtn;
    private javax.swing.JPanel customerInfo;
    private javax.swing.JLabel dateEndLabel;
    private javax.swing.JLabel dateStartLabel;
    private javax.swing.JLabel dateStartLabel1;
    private javax.swing.JLabel dateStartLabel2;
    private javax.swing.JLabel dateStartLabel3;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JPanel loginInfo;
    private javax.swing.JLabel numCheck;
    private javax.swing.JTextField password;
    private javax.swing.JTextField password2;
    private javax.swing.JTextField phNumber;
    private javax.swing.JLabel projectHeader;
    private javax.swing.JLabel specialCheck;
    public javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
