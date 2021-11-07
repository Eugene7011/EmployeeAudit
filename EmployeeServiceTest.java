package com.company;

import java.util.Arrays;

public class EmployeeServiceTest {

    public static void main(String[] args) {

        Employee Woody = new Employee(11, "Woody", 35, 100000.00, "Male",
                43, 50);
        Employee Olga = new Employee(12, "Olga", 47, 200000.00, "Female",
                48, 60);
        Employee John = new Employee(13, "John", 22, 50000.00, "Male",
                24, 25);
        Employee Olga2 = new Employee(23, "Olga", 22, 50000.00, "Male",
                24, 25);

        Employee[] employees = {Woody, Olga, John, Olga2};
        EmployeeService employeeService = new EmployeeService(employees);

        for (Employee value : employees) {
            employeeService.print(value);
        }
        System.out.println();

        double sum = 0;
        for (Employee employee : employees) {

            sum += employeeService.calculateSalaryAndBonus(employee);
        }
        System.out.println("Total Salary and bonus of all employees " + sum);
        System.out.println();

        System.out.println(employeeService.getById(13).toString());
        System.out.println();

        employeeService.print(employeeService.getByName("John"));
        System.out.println();

        employeeService.sortByName(employees);
        for (Employee value : employees) {
            employeeService.print(value);
        }
        System.out.println();

        employeeService.sortByNameAndSalary(employees);
        for (Employee value : employees) {
            employeeService.print(value);
        }
        System.out.println();

        Employee testEmployee = new Employee(23, "Rita", 46, 3400.00, "Male", 32, 10);
        employeeService.print(employeeService.edit(testEmployee));

        System.out.println();

        employeeService.remove(12);

        System.out.println();

        EmployeeFactory employeeFactory = new EmployeeFactory();

        Employee[] generatedEmployees = employeeFactory.generateEmployees(3);
        for (Employee value : generatedEmployees) {
            employeeService.print(value);
        }
        System.out.println();

    }

}



