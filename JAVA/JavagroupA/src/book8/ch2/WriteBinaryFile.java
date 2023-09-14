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
