package book8.ch1;

import java.io.File;

public class Filetest {
    public static void main(String[] args) {

        File f = new File(path);
        if (f.createNewFile())
            System.out.println("File created.");
        else
            System.out.println("File could not be created.");
    }

}
