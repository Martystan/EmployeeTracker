package spring.excercise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.excercise.models.Employee;
import spring.excercise.repositories.EmployeeRepository;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employees")
    public List<Employee>getAllEmployees(){
        return employeeRepository.findAll();
    }
}
