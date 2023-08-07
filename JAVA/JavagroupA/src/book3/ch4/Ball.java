package book3.ch4;

/*
public class Ball {


    public static void main(String[] args) {

        BaseBall baseBall1 = new BaseBall();
        baseBall1.hit();
    }

    private double weight;

    protected double getWeight() {
        return this.weight;
    }

    protected void setWeight(double pWeight) {
        this.weight = pWeight;
    }

    public void hit() {
        System.out.println("you hit the ball!!");
    }


}


class BaseBall extends Ball {
    public BaseBall() {
        setWeight(60);
    }

    public void hit() {
        System.out.println("You hit it far up");
        super.hit();
    }

}
*/

public class Ball {

    private double weight;
 /*   public Ball(double pWeight){
        System.out.println("Hello from the Ball constructor");
        this.weight = pWeight;
    }*/


    public static void main(String[] args) {

        BaseBall baseBall2 = new BaseBall();
        SoftBall softBall1 = new SoftBall();



    }





}


class BaseBall extends Ball{
 /*   public BaseBall(double baseBallW) {
        super(baseBallW);//this calls the base class's constructor//whether implicit ot explicit
        System.out.println("BaseBall constructor weight: " + baseBallW);
    }*/

    public static void hit(BaseBall b){
        System.out.println("hitting this ball: " );
    }


}

class SoftBall extends Ball{
   /* public SoftBall(double softBallW){
        super(softBallW);//this calls the base class's constructor//whether implicit ot explicit
        System.out.println("Softball constructor weight: " + softBallW);
    }*/
}