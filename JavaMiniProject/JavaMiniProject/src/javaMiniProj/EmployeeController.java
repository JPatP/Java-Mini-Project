package javaMiniProj;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javaMiniProj.EmployeeModel;

import javaMiniProj.Engineer;
import javaMiniProj.Trainee;
import javaMiniProj.Trainer;
import javaMiniProj.EmployeeView;

/**
 * CONTROLLER FOR 1 ARRAYLIST EMPLOYEES
 */
public class EmployeeController extends AbstractTableModel {

    String[] columnNames = {"Employee No.", "Employee Type", "Name", "Contact No.", "Business Unit", "Total Penalty", "Items Borrowed"};
    List<EmployeeModel> employee = new ArrayList<>();
    Class<?> colClasses[] = {String.class, String.class, String.class, String.class, String.class, int.class, int.class};

    public EmployeeController() {

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
        employee.add(new Engineer(10, "Engineer", "Jelly", "09172425587", "Dev A", 0, 0));
    }

    @Override
    public int getRowCount() {
        return employee.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return colClasses[columnIndex];
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        super.addTableModelListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return employee.get(rowIndex).getEmployeeNumber();
        }
        if (columnIndex == 1) {
            return employee.get(rowIndex).getEmployeeType();
        }
        if (columnIndex == 2) {
            return employee.get(rowIndex).getName();
        }
        if (columnIndex == 3) {
            return employee.get(rowIndex).getContactInfo();
        }
        if (columnIndex == 4) {
            return employee.get(rowIndex).getBusinessUnit();
        }
        if (columnIndex == 5) {
            return employee.get(rowIndex).getTotalPenalty();
        }
        if (columnIndex == 6) {
            return employee.get(rowIndex).getItemsBorrowed();
        }
        return null;
    }

}

/**
 *
 * @author Evil Genius
 */

