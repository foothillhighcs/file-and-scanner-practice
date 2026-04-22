public class Movie {
    public String title;
    public String genre; //could be more than one in this string!
    public double imbdRating;
    public int awardWins;

    public Movie(String title, String genre, double imbdRating, int awardWins)
    {
        this.title = title;
        this.genre = genre;
        this.imbdRating = imbdRating;
        this.awardWins = awardWins;
    }

    public String getTitle()
    {
        return title;
    }

    public String getGenre()
    {
        return genre;
    }

    public double getIMDB()
    {
        return imbdRating;
    }

    public int getAwardWins()
    {
        return awardWins;
    }
    
}
