package book8.ch2;

import java.io.*;
public class WriteBinaryFile
{
    public static void main(String[] args) →4
    {
        Movie[] movies = getMovies();
        DataOutputStream out = openOutputStream("movies.dat");
        for (Movie m : movies)
            writeMovie(m, out);
        closeFile(out);
    }
    private static Movie[] getMovies() →12
    {
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("It's a Wonderful Life",
                1946, 14.95);
        movies[1] = new Movie("Young Frankenstein",
                1974, 16.95);
        movies[2] = new Movie("Star Wars",
                1977, 17.95);
        movies[3] = new Movie("The Princess Bride",
                1987, 16.95);
        movies[4] = new Movie("Glory",
                1989, 14.95);
        movies[5] = new Movie("The Game",
                1997, 14.95);
        movies[6] = new Movie("Shakespeare in Love",
                1998, 19.95);
        movies[7] = new Movie("Zombieland",
                1997, 18.95);
        movies[8] = new Movie("The King's Speech",
                1997, 19.95);
        movies[9] = new Movie("Star Trek Into Darkness",
                1997, 19.95);
        return movies;
    }
    private static DataOutputStream
    openOutputStream(String name) →38
    {
        DataOutputStream out = null;
        try
        {
            File file = new File(name);
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file) ) );
            return out;
        }
        catch (IOException e)
        {
            System.out.println(
                    "I/O Exception opening file.");
            System.exit(0);
        }
        return out;
    }
    private static void writeMovie(Movie m, →57
                                   DataOutputStream out)
    {
        try
        {
