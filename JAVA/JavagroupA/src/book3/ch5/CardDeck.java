package book3.ch5;

public class CardDeck implements IDealable {

    @Override
    public void deal(int cards) {
        System.out.println("dealing out " + cards + " cards");
    }












    private static void startGame(IDealable deck, String game)
    {
        if (game.equals("Poker"))
            deck.deal(5);
        else if (game.equals("Hearts"))
            deck.deal(13);
        else if (game.equals("Gin"))
            deck.deal(10);
    }


    public static void main(String[] args) {

        IDealable d = new CardDeck();
        startGame(d, "Hearts");
        startGame(d, "Poker");
    }
}
