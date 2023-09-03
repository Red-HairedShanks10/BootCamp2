package book5.ch1;

public class LaunchEvent implements Runnable {
    private int start;
    private String message;

    public LaunchEvent(int start, String message){
        this.start = start;//countdown time(seconds)
        this.message = message;//message displayed when time arrives
    }
    public void run(){//uses Thread.sleep()

        try{
            //this method keeps the thread inactive//until countdown time arrives
            Thread.sleep(20000 - (start * 1000));
        }
        catch (InterruptedException e){}//this only catches the exeception
        System.out.println(message);//once the thread is activated the message will be displayed

    }
}
