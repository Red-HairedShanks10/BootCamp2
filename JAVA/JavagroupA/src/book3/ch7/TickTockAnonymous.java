package book3.ch7;


import java.awt.event.*;
import javax.swing.*;
public class TickTockAnonymous {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args)
    {
       TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }

    private void go()
    {
        // create a timer that calls the Ticker class
        Timer t = new Timer(1000, new ActionListener()
        {
            private boolean tick = true;
            public void actionPerformed(ActionEvent event)
            {
                if (tick)
                {
                    System.out.println(tickMessage);
                }
                else
                {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        } );


}
}



