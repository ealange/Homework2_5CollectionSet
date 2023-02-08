package com.example.homework2_5collectionset.controller;

import com.example.homework2_5collectionset.model.Employee;
import com.example.homework2_5collectionset.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee/")


public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в базу данных";
    }

    @GetMapping("/printAll")
    public List<Employee> printAllEmployee() {

        return employeeService.printAllEmployee();

    }

    @GetMapping("/fillOutList")
    public boolean fillOutListEmployee() {

        return employeeService.fillOutListEmployee();

    }

    @GetMapping("/add")
    public boolean add(@RequestParam String name,
                       @RequestParam String surname) {

        return employeeService.add(name, surname);

    }

    @GetMapping("/search")
    public Employee search(@RequestParam String name,
                           @RequestParam String surname) {

        return employeeService.search(name, surname);

    }

    @GetMapping("/remove")
    public boolean remove(@RequestParam String name,
                          @RequestParam String surname) {

        return employeeService.remove(name, surname);

    }

    // @GetMapping("/sumSalary")
    // public String getCalculateSalarySum() {
    //     double calculateSalarySum = employeeService.getCalculateSalarySum();
    //     return String.valueOf(calculateSalarySum);
    // }
//
    // @GetMapping("/minSalary")
    // public String getEmployeeMinSalary() {
    //     String employeeMinSalary = employeeService.getEmployeeMinSalary;
    //     return employeeMinSalary;
    // }
//
    // @GetMapping("/maxSalary")
    // public String getEmployeeMaxSalary() {
    //     String employeeMaxSalary = employeeService.getEmployeeMaxSalary();
    //     return employeeMaxSalary;
    // }
//
    // @GetMapping("/averageSalary")
    // public String getCalculateAverageSalary() {
    //     String averageSalaryEmployee = employeeService.getAndCalculateAverageSalary();
    //     return averageSalaryEmployee;
//
    // }
}
