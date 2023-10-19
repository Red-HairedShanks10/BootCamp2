/*ch3
 * Testing subclassing  
 */

package com.example;


public class ManagerTest {
    
    public static void main(String args[])
    {
    Manager mgr=new Manager("admin",135, "Vi", "ds123", 9500);
    
    
        String name = mgr.getName();
        String ssn = mgr.getSsn();
        double salary = mgr.getSalary();
        int id = mgr.getEmpId();
        String dept=mgr.getDeptName();
        System.out.println("Details of Manager: ");
        System.out.println("Name= " + name +" "+ "ssn= " + ssn +" "+ "salary= " + salary+" "+ "id " + id+"Dept "+" " +dept);
        
    }
}
