package book2.ch2;

public class PrimitiveTest {

    public static void main(String[] args) {

        byte byteNum = 2;
        short shNum = 3;
        int intNum = 4;

        long lNum = 50000L + ( 10 * (byteNum + shNum + intNum));

        System.out.println(lNum);

        double numPounds = 4.5;
        double resultInKilos = numPounds * 0.45359237;

        System.out.println(resultInKilos);

    }
}
