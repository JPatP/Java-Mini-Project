package view.employee;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.employee.EmployeeController;

public class AddEmployee {

	static JFrame frame;
	JTextField tfEmpNumber, tfEmpType, tfEmpName, tfEmpCnt, tfEmpBu, tfPenalty, tfBorrow;
	JLabel lEmpNumber, lEmpType, lEmpName, lEmpCnct, lEmpBu, lEmpPenalty, lEmpBorrow;
	public String strEmpNumber, strEmpType, strEmpName, strEmpCnt, strEmpBU, strEmpPenalty, strEmpBorrow;
	JPanel panel;
	GridBagLayout gbLayout;
	GridBagConstraints gbConstraints;
	JButton btnSubmit;

	EmployeeController employeeController = new EmployeeController();
	EmployeeView employeeView = new EmployeeView();

	public AddEmployee() {
		start();

	}

	// TODO 1 Create layout
	// TODO 2 Create 7 labels and 7 input text
	// TODO 3 Get input text values
	// TODO 4 Create submit button
	// TODO 5 Call Controller add method
	public void start() {
		frame = new JFrame("Add Employee");
		// Label
		lEmpNumber = new JLabel("Employee No.     ");
		lEmpType = new JLabel("Employee Type     ");
		lEmpName = new JLabel("Name     ");
		lEmpCnct = new JLabel("Contact No.     ");
		lEmpBu = new JLabel("Business Unit     ");
		lEmpPenalty = new JLabel("Total Penalty     ");
		lEmpBorrow = new JLabel("Items Borrowed     ");

		// text input
		tfEmpNumber = new JTextField(10);
		tfEmpNumber.setPreferredSize(new Dimension(150, 30));

		tfEmpType = new JTextField(10);
		tfEmpType.setPreferredSize(new Dimension(150, 30));

		tfEmpName = new JTextField(10);
		tfEmpName.setPreferredSize(new Dimension(150, 30));

		tfEmpCnt = new JTextField(10);
		tfEmpCnt.setPreferredSize(new Dimension(150, 30));

		tfEmpBu = new JTextField(10);
		tfEmpBu.setPreferredSize(new Dimension(150, 30));

		tfPenalty = new JTextField(10);
		tfPenalty.setPreferredSize(new Dimension(150, 30));

		tfBorrow = new JTextField(10);
		tfBorrow.setPreferredSize(new Dimension(150, 30));

		// Panel that holds components
		panel = new JPanel();
		gbLayout = new GridBagLayout();
		panel.setLayout(gbLayout);
		gbConstraints = new GridBagConstraints();

		// text field constraints
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 0;
		panel.add(tfEmpNumber, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 1;
		panel.add(tfEmpType, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 2;
		panel.add(tfEmpName, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 3;
		panel.add(tfEmpCnt, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 4;
		panel.add(tfEmpBu, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 5;
		panel.add(tfPenalty, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 6;
		panel.add(tfBorrow, gbConstraints);

		// label constraints
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 0;
		panel.add(lEmpNumber, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 1;
		panel.add(lEmpType, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 2;
		panel.add(lEmpName, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 3;
		panel.add(lEmpCnct, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 4;
		panel.add(lEmpBu, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 5;
		panel.add(lEmpPenalty, gbConstraints);

		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 6;
		panel.add(lEmpBorrow, gbConstraints);

		// button to add employee
		btnSubmit = new JButton("Add");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				strEmpNumber = tfEmpNumber.getText();
				strEmpType = tfEmpType.getText();
				strEmpName = tfEmpName.getText();
				strEmpCnt = tfEmpCnt.getText();
				strEmpBU = tfEmpBu.getText();
				strEmpPenalty = tfPenalty.getText();
				strEmpBorrow = tfBorrow.getText();

				System.out.println("before add : " + employeeController.employee.size());
				 employeeController.addEmp(strEmpNumber, strEmpType,
				 strEmpName, strEmpCnt, strEmpBU, strEmpPenalty,
				 strEmpBorrow);
				// EmployeeView empView = new EmployeeView();
				// empView.refreshTable();

				System.out.println("after add : " + employeeController.employee.size());
				// employeeView.addEmp2(strEmpNumber, strEmpType, strEmpName,
				// strEmpCnt, strEmpBU, strEmpPenalty,
				// strEmpBorrow);
			}

		});
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 7;
		gbConstraints.gridwidth = 2;
		panel.add(btnSubmit, gbConstraints);

		frame.add(panel);
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}