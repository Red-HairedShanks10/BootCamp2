package book3.ch5;

public class TestLambdaCollection {
    public static void main(String[] args)
    {
        Game g = new Game() {
            @Override
            public void play() {

            }

            @Override
            public void quit() {
                System.out.println();
            }
        };
        g.play();
        g.quit();
    }
}
