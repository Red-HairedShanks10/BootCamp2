package book2.ch5;

/*Using this file to try out multiple expressions within the for loop setup*/
/*public class CountBothWays {
    public static void main(String[] args) {
        int a, b;
        // we can have multple count expressions and initialisations
        for (a = 1, b = 10; a <= 10; a++, b--) {//what about setting up conditions when having multiple counter?
            System.out.println(a + " " + b);
        }

        ExpressionGanging expGang = new ExpressionGanging();

        ExpressionGanging.main();
    }
}*/


 class ExpressionGanging {
    public static void main(String[] args) {
        System.out.print("We are go for launch in T minus ");
        for (int count = 10; count >= 0; System.out.println((count == 8) ? "Ignition sequence start!" : count + "..."), count--)
            ;
        System.out.println("All engines running!");
        System.out.println("Liftoff! We have a liftoff!");
    }
}
