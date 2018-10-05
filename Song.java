public class Song
{
   private int rating;
    private String title;
    private double price;
    private boolean favorite;
    private int duration;
    private int seconds;
    private int minutes;
    
    
    public Song()
    {
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
        duration = 0;
        seconds = 0;
        minutes = 0;
        
    }
    public Song(String title,double price,int rating, boolean favorite, int duration ) {
        
        this.title =title;
        this.price =price;
        this.favorite =favorite;
        this.rating =rating;
        this.duration =duration;
    }
    public String getTitle() {
        System.out.println("song title");
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
    public double getminutesDuration(){
        minutes = (duration - (duration%60))/60;
        System.out.println("minutes");
        return minutes;
    }
     public double getsecondsDuration(){
        seconds = (duration%60);
        System.out.println("seconds");
        return seconds;
        
        
    }
}
