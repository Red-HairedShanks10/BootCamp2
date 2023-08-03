package book2.ch7;

public class RandomNumApp {

    public static void main(String[] args) {

        int number = getRandomNumber();
        System.out.println(number);

    }


    public static int getRandomNumber(){
        int randomNumber = (int) Math.floor(Math.random() * 10 + 1 );
        return randomNumber;
    }


}
