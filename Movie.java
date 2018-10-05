
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
   private int rating;
    private String title;
    private double price;
    private boolean favorite;
    private int duration;
    private int hours;
    private int minutes;
    
    
    public Movie()
    {
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
        duration = 0;
        hours = 0;
        minutes = 0;
        
    }
    public Movie(String title,double price,int rating, boolean favorite, int duration ) {
        
        this.title =title;
        this.price =price;
        this.favorite =favorite;
        this.rating =rating;
        this.duration =duration;
    }
    public String getTitle() {
        System.out.println("movie title");
        return title;
    }
    public double getPrice(){
        return price;
    }
    public boolean getFavorite(){
        return favorite;
    }
    public double getRating(){
        return rating;
    }
    public int getDuration(){
        return duration;
    }
    public double gethoursDuration(){
        hours = (duration - (duration%60))/60;
        System.out.println("hours");
        return hours;
    }
     public double getminutesDuration(){
        minutes = (duration%60);
        System.out.println("minutes");
        return minutes;
        
        
    }
}
