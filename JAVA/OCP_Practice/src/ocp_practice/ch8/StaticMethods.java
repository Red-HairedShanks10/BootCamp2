package ocp_practice.ch8;

interface Converter {
    long round(double num);
}


public class StaticMethods {
    public static void main(String[] args) {
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);

        System.out.println(methodRef.round(100.1));
    }
}

