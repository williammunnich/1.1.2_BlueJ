
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
    public void setTitle(String t) {
        title =t;
    }
    public String getTitle() {
        return title;
    }
    public void setPrice(double p){
        price =p;
    }
    public double getPrice(){
        return price;
    }
    public void setFavorite(boolean f){
        favorite =f;
    }
    public boolean getFavorite(){
        return favorite;
    }
    public Song(String title,double price,boolean favorite, double rating) {
        title =title;
        price =price;
        favorite =favorite;
        rating =rating;
    }
    
}
