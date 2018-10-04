
public class MediaLib
{
    public  int duration;
    public double totalCost;
    public int numSongs;
    public static double testVal = 0.0;
    public String totalRatings = "";
    public double average = 0.0;
    
    public int hours;
    public int minutes;
    
    public static void main(){
     System.out.println("\f");
     System.out.println("Welcome to your Media Libray");
     double totalCost = 0.0;
     int numSongs = 0;
     //Song song = new Song();
     Book book = new Book();
     Movie movie = new Movie();
     //System.out.println(song);
     //System.out.println(book);
     //System.out.println(movie);
     Song song1 = new Song("yellow", 3.30, 4, false );
     numSongs += 1;
     Song song2 = new Song("blue", 3.30, 6, true );
     numSongs += 1;
     Song song3 = new Song("green", 3.30, 9, true );
     numSongs += 1;
     book.setTitle("Hunger games");
     Movie movie1 = new Movie("hunger", 3.30, 4, false, 120 );
     //System.out.println(song.getPrice());
     //System.out.println(book.getTitle());
     //System.out.println(movie.getTitle());
     //System.out.println(song.getFavorite());
     System.out.println(song1.getTitle());
     totalCost += song1.getPrice();
     totalCost += song2.getPrice();
     totalCost += song3.getPrice();
     System.out.println(totalCost);
     testVal += totalCost;
     testVal = testVal / numSongs;
     System.out.println(testVal);
     //average = testVal;
     System.out.println("cost all songs:");
     //System.out.println(average);
     System.out.println(movie1.getTitle());
     duration = movie1.getDuration();
     minutes= (duration%60);
     hours = (duration - (duration%60))/60;
     System.out.println(minutes);
     System.out.println(hours);
    }
}


