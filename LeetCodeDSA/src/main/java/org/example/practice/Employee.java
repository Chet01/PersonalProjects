package org.example.practice;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        // required by Jackson
    }

    public Employee(int employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

}
