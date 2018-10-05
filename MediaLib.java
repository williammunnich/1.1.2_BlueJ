public class MediaLib
{
    public int duration;
    public  static double totalCost = 0.0;
    public  static int numSongs = 0;
    public static double testVal = 0.0;
    public static int totalRatings = 0;
    public double average = 0.0;
    public static double averagesongRating = 0.0;
    public static double numRatings = 0.0;
    
    public static void main(){
     System.out.println("\f");
     System.out.println("Welcome to your Media Libray");
     
     Song song1 = new Song("yellow", 3.30, 4, false, 130 );
     numSongs += 1;
     numRatings += 1;
     totalRatings += song1.getRating();
     Song song2 = new Song("blue", 3.30, 6, true, 186 );
     numSongs += 1;
     numRatings += 1;
     totalRatings += song2.getRating();
     Song song3 = new Song("green", 3.30, 9, true, 222 );
     numSongs += 1;
     numRatings += 1;
     totalRatings += song3.getRating();
     averagesongRating = totalRatings/numRatings;
     System.out.println("average song rating:");
     System.out.println(averagesongRating);
     
     
     Book book1 = new Book("Hunger games", 6.9, 10, false, 300);
     
     
     Movie movie1 = new Movie("hunger", 3.30, 4, false, 130 );
     
     
     System.out.println(song1.getTitle());
     
     totalCost += song1.getPrice();
     totalCost += song2.getPrice();
     totalCost += song3.getPrice();
     System.out.println("cost all songs:");
     System.out.println(totalCost);
     
     
     testVal += totalCost;
     testVal = testVal / numSongs;
     System.out.println("Average cost songs");
     System.out.println(testVal);
     
     
     System.out.println(movie1.getTitle());
     
     System.out.println(movie1.gethoursDuration());
     System.out.println(movie1.getminutesDuration());
     System.out.println(book1.getTitle());
    }
}


