package book4.ch5;

import book3.ch4.EmployeeApp;

import java.text.NumberFormat;

public class HourlyEmployee extends EmployeeApp {
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
