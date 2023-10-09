package ocp_exam_practice.ch11;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        new Frog().hop(null, 3);

    }
}


class Frog{
    public  void hop(String name, Integer jump){
            System.out.println(name.toLowerCase() + " " + jump.intValue());
    }
}