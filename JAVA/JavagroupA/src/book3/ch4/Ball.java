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
    public Ball(){
        System.out.println(
                "Hello from the Ball constructor");
    }
}