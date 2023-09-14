package book8.ch2;

import java.io.*; →1
import java.text.NumberFormat;
public class ReadFile
{
    public static void main(String[] args)
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        BufferedReader in = getReader("movies.txt"); →8
        Movie movie = readMovie(in); →9
        while (movie != null) →10
        {
            String msg = Integer.toString(movie.year);
            msg += ": " + movie.title;
            msg += " (" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);
        }
    } →18
    private static BufferedReader getReader(String name) →19
    {
        BufferedReader in = null;
        try
        {
            File file = new File(name);
            in = new BufferedReader(
                    new FileReader(file) );
        }
        catch (FileNotFoundException e)
        {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }
    private static Movie readMovie(BufferedReader in) →36
    {