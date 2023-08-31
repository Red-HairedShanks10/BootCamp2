package book3.ch7;

public class AnonClass {
    public static void main(String[] args){

        //Concrete
        Ball b1 = new Baseball();
        b1.hit();


        //lambda expression//can have more than one statement in it
        Ball b2 = () ->  {
                        //statement one...
                        System.out.println("you hit a lambda ball");
                        //statement two...
                         System.out.println("congrats..."); };

        //anon
        Ball b3 = new Ball(){
            @Override
            public void hit(){
                System.out.println("you hit an anonymous ball");
            }
        };



        b2.hit();
        b3.hit();
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