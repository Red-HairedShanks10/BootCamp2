package book2.ch8;

import java.io.FileInputStream;

public class FileException1 {
    public static void main(String[] args)
    {
        openFile("C:\test.txt");
    }

    public static void openFile(String fileName){
        FileInputStream f = new FileInputStream(fileName);
    }
}
