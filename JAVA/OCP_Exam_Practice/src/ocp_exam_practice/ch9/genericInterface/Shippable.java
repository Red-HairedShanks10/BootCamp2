package ocp_exam_practice.ch9.genericInterface;

import java.awt.*;

public interface Shippable<T>{
    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot>{
    public void ship(Robot robot){

    }
}
