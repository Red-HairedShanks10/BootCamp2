package book2.ch1;
import javax.swing.JOptionPane;

public class Greeter {
    public void sayHello(){
        //System.out.println("Hello I am the Greeter");

        JOptionPane.showMessageDialog(null,
                "Hello, World!", "Greeter",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
