package book2.ch2;

public class ShadowApp {
    public static void main(String[] args) {
        {
            x = 5; →8
            System.out.println("x = " + x); →9
            int x; →10
            x = 10; →11
            System.out.println("x = " + x); →12
            System.out.println("ShadowApp.x = " +
                    ShadowApp.x); →14
        }
    }
}
