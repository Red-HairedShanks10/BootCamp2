package book3.ch4;

import java.text.NumberFormat;

public class EmployeeApp {
    public EmployeeApp getEmployee() {
        return this;
    }
      static String msg;
    public static void main(String[] args) {


      EmployeeApp emp = new SalariedEmployee(2000);
      if (emp instanceof SalariedEmployee){
          msg = "employee's salary is ";
          msg += (((SalariedEmployee) emp).getFormattedSalary());
      } else if (emp instanceof  HourlyEmployee) {
          msg = "rate is ";

      }


    }
}

class SalariedEmployee extends EmployeeApp{
double salary;
public SalariedEmployee(double salary){
this.salary = salary;
}
public void getFormattedSalary(){
    NumberFormat cf = NumberFormat.getNumberInstance();
    msg = cf.format(this.salary);
    System.out.println("employee salary is: ");

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
