package book3.ch4;

public class Ball {


    public static void main(String[] args) {

    }
    private double weight;
    protected double getWeight(){
        return this.weight;
    }

    protected void setWeight(double pWeight){
        this.weight = pWeight;
    }


}


class BaseBall extends Ball{
    public BaseBall(){
        setWeight(60);
    }
}