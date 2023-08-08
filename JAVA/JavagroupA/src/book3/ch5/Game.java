package book3.ch5;

public class Game implements Playable {

    @Override
    public void play(){
        System.out.println("Playing....");
    };

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
        game.quit();
    }


}



