
public class MediaLib
{
    public double totalCost;
    public int numSongs;
    public static double testVal = 0.0;
    public ArrayList totalRatings = ();
    public static void main()
    {
     System.out.println("\f");
     System.out.println("Welcome to your Media Libray");
     double totalCost = 0.0;
     int numSongs = 0;
     List a = newArrayList();
     //Song song = new Song();
     Book book = new Book();
     Movie movie = new Movie();
     //System.out.println(song);
     //System.out.println(book);
     //System.out.println(movie);
     Song song = new Song("yellow", 3.30, 4, false );
     numSongs += 1;
     Song song2 = new Song("blue", 3.30, 6, true );
     numSongs += 1;
     Song song3 = new Song("green", 3.30, 9, true );
     numSongs += 1;
     book.setTitle("Hunger games");
     movie.setTitle("Mr.Nobody");
     //System.out.println(song.getPrice());
     //System.out.println(book.getTitle());
     //System.out.println(movie.getTitle());
     //System.out.println(song.getFavorite());
     System.out.println(song.getTitle());
     totalCost += song.getPrice();
     totalCost += song2.getPrice();
     totalCost += song3.getPrice();
     System.out.println(totalCost);
     testVal += totalCost;
     testVal = testVal / numSongs;
     System.out.println(testVal);
     totalRatings.append(song.getRating());
    }
}


