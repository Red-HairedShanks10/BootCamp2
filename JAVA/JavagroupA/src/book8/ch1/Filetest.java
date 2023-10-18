package book8.ch1;

import java.io.File;
import java.io.IOException;

public class Filetest {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\Marco\\Desktop\\Bootcamp\\Java_Bootcamp\\New Folder\\hits.log");
        try {
            if (f.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File could not be created.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
