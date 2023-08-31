package book3.ch7;
import java.awt.event.*;
import javax.swing.*;
public class TickTockInner {
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args)
    {
        TickTockInner t = new TickTockInner();
        t.go();
    }
}
