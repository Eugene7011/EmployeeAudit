package com.company;

public class Employee {

    long id;
    String name;
    int age;
    double salary;
    String gender;
    int fixedBugs;
    double defaultBugRate;

    public Employee (){

    }

    public Employee(long id, String name, int age, double salary, String gender, int fixedBugs, double defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    // void printEmployee(){
//
  //      System.out.println("id " + id + ", name" + name +", salary" + salary + ", gender" + gender +
  //              ", fixedBugs" + fixedBugs + ", defaultBugRate" + defaultBugRate);
//
   // }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", fixedBugs=" + fixedBugs +
                ", defaultBugRate=" + defaultBugRate +
                '}';
    }
}
