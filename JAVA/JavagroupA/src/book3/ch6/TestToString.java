package book3.ch6;

public class TestToString {
    public static void main(String[] args) {
        Employee emp = new Employee("Marco", "Red");
        System.out.println(emp);
    }
}


class Employee{
private String firstName, lastName;
    private Double salary;

public Employee(String firtsName, String lastName){
    this.firstName = firtsName;
    this.lastName = lastName;
}

    public String getLastName()
    {
        return this.lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public Double getSalary()
    {
        return this.salary;
    }
    public void setSalary(Double salary)
    {
        this.salary = salary;
    }
    public Object clone(){
        Employee emp;
        emp = new Employee(this.lastName, this.firstName);
        emp.setSalary(this.salary);
        return emp;
    }

    /*@Override
    String toString() {
        return firstName + " " + lastName;
    }
*/
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }



}
