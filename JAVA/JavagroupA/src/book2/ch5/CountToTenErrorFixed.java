package book2.ch5;
/*this is fixing the scope issue from CountToTenError*/

public class CountToTenErrorFixed {
    public static void main(String[] args) {
        int i;//now declaring outside the for loop
        for (i = 1; i <=10; i++){
            System.out.println(i);//

        }
        System.out.println("The final value of i is " + i);//final value will be what the updated value after the loop
    }

}
