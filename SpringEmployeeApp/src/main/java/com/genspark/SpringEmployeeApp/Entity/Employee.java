package com.genspark.SpringEmployeeApp.Entity;

public class Employee {
    private int employeeid;
    private String  email;
    private String department;
    private String name;

    public Employee() {
    }

    public Employee(int employeeid, String email, String department, String name) {
        this.employeeid = employeeid;
        this.email = email;
        this.department = department;
        this.name = name;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public void getEmail(String email) {
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
}
