package book8.ch1;

import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileVisitorDemo
{
    public static void main(String[] args)
    {
        Path start = Paths.get("c:\\Windows\\System32");// →9
        MyFileVisitor visitor = new MyFileVisitor(); //→10
        try
        {
            Files.walkFileTree(start, visitor); //→13
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    private static class MyFileVisitor extends SimpleFileVisitor <Path> //→21
    {
        //→23
        public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE; //→27
        }

        //→30
        public FileVisitResult visitFileFailed(Path file, BasicFileAttributes attr)
        {
            System.out.println(file.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }

        //→36
        public FileVisitResult preVisitDirectoryFailed(Path dir, IOException e)
        {
            System.out.println(dir.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
    }
}