import java.util.ArrayList;

public class Cinema {
    private String cinemaName;
    private ArrayList<Movie> movies;
    private ArrayList<String> tickets;
    private ArrayList<String> bookings;

    // Consturctor
    public Cinema(String cinemaName) {
        this.cinemaName = cinemaName;
        this.movies = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }
    // The getters and setters to provide access to "private variables"
    // Adding the movie
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Adding the new ticket
    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    // Booking
    public void bookTicket(Viewer viewer, Movie movie) {
        if (movies.contains(movie)) {
            bookings.add("Viewer: " + viewer.getName() + " | Movie: " + movie.getTitle());
            System.out.println("Ticket booked successfully for " + viewer.getName());
        } else {
            System.out.println("Ticket booking failed. Movie not available.");
        }
    }

    // Getting  info about movies
    public void getInfoMovies() {
        System.out.println("Movies available in " + cinemaName + ":");
        for (Movie movie : movies) {
            movie.displayMovie();
        }
    }

    // Getting info about available tickets
    public void getInfoTickets() {
        System.out.println("Tickets available:");
        for (String ticket : tickets) {
            System.out.println("Ticket: " + ticket);
        }
    }

    // Showing the bookings
    public void displayBookings() {
        System.out.println("Bookings:");
        for (String booking : bookings) {
            System.out.println(booking);
        }
    }
}
