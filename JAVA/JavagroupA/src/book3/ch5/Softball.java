package book3.ch5;

public class Softball extends Ball {

    public void hit(int batSpeed) {
        batSpeed = batSpeed * 100;
        System.out.println("Softball was hit at batspeed: " + batSpeed);

    }
}