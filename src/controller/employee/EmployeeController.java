package controller.employee;

import java.util.ArrayList;

import model.employee.EmployeeModel;
import model.employee.Engineer;
import model.employee.Trainee;
import model.employee.Trainer;
import view.employee.EmployeeView;

/**
 * CONTROLLER FOR 1 ARRAYLIST EMPLOYEES
 */
public class EmployeeController {
	public static ArrayList<EmployeeModel> employee = new ArrayList<EmployeeModel>();

	String[] columnNames = { "Employee No.", "Employee Type", "Name", "Contact No.", "Business Unit", "Total Penalty",
			"Items Borrowed" };

	public void init() {

		employee.add(new Trainee(1, "Trainee", "Pat", "09060130867", "Dev B", 0, 0));
		employee.add(new Trainee(2, "Trainee", "Ken", "09060130867", "Dev C", 0, 0));
		employee.add(new Trainee(3, "Trainee", "Mariz", "09060130867", "Dev D", 0, 0));
		employee.add(new Trainee(4, "Trainee", "Jon", "09060130867", "Dev F", 0, 0));
		// Trainer
		employee.add(new Trainer(5, "Trainer", "Mary Ann Mateo", "09456634423", "ACTION", 0, 0));
		employee.add(new Trainer(6, "Trainer", "Chie Imoto", "09274450987", "ACTION", 0, 0));
		employee.add(new Trainer(7, "Trainer", "Masami Namita", "09172425587", "ACTION", 0, 0));
		// Engineer
		employee.add(new Engineer(8, "Engineer", "Shirley", "09456634423", "Dev 2", 0, 0));
		employee.add(new Engineer(9, "Engineer", "Glaiza", "09274450987", "Dev K", 0, 0));
		employee.add(new Engineer(10, "Engineer", "Gzelly Joy", "09172425587", "Dev A", 0, 0));
		EmployeeView empView = new EmployeeView();
		empView.createGUI(employee, columnNames);

	}

	public void addEmp(String strEmpNumber, String strEmpType, String strEmpName, String strEmpCnt, String strEmpBU,
			String strEmpPenalty, String strEmpBorrow) {
		System.out.println("Inside print addemp before try");
		try {
			System.out.println("Inside print addemp inside try");
			employee.add(new Trainee(Integer.parseInt(strEmpNumber), strEmpType, strEmpName, strEmpCnt, strEmpBU,
					Integer.parseInt(strEmpPenalty), Integer.parseInt(strEmpBorrow)));

		} catch (Exception e) {
			System.out.println("Inside print addemp inside catch");
			e.printStackTrace();

		}

	}

}

/**
 *
 * @author Evil Genius
 */
