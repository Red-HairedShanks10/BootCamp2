package book3.ch5;

public class TestBalls implements IPlayableBall {


    @Override
    public void throwBall() {
        System.out.println("Throwing ball");
    }

    @Override
    public void kickBall() {
        System.out.println("Kicking ball");
    }

    @Override
    public void catchBall() {
        System.out.println("Catching ball");
    }

    @Override
    public void dropBall() {
        System.out.println("Dropping ball");
    }


    public static void main(String[] args) {
        TestBalls t = new TestBalls();

        t.kickBall();//
        t.throwBall();
        t.catchBall();
        t.dropBall();
    }
}
