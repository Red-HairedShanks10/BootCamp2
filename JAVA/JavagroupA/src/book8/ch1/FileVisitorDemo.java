package book8.ch1;

import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.nio.file.Path;
import java.nio.file.Paths;

//This program list every file found in the System32 directory
public class FileVisitorDemo
{
    public static void main(String[] args)
    {
        //create Path instance, that starts the file tree of this specified directory
        Path start = Paths.get("c:\\Windows\\System32");

        //create instance of the MyFileVistor class we made
        MyFileVisitor visitor = new MyFileVisitor();
        try
        {
            //use the walkFileTree()to go through the file tree
            //...starting at the directory store in start
            Files.walkFileTree(start, visitor);
        }
        catch (Exception e)
        {
            //print any error/exception caught
            System.out.println(e.getMessage());
        }
    }


    //MyFileVisitor class extends a generic class
    //which we specify the Path type so that the SimpleFileVisitor class can process Path objects
    private static class MyFileVisitor extends SimpleFileVisitor <Path>
    {
        //override the visitFile() which is called each time a new file is accessed
        //...then prints the file to the console
        public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
            System.out.println(file.toString());
            //return the continue value to indicate that the file-walk should continue proccessing the files
            return FileVisitResult.CONTINUE;
        }

        //override visitFileFailed() called whenever a file cannot be access
        public FileVisitResult visitFileFailed(Path file, BasicFileAttributes attr)
        {
            //print error message
            System.out.println(file.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }

        //override preVisitDirectoryFailed()
        // does a similar action as visitFileFail(), focuses on unavailable directories
        public FileVisitResult preVisitDirectoryFailed(Path dir, IOException e)
        {
            System.out.println(dir.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
    }
}