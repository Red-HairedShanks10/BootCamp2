package book5.ch1;

public class CountDownApp {
    public static void main(String[] args)
    {
        Thread clock = new CountDownClock();//instance of CountDownClock

        //created three LaunchEvent obj
        Runnable flood, ignition, liftoff;
        flood = new LaunchEvent(16, "Flood the pad!");//to flood the pad
        ignition = new LaunchEvent(6, "Start engines!");//to start the engine
        liftoff = new LaunchEvent(0, "Liftoff!");//to liftoff

        clock.start();//clock thread is started, countdown begins

        //starts the LaunchEvent objects by passing them as parameters to the Thread constructor
        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}
