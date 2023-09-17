package book8.ch4;

import java.text.NumberFormat;
import java.sql.*;

public class ListMovies {
    public static void main(String[] args) //→6
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        ResultSet movies = getMovies();
        try
        {
            while (movies.next())
            {
                Movie m = getMovie(movies);
                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";
                System.out.println(msg);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    private static ResultSet getMovies()// →28
    {
        Connection con = getConnection();
        try
        {
            Statement s = con.createStatement();
            String select = "Select title, year, price "
}
