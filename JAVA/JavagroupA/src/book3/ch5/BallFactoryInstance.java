package book3.ch5;

public class BallFactoryInstance {

    public static Ball getBall(String b){
        if (b.equalsIgnoreCase("BaseBall")){
                   return  new Baseball();
        }else if (b.equalsIgnoreCase("SoftBall")){

        }
    }
}
