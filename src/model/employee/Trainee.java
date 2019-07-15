package model.employee;

public class Trainee extends EmployeeModel {

    public Trainee() {
    }

    public Trainee(int employeeNumber, String employeeType, String name, String contactInfo, String businessUnit, int totalPenalty, int itemsBorrowed) {
            super(employeeNumber, employeeType, name, contactInfo, businessUnit, totalPenalty, itemsBorrowed);

    }

}
