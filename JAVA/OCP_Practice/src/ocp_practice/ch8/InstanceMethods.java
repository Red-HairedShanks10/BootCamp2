package ocp_practice.ch8;

public class InstanceMethods {
    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith;
    }
}



interface StringStart{
    boolean beginningCheck(String prefix);
}
