import java.util.ArrayList;

public class MovieScanner
{
    public static ArrayList <Movie> data = new ArrayList <Movie> ();

    //what do you need to add to show that there could be an error? CANNOT use try-catch
    //reading MUST use Scanner & File (don't forget any imports that are necessary)
    //scan data, create a Movie object, store that data into data list (don't need to store everything)
    //CANNOT change Movie class
    public static void scanData()
    {
        
    }

    //return title of movie with the shortest title. If there are multiple with the same length, return the LAST
    public static String getShortestTitle()
    {
        return "";
    }

    //return the number of movies that have this genre listed. REMEMBER the genre category could list multiple genres (like Comedy|Fantasy|Sci-Fi)
    public static int genre(String genre)
    {
        return 0;
    }

    //calculate the average imbd rating from the year sent in
    public static double imbdRating(int year)
    {
        return 0.0;
    }

    //return the movie that has the most award wins. If there is multiple movies with the same number of wins return the FIRST from the list in the CSV file
    public static String mostAwards()
    {
        return "";
    }
}
