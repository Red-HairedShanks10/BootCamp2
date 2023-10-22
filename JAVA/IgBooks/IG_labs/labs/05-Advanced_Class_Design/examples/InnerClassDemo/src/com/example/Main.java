package com.example;


public class Main {

    public static void main(String[] args) {
        
             
        BankEMICalculator acct1=new   BankEMICalculator("jane", "aa1234", 1000);
        double EMIamt=acct1.getMonthlypayment();//access EMI class method
        System.out.println("EMI Amount: " + EMIamt);
    }
    
}
