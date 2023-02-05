package com.example.homework2_5collectionset.controller;

import com.example.homework2_5collectionset.model.Employee;
import com.example.homework2_5collectionset.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.jd10.lange.hw23introductiontomavenandspringboot.service.CalculatorService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee/")


public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/printAll")
    public List<Employee> printAllEmployee() {

        return EmployeeService.printAllEmployee;

    }
    @GetMapping("/fillOutList")
    public List<Employee> fillOutListEmployee() {

        return EmployeeService.fillOutListEmployee;

    }

    @GetMapping("/sumSalary")
    public String getCalculateSalarySum() {
        String calculateSalarySum = employeeService.getCalculateSalarySum();
        return calculateSalarySum;
    }

    @GetMapping("/minSalary")
    public String getEmployeeMinSalary() {
        String employeeMinSalary = employeeService.getEmployeeMinSalary;
        return employeeMinSalary;
    }

    @GetMapping("/maxSalary")
    public String getEmployeeMaxSalary() {
        String employeeMaxSalary = employeeService.getEmployeeMaxSalary();
        return employeeMaxSalary;
    }

    @GetMapping("/averageSalary")
    public String getCalculateAverageSalary() {
        String averageSalaryEmployee = employeeService.getAndCalculateAverageSalary();
        return averageSalaryEmployee;

    }
}
