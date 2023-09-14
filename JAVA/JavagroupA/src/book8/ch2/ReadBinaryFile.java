package book8.ch2;

import java.io.*;
import java.text.NumberFormat;
public class ReadBinaryFile
{
    public static void main(String[] args) →5
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        DataInputStream in = getStream("movies.dat");
        boolean eof = false;
        while (!eof)
        {
            Movie movie = readMovie(in);
            if (movie == null)
                eof = true;
            else
            {
                String msg = Integer.toString(movie.year);
                msg += ": " + movie.title;
                msg += " (" + cf.format(movie.price) + ")";
                System.out.println(msg);
            }
        }
        closeFile(in);
    }
    private static DataInputStream getStream(String name) →25
    {
        DataInputStream in = null;
        try
        {
            File file = new File(name);
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file) ) );
        }
        catch (FileNotFoundException e)
        {
            System.out.println("The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }
    private static Movie readMovie(DataInputStream in) →42
    {
        String title = "";
        int year = 0;;
        double price = 0.0;;
        try
        {