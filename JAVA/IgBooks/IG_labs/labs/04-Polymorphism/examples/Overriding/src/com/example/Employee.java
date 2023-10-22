package com.example;
//chapter 4
/*
*Overriding methods
*/
public class Employee {//will be extended by the Managar Class
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
      this.empId = empId;
      this.name = name;
      this.ssn = ssn;
      this.salary = salary;
    }

    public String getDetails() {
      return "ID: " + empId + " Name: " + name;
    }

    public String getAllDetails() {
        return "ID: " + empId + " Name: " + name 
          + " SSN: " + ssn + " Salary: " + salary;
    }
    
    public double getSalary(){
      return this.salary;
    }
}