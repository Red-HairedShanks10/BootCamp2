package book3.ch5;

public class BallFactoryInstance {

    public  Ball getBall(String b){
        if (b.equalsIgnoreCase("BaseBall")){
                   return  new Baseball();
        }else if (b.equalsIgnoreCase("SoftBall")){
            return new Softball();
        }return null;
    }
}
