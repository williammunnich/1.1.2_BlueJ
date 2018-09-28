
public class MediaLib
{
    public static void main()
    {System.out.println("Welcome to your Media Libray");
     Song song = new Song();
     Book book = new Book();
     Movie movie = new Movie();
     //System.out.println(song);
     //System.out.println(book);
     //System.out.println(movie);
     Song song = new Song("yellow", 3.30, true, 4 );
     book.setTitle("Hunger games");
     movie.setTitle("Mr.Nobody");
     //System.out.println(song.getPrice());
     //System.out.println(book.getTitle());
     //System.out.println(movie.getTitle());
     //System.out.println(song.getFavorite());
     System.out.println(song.getTitle());
    }
}


