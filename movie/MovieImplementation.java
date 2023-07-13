
import java.util.Scanner;

public class MovieImplementation {
  Scanner s = new Scanner(System.in);
  Movie[] mv = new Movie[100];
  int count = 0;

  public void addMovie() {
    s.nextLine();
    System.out.println("Enter the movie name");
    String title = s.nextLine();
    System.out.println("enter the movie genre");
    String genre = s.nextLine();
    System.out.println("enter the total_seats");
    int total_seats = s.nextInt();
    int booked_seats = 0;
    Movie m = new Movie();
    m.setbooked_seats(booked_seats);
    m.settitle(title);
    m.setgenre(genre);
    m.settotal_seats(total_seats);
    mv[count] = m;
    count++;
  }

  public void bookSeat() {
    s.nextLine();
    System.out.println("Enter the movie name");
    String name = s.nextLine();
    for (int i = 0; i < count; i++) {
      if (name.equalsIgnoreCase(mv[i].gettitle())) {
        System.out.println("available seats " + mv[i].getRemaining_Seat());
        System.out.println("Enter number of seats to be booked");
        int seats = s.nextInt();
        mv[i].setbooked_seats(mv[i].getbooked_seats() + seats);
        System.out.println("successfully booked");
        break;
      }
    }
  }

  public void movieDetails() {
    s.nextLine();
    System.out.println("enter the movie name");
    String movie = s.nextLine();
    for (int i = 0; i < count; i++) {
      if (mv[i].gettitle().equalsIgnoreCase(movie)) {
        System.out.println("The movie Genre " + mv[i].getgenre());
        System.out.println("The No.of Booked seats " + mv[i].getbooked_seats());
        System.out.println("The No.of remianing seats " + mv[i].getRemaining_Seat());
      }
    }
  }

  public void available_seats() {
    s.nextLine();
    System.out.println("enter the movie name");
    String movie = s.nextLine();
    for (int i = 0; i < count; i++) {
      if (mv[i].gettitle().equalsIgnoreCase(movie)) {
        System.out.println("The No.of remianing seats " + mv[i].getRemaining_Seat());
      }
    }
  }

  public static void main(String[] args) {
    MovieImplementation obj = new MovieImplementation();
    int option = 0;
    do {
      System.out.println("1.insert movie");
      System.out.println("2.book seats");
      System.out.println("3.Show details of movie");
      System.out.println("4.available seats for specific movie");
      System.out.println("5.exit");
      System.out.println("Enter option");
      option = obj.s.nextInt();
      if (option == 1) {
        obj.addMovie();
      } else if (option == 2) {
        obj.bookSeat();
      } else if (option == 3) {
        obj.movieDetails();
      } else if (option == 4) {
        obj.available_seats();
      } else {
        System.out.println("thank you");
      }
    } while (option != 5);
    // TODO Auto-generated method stub

  }

}
