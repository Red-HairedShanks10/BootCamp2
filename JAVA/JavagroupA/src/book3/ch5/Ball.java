package book3.ch5;

public abstract class Ball {
    public abstract int hit(int batSpeed);

    public static void main(String[] args) {
        Baseball baseball = new Baseball();
        System.out.println("baseball speed is: " + baseball.hit(3));

    }
}

class Baseball extends Ball {

    public int hit(int batSpeed) {
        int x = 100;
    return batSpeed * x;

    }
}

