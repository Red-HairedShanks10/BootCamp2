package book5.ch1;

public class CountDownApp {
    public static void main(String[] args)
    {
        Thread clock = new CountDownClock();
        Runnable flood, ignition, liftoff;
        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        clock.start();
    }
}
