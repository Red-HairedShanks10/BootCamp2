package book2.ch2;

public class C_ReferenceTypes {
    public static void main(String[] args){

        class Ball {
            int speed;

            void setSpeed(int speed) {
                this.speed = speed;
            }

        }
        Ball b1 = new Ball();
        Ball b2 = b1;
        b2.setSpeed(100);
        b1.setSpeed(50);
        System.out.println(b1.speed);


    }
}



