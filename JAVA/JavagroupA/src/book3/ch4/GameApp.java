package book3.ch4;

public class GameApp {
    public static void main(String[] args) {

        Chess chess = new Chess();
        //calling the overridden method of the Game class from child class-->Chess
        chess.play();//will call chess.play() if it exist//otherwise it will grab from super class
    }
}
