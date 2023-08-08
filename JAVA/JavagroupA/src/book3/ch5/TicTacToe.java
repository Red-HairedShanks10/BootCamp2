package book3.ch5;

public class TicTacToe extends Game implements Playable, CardGame {
    @Override
    public void play() {
        System.out.println("playing a Tic-Tac-Toe game");
    }

    @Override
    public void shuffleCards() {
        System.out.println("Shuffling cards");
    }

    public static void main(String[] args) {
        Game g = new TicTacToe()
    }
}

