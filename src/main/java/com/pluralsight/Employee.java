package com.pluralsight;

public class Employee {

    //class attributes
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    //the constructor to help us create an employee
    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    //getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //derived getters
    public double getTotalPay() {

        //calculate regular and overtime pay assuming 1.5 the pay rate for overtime.
        //that was not in the instructions
        double regularPay = this.getRegularHours() * this.getPayRate();
        double overTimePay = this.getOvertimeHours() * this.getPayRate() * 1.5;

        return regularPay + overTimePay;
    }

    public int getRegularHours() {

//        if( this.getHoursWorked() > 40){
//            return 40;
//        }
//
//        return this.getHoursWorked();

        return this.getHoursWorked() > 40 ? 40 : this.getHoursWorked();
    }

    public int getOvertimeHours() {
//        if( this.getHoursWorked() > 40){
//            return this.getHoursWorked() - 40;
//        }
//
//        return 0;

        return this.getHoursWorked() > 40 ? this.getHoursWorked() - 40 : 0;
    }

}
