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
          
      }


    }
}

class SalariedEmployee extends EmployeeApp{
double salary;
public SalariedEmployee(double salary){
this.salary = salary;
}
public String getFormattedSalary(){
    NumberFormat cf = NumberFormat.getNumberInstance();
    msg = cf.format(this.salary);
    return msg;
}

}

class HourlyEmployee  extends EmployeeApp {
double rate;

public HourlyEmployee(double rate){
this.rate = rate;
}

    public String getFormattedRate(){
        NumberFormat hf = NumberFormat.getPercentInstance();
        msg = hf.format(this.rate);
        return msg;
    }

}
