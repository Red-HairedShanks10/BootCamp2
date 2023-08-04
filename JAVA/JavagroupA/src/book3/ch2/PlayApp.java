package book3.ch2;

public class PlayApp {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        player1.setHealth(4);
        player2.setHealth(20);
        System.out.println("Player 1 has health at: " + player1.getHealth() );
        System.out.println("Player 2 has health at: " + player2.getHealth() );

    }


}
