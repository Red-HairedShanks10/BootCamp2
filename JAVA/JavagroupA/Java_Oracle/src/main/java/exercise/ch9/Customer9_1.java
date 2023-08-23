
package exercise.ch9;


public class Customer9_1 {
    private String name;
    private String ssn;//social securtiy number
   
    //Add a custom constructor
    public Customer9_1(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
}
