package ocp_exam_practice.ch9;

import java.util.*;

public interface Flyer { void fly(); }
class HangGlider implements Flyer {
    public void fly() {}
}
class Goose implements Flyer {
    public void fly() {}
}


class GenericInterfaceTest {
    private void anyFlyer (List < Flyer > flyer) {}
    private void groupOfFlyers (List < ? extends Flyer > flyer){}

    public static void main(String[] args) {
        List<Flyer> flyers = new ArrayList<>();
        List<HangGlider> hangGliders = new ArrayList<>();
        List<Goose> geese = new ArrayList<>();

        GenericInterfaceTest git = new GenericInterfaceTest();
        git.anyFlyer(flyers);
//        git.anyFlyer(hangGliders);
//        git.anyFlyer(geese);

        git.groupOfFlyers(flyers);
        git.groupOfFlyers(hangGliders);
        git.groupOfFlyers(geese);

    }
}