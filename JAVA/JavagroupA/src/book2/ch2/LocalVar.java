package book2.ch2;

public class LocalVar {
    public static  void  main(String[] args){
        //local variables are only used within the method there are declared and initialised
        int taxRate = 10;
        double subTotal = 10;
        double total;
        total = 45;


        if (taxRate > 0)
        {
            double taxAmount = subTotal * taxRate;
            total = subTotal + total;
            System.out.println(total);
        }

    }

}
