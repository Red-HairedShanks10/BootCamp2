package book2.ch3;

/*Testing Math.random() by making a Dice roll */
public class DiceApp {

    public static void main(String[] args) {
        int roll;//
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg);
        for (int i = 0; i < 100; i++) {// executes the code a 100 times
            roll = randomInt(1, 6);//calls randomInt() created in line 17...
            System.out.print(roll + " ");
        }
        System.out.println();
    }

    public static int randomInt(int low, int high) {//this function returns an int type, and takes on int types
        int result = (int) (Math.random() * (high - low + 1)) + low;
        return result;
    }

}
