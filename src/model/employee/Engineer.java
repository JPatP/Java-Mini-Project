package model.employee;

public class Engineer extends EmployeeModel {

    public Engineer() {
    }

    public Engineer(int employeeNumber, String employeeType, String name, String contactInfo, String businessUnit, int totalPenalty, int itemsBorrowed) {
        super(employeeNumber, employeeType, name, contactInfo, businessUnit, totalPenalty, itemsBorrowed);
    }

}
