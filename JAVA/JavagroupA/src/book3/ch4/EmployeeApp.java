package book3.ch4;

import java.text.NumberFormat;

public class EmployeeApp {
    public EmployeeApp getEmployee() {
        return this;
    }
      static String msg;
    public static void main(String[] args) {

        NumberFormat hf = NumberFormat.getPercentInstance();
      EmployeeApp emp = new SalariedEmployee(2000);

      if (emp instanceof SalariedEmployee){

      }else if(emp instanceof HourlyEmployee) {

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
}

}

class HourlyEmployee {
double rate;

public HourlyEmployee(double rate){
this.rate = rate;
}

}
