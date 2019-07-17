/**
 * 
 * @author kenneth.lorico
 */
package view.penalty;
import controller.penalty.*;
import model.employee.*;
import controller.penalty.*;
import controller.employee.*;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.event.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import controller.penalty.*;

public class PenaltyView extends EmployeeController{
	
			public static void main(String[] args) {

				new PenaltyView();
			}

		public PenaltyView() {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					JFrame penaltyWindow = new JFrame("Penalty View");
					penaltyWindow.setPreferredSize(new Dimension(640,424));
					penaltyWindow.setBounds(500, 200, 300, 300);
					penaltyWindow.pack();
					penaltyWindow.setLocationRelativeTo(null);
					penaltyWindow.getContentPane().setBackground(new java.awt.Color(245,245,245));
					penaltyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
					//---------init table and scrollpane---------------
					
					//column names
					String[] colNames = {"Employee Number", "Name", "Business Unit", "Total Penalty"};
					
					//string convert from employee model [x][y]
					String[][] empList = new String[employee.size()][4];
					
					//loop for emplist array
					int i;
					int x = 0;
					for(x = 0; x < 4; x++){
						for ( i = 0; i < employee.size(); i++){
						
						if (x == 0) //employeenumber
							empList[i][x] = ""+(employee.get(i).getEmployeeNumber());
						if (x == 1) //employee name
							empList[i][x] = ""+(employee.get(i).getName());
						if (x == 2) //employee bu
							empList[i][x] = ""+(employee.get(i).getBusinessUnit());
						if (x == 3) //employee total penalty
							empList[i][x] = ""+(employee.get(i).getTotalPenalty());
						}
					}
				
					//table init
					JTable penaltyTable = new JTable(empList,colNames);
					JScrollPane tblContainer = new JScrollPane(penaltyTable); 
					tblContainer.setPreferredSize(new Dimension(480, 256));
					penaltyTable.setVisible(true);
					
									
					//gbc
					//penaltyWindow.setBorder(new EmptyBorder(-300, 200, 150, 200));
					penaltyWindow.setLayout(new GridBagLayout());
					GridBagConstraints gbc = new GridBagConstraints();
					gbc.anchor = GridBagConstraints.BASELINE;
					gbc.weighty = 1;
					gbc.weightx = 0;
					gbc.gridx = 1;
					gbc.gridy = 2;
					penaltyWindow.add(new JLabel("<html><br><h1><strong>PENALTY LIST</strong></h1></html>"), gbc);
					gbc.anchor = GridBagConstraints.CENTER;
					gbc.gridx = 1;
					penaltyWindow.add(tblContainer,gbc);
					
					
					penaltyWindow.setVisible(true);
					
				}

			});
		}
		
	/*		
		private void ShowPenaltyTable() {
			
			//init table
			String[] colNames = {"Employee Number", "Name", "Business Unit", "Total Penalty"};
			String[][] data = { 
		            { "Kundan Kumar Jha", "4031", "CSE","11" }, 
		            { "Anand Jha", "6014", "IT", "22313" } 
		        }; 
			JTable penaltyTable = new JTable(data,colNames);
		//	penaltyTable.setBounds(30, 40, 100, 100); 
			//penaltyTable.setSize(200, 300);
			penaltyTable.setVisible(true);
			
			
		} */
}



//	public static void main(String[] args) {
//
//		new PenaltyView();
//	}
//
//public PenaltyView() {
//	
//	SwingUtilities.invokeLater(new Runnable() {
//		@Override
//		public void run() {
//			JFrame frame = new JFrame("Penalty");
//			frame.setPreferredSize(new Dimension(700, 560));
//			frame.setBounds(500, 200, 300, 300);
//			frame.add(new displayPenaltyView());
//			frame.pack();
//			frame.setLocationRelativeTo(null);
//			frame.setVisible(true);
//		}
//
//	});
//}
//public class displayPenaltyView extends JPanel {
//
//	
//	public void createPenaltyGUI(){
//		//window init
//		JFrame penaltyWindow = new JFrame();
//		
////		//init elements
////		JFrame.setDefaultLookAndFeelDecorated(true);
////		penaltyWindow.setSize(640,384);
////		//penaltyWindow.pack();
////		penaltyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hindi magkoclose yung app
////		penaltyWindow.setLocationRelativeTo(null);
//		
//		//init elements
//		JFrame.setDefaultLookAndFeelDecorated(true);
//		penaltyWindow.setSize(640,384);
//		//penaltyWindow.pack();
//		penaltyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //hindi magkoclose yung app
//		penaltyWindow.setLocationRelativeTo(null);
//		
//		//penaltyWindow.getContentPane().setBackground(new java.awt.Color(252,252,252));
//		
//		///
//		setBorder(new EmptyBorder(200,200, 200, 200));
//		setLayout(new GridBagLayout());
//
//		GridBagConstraints gbc = new GridBagConstraints();
//		gbc.gridwidth = GridBagConstraints.REMAINDER;
//		gbc.anchor = GridBagConstraints.NORTH;
//
//
//		add(new JLabel("<html><h1><strong><i>Welcome to AWS Library System</i></strong></h1><hr></html>"), gbc);
//
//		gbc.anchor = GridBagConstraints.CENTER;
//		gbc.fill = GridBagConstraints.HORIZONTAL;
//		
//		JButton btn = new JButton("Hello!");
//		//add(new JLabel("<html><h1><strong>PENALTY LIST</strong></h1></html>"));;
////		JLabel title = new JLabel("Penalty List");
////		title.setEnabled(true);
//	//	title.setLocation(100, 200);
//	//	title.setText("PENALTY LIST");
//		
//		//-----------
//		//adds
//		//penaltyWindow.add(title, gb);
//		penaltyWindow.add(btn);
//
//		
//		//set visibles
//		penaltyWindow.setVisible(true);
//		//title.setVisible(true);
//		
////		ShowPenaltyTable();
//	}
//}
//}