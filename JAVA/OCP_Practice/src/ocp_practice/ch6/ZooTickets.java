package ocp_practice.ch6;

public class ZooTickets {
    private String name = "BestZoo";
    { System.out.print(name + "-");}

    private static int COUNT = 0;
    static { System.out.print(COUNT + "-");}
    static { COUNT += 10; System.out.print(COUNT + "-");}
}
