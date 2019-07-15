package model.employee;

import java.util.ArrayList;

public class EmployeeModel {

    private int employeeNumber, itemsBorrowed, totalPenalty;
    private String name, businessUnit, contactInfo, employeeType;

    public EmployeeModel() {
    }

    public EmployeeModel(int employeeNumber, String employeeType, String name, String contactInfo, String businessUnit,
            int totalPenalty, int itemsBorrowed) {

        this.employeeNumber = employeeNumber;
        this.employeeType = employeeType;
        this.name = name;
        this.contactInfo = contactInfo;
        this.businessUnit = businessUnit;
        this.totalPenalty = totalPenalty;
        this.itemsBorrowed = itemsBorrowed;
    }

    // total penalty
    public int getTotalPenalty() {
        return this.totalPenalty;
    }

    public void setTotalPenalty(int totalPenalty) {
        this.totalPenalty = totalPenalty;
    }

    // contact info
    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // items borrowed
    public int getItemsBorrowed() {
        return this.itemsBorrowed;
    }

    public void setItemsBorrowed(int itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }

    // emp type
    public String getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    // emp number
    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    // business unit
    public String getBusinessUnit() {
        return this.businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

}
