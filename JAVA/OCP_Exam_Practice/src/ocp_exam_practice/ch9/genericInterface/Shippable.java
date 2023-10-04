package ocp_exam_practice.ch9.genericInterface;

import ocp_exam_practice.ch1.Animal;

import java.awt.*;

public interface Shippable<T>{
    void ship(T t);
}

class ShippableRobotCrate implements Shippable<Robot>{
    public void ship(Robot robot){

    }
}

class ShippableAbstractCrate<U> implements Shippable<U> {
    public void ship(U t) { }
}


class GenericInterfaceTest{
    public static void main(String[] args) {
            Shippable shippableCrate = new ShippableAbstractCrate<Animal>();
            Shippable shippableRobot = new ShippableRobotCrate();

    }
}