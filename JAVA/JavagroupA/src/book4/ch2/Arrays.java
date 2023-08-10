package book4.ch2;

import java.util.Scanner;

public class Arrays {
 static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] firstArray = new String[5];///declaring and initialising array
        //adding values to an array....
//       firstArray[0] = "Black Mamba";
//       firstArray[1] = "King Cobra";
//        firstArray[2] = "Taipan";


       /* int[] numbers = new int[100];
        for (int i = 0; i < 100; i++){
            numbers[i] = (int)(Math.random() * 100) + 1;
            System.out.println(numbers[i]);
        }
*/

      //System.out.println(firstArray[0]);

        /**/
        System.out.print("How many players? ");
        int count = sc.nextInt(); // sc is a Scanner
        String[] players = new String[count];

    }

}
