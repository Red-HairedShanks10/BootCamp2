package book8.ch2;

import java.io.*;
import java.text.NumberFormat;


public class ReadBinaryFile {
    public static void main(String[] args){

        NumberFormat cf = NumberFormat.getCurrencyInstance();//used to set currency format for movie price

        //call the getStream() to read the file....
        DataInputStream in = getStream("C:\\Users\\Marco\\Desktop\\BootCamp2\\JAVA\\JavagroupA\\src\\book8\\ch2\\movies.dat");
        boolean eof = false;

        while (!eof)
        {
            //call readMovie() to get a Movies object
            Movie movie = readMovie(in);
            if (movie == null) {//if the movie object is null
                eof = true;//we set the boolean value to true
            }
            else
            {//otherwise we print out the movie object
                String msg = Integer.toString(movie.year);
                msg += ": " + movie.title;
                msg += " (" + cf.format(movie.price) + ")";
                System.out.println(msg);
            }
        }
        closeFile(in);//close file when loop ends
    }

    //getStream() method returns a DataInputStream object//for the file-name
    private static DataInputStream getStream(String name) {

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

   // readMovie() returns an object of type Movie
    //when it reads the data of single movie
    private static Movie readMovie(DataInputStream in){

        String title = "";
        int year = 0;;
        double price = 0.0;;
        try
        { title = in.readUTF();
            year = in.readInt();
            price = in.readDouble();
        }
        catch (EOFException e)
        {
            return null;
        }
        catch (IOException e)
        {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return new Movie(title, year, price);
    }

    //closeFile() closes the input-Stream
    private static void closeFile(DataInputStream in){

        try
        {
            in.close();
        }
        catch(IOException e)
        {
            System.out.println("I/O Error closing file.");
            System.out.println();
        }
    }

    //Movie class, is defined as a Private inner class
    private static class Movie{

        public String title;
        public int year;
        public double price;

    public Movie(String title, int year, double price)
        {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }


}
