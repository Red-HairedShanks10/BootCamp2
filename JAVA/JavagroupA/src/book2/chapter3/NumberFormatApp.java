package book2.chapter3;

import java.text.NumberFormat;

public class NumberFormatApp {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args)
    {
        printMyAllowance();
        printCostOfPaintBallGun();
    }

    public static void printMyAllowance()
    {
        double myAllowance = 3340;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My allowance is: " + cf.format(myAllowance));
    }




}
