package book3.ch6;

public class TestEquality {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Marco", "Red");
        Employee emp2 = new Employee("Leo", "Goat");
        if(emp1.equals(emp2)){
            System.out.println("Employees are the same");
        }else {
            System.out.println("Emplooyes are not the same");
        }
    }
}
