package book8.ch2;

import java.io.*;
public class WriteFile
{
    public static void main(String[] args) →4
    {
        Movie[] movies = getMovies();
        PrintWriter out = openWriter("movies2.txt");
        for (Movie m : movies)
            writeMovie(m, out);
        out.close();
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
    private static PrintWriter openWriter(String name) →37
    {
        try
