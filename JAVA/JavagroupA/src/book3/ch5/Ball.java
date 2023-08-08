package book3.ch5;

public abstract class Ball {
    public abstract int hit(int batSpeed);

    public static void main(String[] args) {
        Baseball baseball = new Baseball();

    }
}

abstract class Baseball extends Ball {

    public int hit(int batSpeed) {
        int x = 100;
    return batSpeed * x;

    }
}

