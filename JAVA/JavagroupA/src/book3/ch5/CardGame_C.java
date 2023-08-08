package book3.ch5;

public class CardGame_C implements Dealable {

    @Override
    public void deal(int cards) {
        System.out.println("dealing out " + deals + cards);
    }
}
