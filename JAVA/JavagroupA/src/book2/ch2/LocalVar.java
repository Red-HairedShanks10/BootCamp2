package book2.ch2;

public class LocalVar {
    public static  void  main(String[] args){
        //local variables are only used within the scope there are declared and initialised
        int taxRate = 10;
        double subTotal = 10;
        double total = 45;


        if (taxRate > 0)
        {
            double taxAmount = subTotal * taxRate;//taxAmount var is only accessible within this if block
            total = subTotal + total;
            System.out.println(total);
        }
      //  System.out.println(total);//total value will be the same as the total value in the if block
    }

}
