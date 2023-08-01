package book2.ch2;

public class CString {
    public static void main(String[] args) {

        /*converting primitive types into String*/
        //integer to string
        int x = 34;
        String s = Integer.toString(x);
        System.out.println("num to string: " + s);
        /////////////
        /***********/

        /*converting String into other Primitive types*/
        String sNum = "100";
        int num = Integer.parseInt(sNum);
        System.out.println("String to num: " + sNum);


    }
}
