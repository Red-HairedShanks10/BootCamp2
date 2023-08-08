package book3.ch5;
import java.awt.event.*;
import javax.swing.*;
public class TickTock {
    public static void main(String[] args) {

    }
}

class Ticker implements ActionListener{
    private boolean tick = true;
    public void actionPerformed(ActionEvent event){
        if (tick){
          System.out.println("Tick........");
        }else{
            System.out.println("Tock........");
        }
        tick = !tick;
    }
}