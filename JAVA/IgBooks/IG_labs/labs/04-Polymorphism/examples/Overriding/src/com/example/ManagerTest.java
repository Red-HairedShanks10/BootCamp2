package com.example;
//Ch4 
/*
*testing Overridden methods
*/
public class ManagerTest {

    public static void main(String args[]) {
        Manager mgr = new Manager(151, "Tom", "444-44-4444", 8000, "admin");

        System.out.println("Manager: " + mgr.getDetails());//calling Manager class version of getDetails()
    }
}
