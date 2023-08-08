package book3.ch6;

public class TestToString {
    public static void main(String[] args) {
        Employee emp = new Employee("Marco", "Red");
    }
}


class Employee{
private String firstName, lastName;

public Employee(String firtsName, String lastName){
    this.firstName = firtsName;
    this.lastName = lastName;

}
@Override
String toString(){
  return firstName + " " + lastName;
}

}
