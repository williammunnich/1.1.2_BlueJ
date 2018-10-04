
public class Song
{
    public int rating;
    public String title;
    public double price;
    public boolean favorite;
    
    
    public Song()
    {
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }
    public Song(String title,double price,int rating, boolean favorite ) {
        
        this.title =title;
        this.price =price;
        this.favorite =favorite;
        this.rating =rating;
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
