package book3.ch5;

public interface Playable {
    void play();
    default void quit(){
        System.out.println("Sorry, quitting is not allowed.");
    };
}
