package book3.ch7;

public class AnonClass {
    public static void main(String[] args){

        Ball b = () ->  System.out.println("you hit it");
        Ball b = new Ball(){
            public void hit(){
                System.out.println("you hit it");
            }
        };
        b.hit();
    }

}


interface Ball{
    void hit();
}