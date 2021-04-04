/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DashboardCntl;

/**
 *
 * @author clarissapun
 */
public class DashboardView extends javax.swing.JFrame {

    private String name;
    private String balance = "";
    /**
     * Creates new form DashboardView
     */
    public DashboardView(DashboardCntl dc, String name, double bal) {
        this.name = name;
        this.balance += bal;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        userBalanceLabel = new javax.swing.JLabel();
        payBtn = new javax.swing.JButton();
        requestBtn = new javax.swing.JButton();
        historyBtn = new javax.swing.JButton();
        profileBtn = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setText("Welcome Back, ");

        userLabel.setText(name);

        balanceLabel.setText("Current Balance:");

        userBalanceLabel.setText(balance);

        payBtn.setText(" Make a Payment ");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        requestBtn.setText(" Request a Loan  ");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        historyBtn.setText("View Account History");

        profileBtn.setText("View Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(requestBtn)
                        .addComponent(payBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(historyBtn)
                        .addGap(2, 2, 2))
                    .addComponent(profileBtn))
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(balanceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userBalanceLabel)))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(welcomeLabel)
                            .addComponent(userLabel)
                            .addComponent(profileBtn))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(balanceLabel)
                        .addComponent(userBalanceLabel)))
                .addGap(7, 7, 7)
                .addComponent(payBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(requestBtn)
                .addGap(48, 48, 48)
                .addComponent(historyBtn)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payBtnActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton historyBtn;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton profileBtn;
    private javax.swing.JButton requestBtn;
    private javax.swing.JLabel userBalanceLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the balanceLabel
     */
    public javax.swing.JLabel getBalanceLabel() {
        return balanceLabel;
    }

    /**
     * @param balanceLabel the balanceLabel to set
     */
    public void setBalanceLabel(javax.swing.JLabel balanceLabel) {
        this.balanceLabel = balanceLabel;
    }

    /**
     * @return the historyBtn
     */
    public javax.swing.JButton getHistoryBtn() {
        return historyBtn;
    }

    /**
     * @param historyBtn the historyBtn to set
     */
    public void setHistoryBtn(javax.swing.JButton historyBtn) {
        this.historyBtn = historyBtn;
    }

    /**
     * @return the jFrame1
     */
    public javax.swing.JFrame getjFrame1() {
        return jFrame1;
    }

    /**
     * @param jFrame1 the jFrame1 to set
     */
    public void setjFrame1(javax.swing.JFrame jFrame1) {
        this.jFrame1 = jFrame1;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the payBtn
     */
    public javax.swing.JButton getPayBtn() {
        return payBtn;
    }

    /**
     * @param payBtn the payBtn to set
     */
    public void setPayBtn(javax.swing.JButton payBtn) {
        this.payBtn = payBtn;
    }

    /**
     * @return the profileBtn
     */
    public javax.swing.JButton getProfileBtn() {
        return profileBtn;
    }

    /**
     * @param profileBtn the profileBtn to set
     */
    public void setProfileBtn(javax.swing.JButton profileBtn) {
        this.profileBtn = profileBtn;
    }

    /**
     * @return the requestBtn
     */
    public javax.swing.JButton getRequestBtn() {
        return requestBtn;
    }

    /**
     * @param requestBtn the requestBtn to set
     */
    public void setRequestBtn(javax.swing.JButton requestBtn) {
        this.requestBtn = requestBtn;
    }

    /**
     * @return the userBalanceLabel
     */
    public javax.swing.JLabel getUserBalanceLabel() {
        return userBalanceLabel;
    }

    /**
     * @param userBalanceLabel the userBalanceLabel to set
     */
    public void setUserBalanceLabel(javax.swing.JLabel userBalanceLabel) {
        this.userBalanceLabel = userBalanceLabel;
    }

    /**
     * @return the userLabel
     */
    public javax.swing.JLabel getUserLabel() {
        return userLabel;
    }

    /**
     * @param userLabel the userLabel to set
     */
    public void setUserLabel(javax.swing.JLabel userLabel) {
        this.userLabel = userLabel;
    }

    /**
     * @return the welcomeLabel
     */
    public javax.swing.JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    /**
     * @param welcomeLabel the welcomeLabel to set
     */
    public void setWelcomeLabel(javax.swing.JLabel welcomeLabel) {
        this.welcomeLabel = welcomeLabel;
    }
}