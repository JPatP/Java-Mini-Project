package view.employee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import model.employee.EmployeeModel;

public class EmployeeView {

	public void createGUI(ArrayList<EmployeeModel> employee, String[] columnNames) {

		DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
			public Class getColumnClass(int column) {
				Class returnValue;
				if ((column >= 0) && (column < getColumnCount())) {
					returnValue = getValueAt(0, column).getClass();
				} else {
					returnValue = Object.class;
				}
				return returnValue;
			}
		};

		for (int i = 0; i < employee.size(); i++) {
			String number = String.valueOf(employee.get(i).getEmployeeNumber());
			String type = employee.get(i).getEmployeeType();
			String name = employee.get(i).getName();
			String contact = employee.get(i).getContactInfo();
			String bu = employee.get(i).getBusinessUnit();
			String penalty = String.valueOf(employee.get(i).getTotalPenalty());
			String borrowed = String.valueOf(employee.get(i).getItemsBorrowed());

			Object rows[] = { number, type, name, contact, bu, penalty, borrowed };
			model.addRow(rows);

		}
		JTable table = new JTable(model);
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
		table.setRowSorter(sorter);
		JScrollPane pane = new JScrollPane(table);

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("View Employees");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 500);

		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(Color.red);
		panelSouth.setLayout(new BorderLayout());

		JPanel panelNorth = new JPanel();
		panelNorth.setLayout(new FlowLayout(FlowLayout.LEFT));

		// Upper panel attributes
		JLabel jLabel = new JLabel("Search: ");

		JTextField jTextField = new JTextField(" ");
		jTextField.setPreferredSize(new Dimension(150, 30));

		JButton btn = new JButton("Search");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = jTextField.getText();
				if (text.length() == 0) {
					sorter.setRowFilter(null);
					JOptionPane.showMessageDialog(frame, "Input something");
				} else {
					sorter.setRowFilter(RowFilter.regexFilter(text));
					if (table.getRowCount() < 1) {
						JOptionPane.showMessageDialog(frame,
								"No records found. \nCheck for unnecesary spaces in the search box");
					}

				}
			}
		});

		panelSouth.add(pane, BorderLayout.SOUTH);
		panelNorth.add(jLabel);
		panelNorth.add(jTextField);
		panelNorth.add(btn);

		frame.add(panelSouth);
		frame.setContentPane(panelSouth);
		frame.setLocationRelativeTo(null);
		frame.add(panelNorth);

		frame.setVisible(true);

	}

}
