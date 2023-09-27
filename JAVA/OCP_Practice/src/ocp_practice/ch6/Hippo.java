package ocp_practice.ch6;

class Animal2{
    static {System.out.println("A");}
}


public class Hippo {
    public static void main(String[] args) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();

    }
}
