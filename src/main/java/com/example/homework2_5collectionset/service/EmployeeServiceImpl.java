package com.example.homework2_5collectionset.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> empolyees = new ArrayList<>();

    @Override
    public boolean fillOutListEmployee() {
        empolyees.add (new Employee("Pushkin Alex", 5, 123465));
        empolyees.add(new Employee("ivanov IvanI", 2, 11111));
        empolyees.add(new Employee("sidorov SidorS", 1, 22222));
        empolyees.add(new Employee("petrov PetrP", 1, 33333));
        empolyees.add(new Employee("ivanovv IIvan", 4, 11110));
        empolyees.add(new Employee("sidorovv SSidor", 3, 22220));
        empolyees.add(new Employee(null, 5, 33335));
        return true;
    }

    @Override
    public List <Employee> printAllEmployee() {
        return empolyees;
    }

    @Override
    public int getCalculateSalarySum() {
        return 0;
    }

    @Override
    public int getCalculateAverageSalary() {
        return 0;
    }

    @Override
    public int getEmployeeMinSalary() {
        return 0;
    }

    @Override
    public double getEmployeeMaxSalary() {
        return 0;
    }
}
