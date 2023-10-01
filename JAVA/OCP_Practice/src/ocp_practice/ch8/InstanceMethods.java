package ocp_practice.ch8;

public class InstanceMethods {
    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("A")); // false

        //implementing StringChecker
        var str2 = "";
        StringChecker methodRef2 = str::isEmpty;
        StringChecker lambda2 = () -> str.isEmpty();
    }
}



interface StringStart{
    boolean beginningCheck(String prefix);
}

interface StringChecker {
    boolean check();
}
