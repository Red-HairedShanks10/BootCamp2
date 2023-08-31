package book3.ch7;

public class AnonClass {
    public static void main(String[] args){
        //lambda expression//can have more than one statement in it
        Ball b1 = () ->  {
                        //statement one...
                        System.out.println("you hit a lambda ball");
                        //statement two...
                         System.out.println("congrats..."); };
        Ball b2 = new Ball(){
            @Override
            public void hit(){
                System.out.println("you hit an anonymous ball");
            }
        };
        b1.hit();
        b2.hit();
    }

}


interface Ball{
    void hit();
}

class Baseball implements Ball{

    @Override
    public void hit() {
        System.out.println("you hit a Baseball");
    }
}