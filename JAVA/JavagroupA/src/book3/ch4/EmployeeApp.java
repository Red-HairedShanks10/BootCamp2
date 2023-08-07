package book3.ch4;

public class EmployeeApp {
    public EmployeeApp getEmployee() {
        return this;
    }

    public static void main(String[] args) {

    }
}

class SalariedEmployee extends EmployeeApp{
double salary;
}

class HourlyEmployee {
double rate;
}
