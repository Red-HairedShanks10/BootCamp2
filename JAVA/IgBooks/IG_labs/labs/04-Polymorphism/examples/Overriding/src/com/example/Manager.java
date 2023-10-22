package com.example;

//ch4
/*
*Overriding methods
*/

public class Manager extends Employee {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Manager(int empId, String name, String ssn, double salary, String dept) {
      super(empId, name, ssn, salary);//refers to an instance of the base class
      deptName = dept;
    }

    @Override
    public String getDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }

    @Override
    public String getAllDetails() {
      return super.getDetails () + 
        " Dept: " + deptName;
    }
}
