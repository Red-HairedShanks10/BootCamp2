package ocp_practice.ch8;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
    }
}
