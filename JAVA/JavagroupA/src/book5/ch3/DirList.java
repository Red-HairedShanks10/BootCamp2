package book5.ch3;
import java.io.File;
import java.util.Scanner;
public class DirList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Welcome to the Directory Lister");

        do
        {
            System.out.print("\nEnter a path: ");
            String path = sc.nextLine();
            File dir = new File(path);
    }       if (!dir.exists() || !dir.isDirectory())
            System.out.println("\nThat directory doesn't exist.");
}
