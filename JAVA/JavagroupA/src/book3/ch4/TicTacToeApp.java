package book3.ch4;

public class TicTacToeApp {

    public static void main(String[] args){
        Player p1 = new Player();
        Player p2 = new BetterPlayer();
        playTheGame(p1, p2);
    }

    public static void playTheGame(Player p1, Player p2){
        p1.move();
        p2.move();
    }
}
