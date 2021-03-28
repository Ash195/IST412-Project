/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Kelvin
 */
public class MainFrame extends JFrame {
    
    private AccountDashboard dashboard;
    
    public MainFrame() {
        super("eFinance");
        
        dashboard = new AccountDashboard();
        getContentPane().add(dashboard);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.lightGray);
        setSize(1920,1080);
        setVisible(true);
    }

    /**
     * @return the dashboard
     */
    public AccountDashboard getDashboard() {
        return dashboard;
    }

    /**
     * @param dashboard the dashboard to set
     */
    public void setDashboard(AccountDashboard dashboard) {
        this.dashboard = dashboard;
    }
}
