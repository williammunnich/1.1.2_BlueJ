
public class Song
{
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    
    public Song()
    {
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }
    
    
    public Song(String title,double price,boolean favorite, double rating) {
        title =title;
        price =price;
        favorite =favorite;
        rating =rating;
    }
    public String getTitle() {
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
    //public getSong();{}
}
