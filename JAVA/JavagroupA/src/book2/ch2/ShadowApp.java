package book2.ch2;

public class ShadowApp {
    public static void main(String[] args) {
        {
            x = 5;
            System.out.println("x = " + x);
            int x;
            x = 10;
            System.out.println("x = " + x);
            System.out.println("ShadowApp.x = " +  ShadowApp.x);
        }
    }
}
