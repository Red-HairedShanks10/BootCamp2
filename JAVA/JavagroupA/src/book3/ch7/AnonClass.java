package book3.ch7;

public class AnonClass {
    public static void main(String[] args){
        //lambda expression//can have more than one statement in it
        Ball b = () ->  {
                        //statement one...
                        System.out.println("you hit it");
                        //statement two...
                         System.out.println("congrats..."); };
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