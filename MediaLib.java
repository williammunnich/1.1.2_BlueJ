
public class MediaLib
{
    public static void main()
    {System.out.println("Welcome to your Media Libray");
     Song song = new Song();
     Book book = new Book();
     Movie movie = new Movie();
     System.out.println(song);
     System.out.println(book);
     System.out.println(movie);
     song.setTitle("Do you realize");
     book.setTitle("Hunger games");
     movie.setTitle("Mr.Nobody");
     System.out.println(song.getTitle());
     System.out.println(book.getTitle());
     System.out.println(movie.getTitle());
     
    }
}


