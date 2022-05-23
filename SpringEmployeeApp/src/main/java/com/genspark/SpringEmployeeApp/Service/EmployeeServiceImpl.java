package com.genspark.SpringEmployeeApp.Service;

import com.genspark.SpringEmployeeApp.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
   List<Employee> list;

    public EmployeeServiceImpl() {
        list = new ArrayList<>();
        list.add(new Employee(2044, "john12@gmail.com", "Java", "John"));
        list.add(new Employee(4876,"mark12@gmail.com", "Python", "mark"));
        list.add(new Employee(3486,"jennifer12@gmail.com", "SpringBoot", "Jennifer"));
    }

       @Override
       public List<Employee> getAllEmployee() {
        return list;
       }


    @Override
    public Employee getEmployeeById(int employeeID) {
        Employee e = null;
        for (Employee employee:list)
            {
                if (employee.getEmployeeid() == employeeID)
                {
                    e = employee;
                    break;
                }
            }

        return e;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee upDateEmployee(Employee employee)
    {
        String email = employee.getEmail();
        String department = employee.getDepartment();
        String name = employee.getName();
        Employee c = null;
        for (Employee e:list)
        {
            if (e.getEmployeeid() == employee.getEmployeeid())
            {
              e.setEmail(email);
              e.setDepartment(department);
              e.setName(name);
              c=e;
            }

        }
        return c;
    }

    @Override
    public String deleteEmployeeById(int employeeID) {
        for (Employee employee:list)
        {
            if (employee.getEmployeeid() == employeeID)
            {
                list.remove(employee);
                break;
            }
        }
        return "Deleted Successfully";
    }




}

