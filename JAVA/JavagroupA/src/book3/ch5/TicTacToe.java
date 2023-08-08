package book3.ch5;

public class TicTacToe extends Game implements Playable, ICardGame {
    @Override
    public void play() {
        System.out.println("playing a Tic-Tac-Toe game");
    }

    @Override
    public void shuffleCards() {
        System.out.println("Shuffling cards");
    }

    public static void main(String[] args) {
       TicTacToe tg = new TicTacToe();
       tg.play();
       tg.shuffleCards();
       Playable tg2 = new TicTacToe();
       tg2.play();
    }
}

