package com.genspark.SpringEmployeeApp.Controller;

import com.genspark.SpringEmployeeApp.Entity.Employee;
import com.genspark.SpringEmployeeApp.Service.EmployeeService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home()
    {
        return "<HTML><H1>Welcome to the Employee Application</H1></HTML>";
    }
    @GetMapping("/employees")
    public List<Employee> getEmployee()
    {
      return this.employeeService.getAllEmployee();
    }
    @GetMapping("/employees/{employeeID}")
    public Employee getEmployee(@PathVariable String employeeID)
    {
        return this.employeeService.getEmployeeById(Integer.parseInt(employeeID));
    }
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
      return this.employeeService.addEmployee((employee));
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return this.employeeService.upDateEmployee(employee);
    }
    @DeleteMapping("/employees/{employeeID}")
    public String deleteEmployee(@PathVariable String employeeID){
        return this.employeeService.deleteEmployeeById(Integer.parseInt(employeeID));
    }

}
