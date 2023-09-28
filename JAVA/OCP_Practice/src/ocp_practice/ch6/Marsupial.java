package ocp_practice.ch6;

public class Marsupial {
    public double getAverageWeight() {
        return 50;
    }
}

class Kangaroo extends Marsupial{

    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }
}