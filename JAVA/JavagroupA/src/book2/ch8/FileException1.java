package book2.ch8;

import java.io.*;

public class FileException1 {
    public static void main(String[] args) {
        openFile("C:\test.txt");
    }

    public static void openFile(String fileName) {
        try {
            FileInputStream f = new FileInputStream(fileName);
        }catch (Exception err){
            System.out.println(err);
        }
    }
}

class FileException2 {

    public static void main(String[] args) {
        try {
            openFile("C:\test.txt");
        }catch (FileNotFoundException f_error){
            System.out.println("file error(File not found");
        }
    }

    public static void openFile(String fileName) {

            FileInputStream f = new FileInputStream(fileName);
            System.out.println(err);

    }

}
