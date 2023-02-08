package com.example.homework2_5collectionset.service;

import com.example.homework2_5collectionset.exception.EmployeeAlreadyAddedException;
import com.example.homework2_5collectionset.exception.EmployeeNotFoundException;
import com.example.homework2_5collectionset.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>();

    @Override
    public boolean fillOutListEmployee() {
        employees.add(new Employee("Pushkin", "Alex"));
        employees.add(new Employee("ivanov", "IvanI"));
        employees.add(new Employee("sidorov", "SidorS"));
        employees.add(new Employee("petrov", "PetrP"));
        employees.add(new Employee("ivanovv", "IIvan"));
        employees.add(new Employee("sidorovv", "SSidor"));
        return true;
    }

    @Override
    public List<Employee> printAllEmployee() {
        return employees;
    }

    @Override
    public Employee print(String name, String surname) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(name) && employees.get(i).getLastName().equals(surname)) {
                return employees.get(i);
            }

        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    @Override
    public boolean add(String name, String surname) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(name) &&
                    employees.get(i).getLastName().equals(surname)) {
                throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть");
            }
        }
        return employees.add(new Employee(name, surname));
    }

    @Override
    public boolean remove(String name, String surname) {
        Employee forRemove = new Employee(name, surname);
        if (employees.remove(forRemove)) {
            return true;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

    @Override
    public Employee search(String name, String surname) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(name) && employees.get(i).getLastName().equals(surname)) {
                return employees.get(i);
            }

        }
        throw new EmployeeNotFoundException("Сотрудник не найден");
    }

}

//@Override
// public double getCalculateSalarySum() {
//     double sum = 0;
//     for (Employee employee : empolyees) {
//        if (employee == null) continue;
//        sum += employee.getSalary();
//    }
//    return sum;
//}

// @Override
// public int getCalculateAverageSalary() {
//     return 0;
// }
//
// @Override
// public int getEmployeeMinSalary() {
//     int minSalary = -1;
//     Employee minSalaryEmployee = null;
//     int indexMinSalaryEmployee = 0;
//     for (int i = 0; i < empolоyeeBook.length; i++) {
//         if (empolоyeeBook[i] != null) {
//             minSalary = empolоyeeBook[i].getSalary();
//             minSalaryEmployee = empolоyeeBook[i];
//             indexMinSalaryEmployee = i;
//             break;
//         }
//     }
//
//     @Override
//     public double getEmployeeMaxSalary () {
//         return 0;
//     }
// }
