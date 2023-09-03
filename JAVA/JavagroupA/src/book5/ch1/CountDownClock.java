package book5.ch1;

public class CountDownClock extends Thread{//inherits from Threads Class

    public void run(){//will be called when clock thread is active
        //for loop counts down from 20 to 0
        for (int t = 20; t > 0; t--){
            System.out.println("T minus " + t);
            if (t == 1){
                System.out.println("Mars invasion,under way");
            }
            try
            {// try/catch will handle the Interrupted Exception thrown by sleep()
                Thread.sleep(1000);//sleep method will pause for 1sec
            }
            catch (InterruptedException e)
            {}


        }
    }
}
