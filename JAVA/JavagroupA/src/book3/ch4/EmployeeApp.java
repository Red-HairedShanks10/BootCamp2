package book3.ch4;

public class EmployeeApp {
    public EmployeeApp getEmployee() {
        return this;
    }

    public static void main(String[] args) {
      EmployeeApp emp = new SalariedEmployee();
    }
}

class SalariedEmployee extends EmployeeApp{
double salary;
public SalariedEmployee(double salary){

}

}

class HourlyEmployee {
double rate;
}
