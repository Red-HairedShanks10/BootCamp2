/*
 *Ch3 testing method overloading
 */
package com.example;

public class Overloading {

    public void print(int i) {
        System.out.println(i);
    }

    public void  print(float f) {
        System.out.println(f);
    }

    public void print(String s) {
        System.out.println(s);

    }
    
    public static int addDoubleToInt(double dNum1, double dNum2){
        int intResult = (int) ((int)dNum1 + dNum2);
        return intResult;
    }
    
    public static int addDoubleToInt(double dNum1, double dNum2, int intBooster){
        int intResult = (int) ((int)dNum1 + dNum2);
        return intResult + intBooster;
    }
    
    public static void main(String args[])
    {
      Overloading ov=new Overloading();
        ov.print(6);
        ov.print("hello");
        ov.print(8.5f);
        
        System.out.println("double to int: " + addDoubleToInt(10.00,3.05));
        System.out.println("Double to int with booster: " + addDoubleToInt(10.00,3.05, 5));
    }
}
