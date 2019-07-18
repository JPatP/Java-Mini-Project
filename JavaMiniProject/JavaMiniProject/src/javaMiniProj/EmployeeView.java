package javaMiniProj;

import javaMiniProj.EmployeeController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javaMiniProj.EmployeeModel;
import javaMiniProj.Engineer;
import javaMiniProj.Trainee;
import javaMiniProj.Trainer;

public class EmployeeView extends JPanel {

    public EmployeeView() {
        createEmployeeGUI();
    }

    public void createEmployeeGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("View Employees");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);

        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(Color.red);
        panelSouth.setLayout(new BorderLayout());

        JPanel panelNorth = new JPanel();
        panelNorth.setBackground(Color.yellow);
        panelNorth.setLayout(new BorderLayout());
        
        JLabel searchLbl = new JLabel("Search: ");
        
        JTextField jTextField = new JTextField("");
        
        JButton searchBtn = new JButton("Search");
        searchBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JTable results = new JTable(new EmployeeController());
			}
		});
        
        JButton createTraineeBtn = new JButton("Add Trainee");
        
        JTable table = new JTable(new EmployeeController());

        JScrollPane jspane = new JScrollPane(table);
        add(jspane);
        
        Box box = Box.createHorizontalBox();
        box.add(searchLbl);
        box.add(jTextField);
        box.add(searchBtn);
        box.add(createTraineeBtn);
        
        panelSouth.add(jspane, BorderLayout.SOUTH);
        panelNorth.add(box, BorderLayout.NORTH);
        frame.add(panelSouth);
        frame.setContentPane(panelSouth);
        frame.add(panelNorth);
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);

    }
}
//package view.employee;
//
//import controller.employee.*;
//import java.awt.Dimension;
//import java.util.ArrayList;
//import java.util.List;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.JTextField;
//import javax.swing.table.AbstractTableModel;
//import javax.swing.table.DefaultTableModel;
//import model.employee.EmployeeModel;
//import model.employee.Engineer;
//import model.employee.Trainee;
//import model.employee.Trainer;
//
//public class EmployeeView extends JPanel {
//
//    public EmployeeView() {
//        createEmployeeGUI();
//    }
//
//    public void createEmployeeGUI() {
//        JFrame.setDefaultLookAndFeelDecorated(true);
//        JFrame frame = new JFrame("View Employees");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(1000, 500);
//
//        JTable table = new JTable(new EmployeeController());
//
//        JScrollPane jspane = new JScrollPane(table);
//        add(jspane);
//
////        JTextField jTextField = new JTextField("Search ...");
////        jTextField.setBounds(20, 400, 100, 20);
//        
//
//        frame.add(jspane);
////        frame.add(jTextField);
////        frame.setLayout(null);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//
//    }
//
//}
