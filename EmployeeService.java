package com.company;
import java.util.*;

public class EmployeeService {

    Employee[] employees;

    public EmployeeService(Employee[] employees){
        this.employees = employees;

    }

    public void print(Employee employee){
        System.out.println("id " + employee.id + ", name " + employee.name +", age " + employee.age +
                ", salary " + employee.salary + ", gender " + employee.gender +
                ", fixedBugs " + employee.fixedBugs + ", defaultBugRate " + employee.defaultBugRate);
    }
    public double calculateSalaryAndBonus(Employee employee){
        return  employee.salary + employee.fixedBugs* employee.defaultBugRate;
    }

    public Employee getById(long id){
        for (Employee employee : employees) {
            if (employee.id == id) {
                return employee;
            }
        }
      return null;
    }

    public Employee getByName(String name){
        Employee temp = new Employee();
        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                temp = employee;
            }
        }
        return temp;
    }

    public Employee[] sortByName(Employee[] employees){
        boolean sorted = false;
        Employee temp;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < employees.length - 1; i++) {
                String firstEmployeeName = employees[i].name;
                String secondEmployeeName = employees[i+1].name;

                if (firstEmployeeName.compareTo(secondEmployeeName)>0) {
                    temp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return employees;
    }

    public Employee[] sortByNameAndSalary(Employee[] employees){
        boolean sorted = false;
        Employee temp;

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < employees.length - 1; i++) {
                String firstEmployeeName = employees[i].name;
                String secondEmployeeName = employees[i+1].name;

                if (firstEmployeeName.compareTo(secondEmployeeName)>0) {
                    temp = employees[i];
                    employees[i] = employees[i + 1];
                    employees[i + 1] = temp;
                    sorted = false;
                }
                if (firstEmployeeName.equals(secondEmployeeName)){
                    double firstEmployeeSalary = employees[i].salary;
                    double secondEmployeeSalary = employees[i+1].salary;
                    if (firstEmployeeSalary > secondEmployeeSalary){
                        temp = employees[i];
                        employees[i] = employees[i + 1];
                        employees[i + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }
        return employees;
    }

    public Employee edit(Employee employee){

        Employee oldEmployee = getById(employee.id);
        Employee newEmployee = new Employee();

        newEmployee.id = employee.id;
        newEmployee.name = employee.name;
        newEmployee.age = employee.age;
        newEmployee.salary = employee.salary;
        newEmployee.gender = employee.gender;
        newEmployee.fixedBugs = employee.fixedBugs;
        newEmployee.defaultBugRate = employee.defaultBugRate;

        getById(newEmployee.id);
        print(newEmployee);

        return oldEmployee;
    }

    public Employee remove(long id){
        getById(id);
        long removedId = id;
        Employee employee = getById(id);
        int removedIndex = 0;

        for (int i = 0; i < employees.length; i++) {
            long j = employees[i].id;
            if (j == removedId){
                removedIndex = i;
            }
        }

        //Employee[] employees = new Employee[];

        for (int i = removedIndex; i < employees.length - 1; i++) {
            employees[i] = employees[i + 1];
        }
        Employee[] newEmployees = new Employee[employees.length - 1];

        for (int i = 0; i < newEmployees.length; i++) {
            newEmployees[i] = employees[i];
        }

//        for (Employee newEmployee : newEmployees) {
//            System.out.println("id " + newEmployee.id + ", name " + newEmployee.name +", age" + newEmployee.age +
//                    ", salary " + newEmployee.salary + ", gender " + newEmployee.gender +
//                    ", fixedBugs " + newEmployee.fixedBugs + ", defaultBugRate " + newEmployee.defaultBugRate);
//        }

        return employee;
    }
}