package ocp_exam_practice.ch9.genericMethods;

import java.awt.*;

public class TrickyCrate<T> {
    public <T> T tricky(T t){
        return t;
    }


    public static  String crateName(){
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bot");
    }



    public static  int crateNum(){
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky(2);
    }

    public static void main(String[] args) {
        System.out.println(crateName());
        System.out.println(crateNum());
    }
}
