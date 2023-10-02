package ocp_practice.ch8;

public class BooleanSupplierTest {
    public static void main(String[] args) {
        BooleanSupplier b1 = () ->
                true;
    }
}

interface BooleanSupplier{
    boolean getAsBoolean();
}