package book2.ch5;

/*Using this file to try out multiple expressions within the for loop setup*/
public class CountBothWays {
    public static void main(String[] args) {
        int a, b;
        for (a = 1, b = 10; a <= 10; a++, b--) {
            System.out.println(a + " " + b);
        }
    }
}
