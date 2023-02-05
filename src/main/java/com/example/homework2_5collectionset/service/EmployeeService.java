package com.example.homework2_5collectionset.service;

import java.util.List;

public interface EmployeeService {
    public List<Employee> printAllEmployee();
    public boolean fillOutListEmployee();
    public int getCalculateSalarySum();
    public int getCalculateAverageSalary();
    public int getEmployeeMinSalary();
    public double getEmployeeMaxSalary();

}
