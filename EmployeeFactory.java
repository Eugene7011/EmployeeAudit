package com.company;
import java.util.*;

public class EmployeeFactory {


    public Employee[] generateEmployees(int size) {
        Employee[] generatedEmployees = new Employee[size];
        for (int i = 0; i < size; i++) {
            generatedEmployees[i] = getEmployee();
        }

        return generatedEmployees;
    }

    private Employee getEmployee() {
        Employee generatedEmployee = new Employee();
        Random random = new Random();
        generatedEmployee.id = 1 + random.nextInt(1000);
        generatedEmployee.name = "Test";
        generatedEmployee.fixedBugs = 1 + random.nextInt(500);
        generatedEmployee.age = 18 + random.nextInt(51);
        generatedEmployee.salary = 1000 + random.nextInt(9001);
        if (Math.random() < 0.5) {
            generatedEmployee.gender = "Male";
        } else {
            generatedEmployee.gender = "Female";
        }
        generatedEmployee.fixedBugs = 1 + random.nextInt(500);
        generatedEmployee.fixedBugs = 1 + random.nextInt(200);

        String[] namesMen = {"Edward", "Tony", "James", "Anton", "Tolik",
                "Oleg", "Denis", "Stas", "Max", "Dima"};
        String[] namesWomen = {"Marina", "Natasha", "Gulya", "Sara", "Klava",
                "Anna", "Paraska", "Ira", "Valya", "Dusya"};

        if (generatedEmployee.gender.equals("Male")){
            generatedEmployee.name = namesMen[random.nextInt(namesMen.length)];
        }
        else{
            generatedEmployee.name = namesWomen[random.nextInt(namesMen.length)];
        }

        return generatedEmployee;
    }

}
