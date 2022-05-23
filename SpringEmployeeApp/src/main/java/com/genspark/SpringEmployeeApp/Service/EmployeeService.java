package com.genspark.SpringEmployeeApp.Service;

import com.genspark.SpringEmployeeApp.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int employeeID);
    Employee addEmployee(Employee employee);
    Employee upDateEmployee(Employee employee);
    String deleteEmployeeById(int EmployeeID);
}
