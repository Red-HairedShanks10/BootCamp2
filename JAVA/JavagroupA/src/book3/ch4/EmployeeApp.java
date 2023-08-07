package book3.ch4;

import java.text.NumberFormat;
import java.util.Scanner;

public class EmployeeApp {
    public EmployeeApp getEmployee() {
        return this;
    }
      static String msg;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter salaried or hourly");
        String wageType = sc.nextLine();
        System.out.println("please enter rate or salary");
        double wage = sc.nextDouble();
        if (wageType.equals("salary")){
            EmployeeApp emp = new SalariedEmployee(wage);
            ((SalariedEmployee) emp).getFormattedSalary();
        } else if (wageType.equals("hourly")) {
            EmployeeApp emp = new HourlyEmployee(wage);
            ((HourlyEmployee) emp).getFormattedRate();
        }

        EmployeeApp emp = new SalariedEmployee(2000);
      if (emp instanceof SalariedEmployee){


      } else if (emp instanceof  HourlyEmployee) {
          ((HourlyEmployee) emp).getFormattedRate();

      }


    }
}

class SalariedEmployee extends EmployeeApp{
double salary;
public SalariedEmployee(double salary){
this.salary = salary;
}
public void getFormattedSalary(){
    NumberFormat cf = NumberFormat.getCurrencyInstance();
    msg = cf.format(this.salary);
    System.out.println("employee salary is: " + msg);

}

}

class HourlyEmployee  extends EmployeeApp {
double rate;

public HourlyEmployee(double rate){
this.rate = rate;
}

    public void getFormattedRate(){
        NumberFormat hf = NumberFormat.getPercentInstance();
        msg = hf.format(this.rate);
        System.out.println("the rate is: " + msg);
}

}
