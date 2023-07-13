public class Movie {

	String title,genre;
	int total_seats,booked_seats,remaining_seats;
	public int getRemaining_Seat() {
		return total_seats-booked_seats;
	}
	public void settitle(String title)
    {
        this.title=title;
    }
    public void setgenre(String genre)
    {
        this.genre=genre;
    }
    public void settotal_seats(int total_seats)
    {
    this.total_seats=total_seats;
    }
    public void setbooked_seats(int booked_seats)
    {
    	this.booked_seats=booked_seats;
    }
    public String gettitle()
    {
        return title;
    }
    public String getgenre()
    {
        return genre;
    }
    public int gettotal_seats()
    {
    	return total_seats;
    }
    public int getbooked_seats()
    {
    	return booked_seats;
    }
}