package book3.ch2;

public class Actor {
String firstName, lastName;
boolean good, great;

public Actor(String cfirstName, String clastName){

    this.firstName = cfirstName;
    this.lastName = clastName;
}

public Actor(String cfirstName, String clastName, boolean cGood){
    this.firstName = cfirstName;
    this.lastName = clastName;
    this.good = cGood;
}

public void printObject(){
    System.out.println(this);
}

/*@Override
 *//*   public String toString(){
      return this.firstName + " " + this.lastName;
}
*/

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", good=" + good +
                ", great=" + great +
                '}';
    }
}
