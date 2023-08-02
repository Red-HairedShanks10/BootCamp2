package book2.chapter3;
/*Testing the weird and bad parts of Java numbers*/

import java.text.NumberFormat;

public class WeirdJava {
    public static void main(String[] args) {

        //weird float things......
        float x = 0.1f;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(x));
    }
}
