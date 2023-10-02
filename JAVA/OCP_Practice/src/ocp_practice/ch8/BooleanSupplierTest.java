package ocp_practice.ch8;

public class BooleanSupplierTest {
    public static void main(String[] args) {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random()> .5;

        System.out.println(b1.getAsBoolean()); // true
        System.out.println(b2.getAsBoolean());
    }
}

interface BooleanSupplier{
    boolean getAsBoolean();
}