package book3.ch7;


import java.awt.event.*;
import javax.swing.*;
public class TickTockAnonymous {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args)
    {
        TickTockInner t = new TickTockInner();
        t.go();
    }

    private void go()
    {
        // create a timer that calls the Ticker class
        Timer t = new Timer(1000,
        new ActionListener()
        {
            private boolean tick = true;

        // display a message box to prevent the
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }

    class Ticker implements ActionListener{//this is a class in another class
        private boolean tick = true;

        public void actionPerformed(ActionEvent event){
            if (tick)
            {
                System.out.println(tickMessage);
            }

            else
            {
                System.out.println(tockMessage);
            }tick = !tick;


        }
    }

}



