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

            if (!dir.exists() || !dir.isDirectory()) {//18//check if the path exists
                System.out.println("\nThat directory doesn't exist.");
            } else {
                System.out.println("\nListing directory tree of:");
                System.out.println(dir.getPath());//25//if the path exist, we display the name
                //26//we list sub-folders of the directory here...
                listDirectories(dir, " ");//...using the listDirectory()that we created
            }
        }while(askAgain());//28//we prompt the user if they want to list another directory
    }




    //this method focuses on listing the Directory that will be entered by the user
    //and will print any subdirectories found within the directory
    private static void listDirectories(File dir, String indent){
        File[] dirs = dir.listFiles();//listFiles gets an array of all the file objects of the directory
        for (File f : dirs){//enhanced for loop to process directory array
            if (f.isDirectory()){//check if the file is a directory
                System.out.println(indent + f.getName());//if so return the name of directory
                listDirectories(f, indent + " ");//using recursion to add two spaces to right the right of current directory
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
