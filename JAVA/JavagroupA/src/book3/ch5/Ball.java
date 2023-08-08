package book3.ch5;

public abstract class Ball {
    public abstract int hit(int batSpeed);

    public static void main(String[] args) {
      /*  Baseball baseball = new Baseball();
        System.out.println("baseball speed is: " + baseball.hit(3));
        Softball softball = new Softball();
        System.out.println("baseball speed is: " + softball.hit(3));*/
        BallFactoryInstance bf = new BallFactoryInstance();
        Ball ball1 = bf.getBall("baseball");
        ball1.hit(3);

    }
}

class Baseball extends Ball {

    public void hit(int batSpeed) {
        int x = 100;
   System.out.println("baseball was hit with a batspeed of : " + batSpeed);
    }
}




