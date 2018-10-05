public class Book
{
   private int rating;
    private String title;
    private double price;
    private boolean favorite;
    private int duration;
    
    
    public Book()
    {
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
        duration = 0;
        
    }
    public Book(String title,double price,int rating, boolean favorite, int duration ) {
        
        this.title =title;
        this.price =price;
        this.favorite =favorite;
        this.rating =rating;
        this.duration =duration;
    }
    public String getTitle() {
        System.out.println("book title");
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
        System.out.println("pages");
        return duration;
    }
   
    
}