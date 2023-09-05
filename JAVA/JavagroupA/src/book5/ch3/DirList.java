package book5.ch3;
import java.io.File;
import java.util.Scanner;
public class DirList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Welcome to the Directory Lister");

        do {
            System.out.print("\nEnter a path: ");
            String path = sc.nextLine();//get file path name from user
            //17//the File class constructor creates new File object
            File dir = new File(path);//we use pathname given by the user
            if (!dir.exists() || !dir.isDirectory()) {//18//check
                System.out.println("\nThat directory doesn't exist.");
            } else {
                System.out.println("\nListing directory tree of:");
                System.out.println(dir.getPath());//25
                listDirectories(dir, " ");//26
            }
        }while(askAgain());//28
    }




    private static void listDirectories(File dir, String indent){//31
        File[] dirs = dir.listFiles();//34
        for (File f : dirs){//35
            if (f.isDirectory()){//37
                System.out.println(indent + f.getName());//40
                listDirectories(f, indent + " ");//41
            }
        }

    }

    private static boolean askAgain()
    {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y"))
            return true;
        return false;
    }

}
