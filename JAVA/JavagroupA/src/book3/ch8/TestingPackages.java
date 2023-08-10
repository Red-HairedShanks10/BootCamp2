package book3.ch8;

import com.gmail.marco.util.Console;

public class TestingPackages {
    //ArrayList array1 = new ArrayList();//if we have imported the package we can do this.....


    public static void main(String[] args) {

        while (Console.askYorN("Keep going?"))
        {
            System.out.println("D'oh!");
        }
    }
}
