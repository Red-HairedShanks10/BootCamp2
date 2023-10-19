
/*Ch3 
 *Focusing on inheritance 
 *Using super to call the parent class constructor
 */
package com.example;

public class Manager extends Employee3 {

    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }



    public Manager(String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);//explicit call of parent class constructor
        this.deptName = deptName;
    }


}
