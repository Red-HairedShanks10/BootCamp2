package book4.ch5;


class Employee {

    String lastName, firstName;
    public Employee(String lastName, String firstName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return this.lastName + " " + firstName;
    }

}