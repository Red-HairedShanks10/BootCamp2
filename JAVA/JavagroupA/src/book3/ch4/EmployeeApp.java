package book3.ch4;

import java.text.NumberFormat;

public class EmployeeApp {
    public EmployeeApp getEmployee() {
        return this;
    }
      static String msg;
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getNumberInstance();
        NumberFormat hf = NumberFormat.getPercentInstance();
      EmployeeApp emp = new SalariedEmployee(2000);

      if (emp instanceof SalariedEmployee){
          msg = "the employee's salary is " + cf.format (((SalariedEmployee) emp).salary);
      }else if(emp instanceof HourlyEmployee) {

      }
    }
}

class SalariedEmployee extends EmployeeApp{
double salary;
public SalariedEmployee(double salary){
this.salary = salary;
}

}

class HourlyEmployee {
double rate;

public HourlyEmployee(double rate){
this.rate = rate;
}

}
