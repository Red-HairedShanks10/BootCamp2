package book3.ch4;

public class Player {

    public int move(){
        for (int i = 0; i < 9; i++){
            System.out.println(
                    "\nThe basic player says:");
            System.out.println(
                    "I'll take the first open square!");
            return firstOpenSquare();
        }

    }
}
