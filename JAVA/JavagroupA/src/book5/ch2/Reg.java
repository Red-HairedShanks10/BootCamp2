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
            do{ //this program allows a user to input a Regex pattern
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
            }while (!validRegex);
            doneMatching = false;

            while (!doneMatching){
                //then waits for input string to be compared to the Regex
                System.out.print("Enter string: ");
                s = sc.nextLine();
                //then test if the input string matches the Regx pattern
                if (s.length() == 0){
                    doneMatching = true;
                }else {
                    matcssher = pattern.matcher(s);
                    if (matcher.matches()){
                        System.out.println("Match");
                    }else
                        System.out.println("Does not match.");
                }
            }
            //it will prompt user for continuation to test more input strings
        }while(askAgain()); //otherwise the program will stop if user exits...
    }
    private static boolean askAgain(){//method will return bool depending on the user
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")){
            return true;
        }
        return false;

    }




}
