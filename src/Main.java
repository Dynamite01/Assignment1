public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Test Cinema"); // the name of the Cinema
        Movie movie1 = new Movie("Behruz", 12 , "horror", 7 , 120 , 1200);
        Movie movie2 = new Movie("test", 2003, "horror", 8 , 120 , 1500 );


        Viewer viewer1 = new Viewer("behruz", 2006); // Adding the viewers
        Viewer viewer2 = new Viewer("test", 2006); // Adding the viewers

        // Adding the movie
        cinema.addMovie(movie1);
        cinema.addMovie(movie2);

        // Adding the tickets
        cinema.addTicket("Ticket 1");
        cinema.addTicket("Ticket 2");



        // Output of movies
        cinema.getInfoMovies();

        // Output of the available tickets
        cinema.getInfoTickets();

        // Booking the tickets
        cinema.bookTicket(viewer1, movie1);

        // Output of the booked tickets
        cinema.displayBookings();
    }
}

