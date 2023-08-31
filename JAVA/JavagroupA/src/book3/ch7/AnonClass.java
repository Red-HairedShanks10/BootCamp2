package book3.ch7;

public class AnonClass {
    public static void main(String[] args){

        Ball b = () ->  {System.out.println("you hit it"); System.out.println("congrats..."); };//lambda expression
/*        Ball b = new Ball(){
            public void hit(){
                System.out.println("you hit it");
            }
        };*/
        b.hit();
    }

}


interface Ball{
    void hit();
}