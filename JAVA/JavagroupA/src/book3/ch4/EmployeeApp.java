package book3.ch4;

import java.text.NumberFormat;

public class EmployeeApp {
    public EmployeeApp getEmployee() {
        return this;
    }

    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getNumberInstance();
      EmployeeApp emp = new SalariedEmployee();
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
