package book2.ch5;
/*Exploring nested for loops*/

public class Matrix {

    public static void main(String[] args) {

        for(int x = 1; x < 10; x++){//in main loop we set up x iterations

            //this for loop will be executed for each x iteration
            for (int y = 1; y < 10; y++) {//set up y iteration as well
                //at current y iteration
                System.out.print(x + "-" + y + " ");//print out the x iteration num  and y iteration num
            }
            System.out.println();
        }
    }
}
