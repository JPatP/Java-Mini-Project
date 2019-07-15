/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.main;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MainView extends JFrame {
    
    public MainView() {
        createMainView();
    }
    
    public void createMainView() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Library System");
        frame.setVisible(true);
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
      
        
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.red);
        
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.yellow);
        
        frame.add(leftPanel);
        frame.add(rightPanel);
        
        frame.setVisible(true);
    }
    
}
