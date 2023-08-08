package book3.ch5;

public abstract class Ball {
    public abstract int hit(int batSpeed);
}

abstract class Baseball extends Ball {

    public int hit(int batSpeed) {
        int x = 100;
        batSpeed = batSpeed * x;
        return batSpeed;
    }
}

