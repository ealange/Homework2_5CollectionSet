package com.example.homework2_5collectionset.service;

import com.example.homework2_5collectionset.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> printAllEmployee();

    public boolean fillOutListEmployee();

    public Employee print(String name, String surname);

    public boolean add(String name, String surname);

    public Employee search(String name, String surname);

    public boolean remove(String name, String surname);
    //public double getCalculateSalarySum();
    //public int getCalculateAverageSalary();
    //public int getEmployeeMinSalary();
    //public double getEmployeeMaxSalary();

}
