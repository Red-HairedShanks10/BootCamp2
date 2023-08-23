
package exercise.ch9;//9-1


public class Customer {
    private String name;
    private String ssn;
   
    // Encapsulate the class.
    
    public String getName(){

        return name;

    }
    public void setName(String n){

        name = n;

    }
    
    public String getSSN(){
        // Make ssn read only.
        return ssn;

    }
}
