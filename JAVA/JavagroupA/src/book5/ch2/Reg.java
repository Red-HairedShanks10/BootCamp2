package book5.ch2;
import java.util.regex.*;
import java.util.Scanner;
public class Reg {
    static String r, s;
    static Pattern pattern;
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This is the " + "Regex Tester\n");

        do{
            do{
                System.out.print("\nEnter regex: ");
                r = sc.nextLine();
                validRegex = true;
                try{
                    pattern = Pattern.compile(r);
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    validRegex = false;
                }
            }
        }
    }



}
