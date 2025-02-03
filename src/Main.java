import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
//        Cinema cinema = new Cinema("Test Cinema"); // the name of the Cinema
//        Movie movie1 = new Movie("Behruz", 12, "horror", 7, 120, 1200);
//        Movie movie2 = new Movie("Test Movie", 2003, "horror", 8, 120, 1500);
//        Viewer viewer1 = new Viewer("Behruz", 2006); // Adding the viewers
//        Viewer viewer2 = new Viewer("Test Viewer", 2006); // Adding the viewers
//
//        // Adding the movies
//        cinema.addMovie(movie1);
//        cinema.addMovie(movie2);
//
//        // Adding the tickets
//        cinema.addTicket("Ticket 1");
//        cinema.addTicket("Ticket 2");
//
//        // Output of movies
//        cinema.getInfoMovies();
//
//        // Output of the available tickets
//        cinema.getInfoTickets();
//
//        // Booking the tickets
//        cinema.bookTicket(viewer1, movie1);
//
//        // Output of the booked tickets
//        cinema.displayBookings();
//        // Filtering
//        cinema.filterMoviesByGenre("horror");
//
//        //Search movie by name
//        cinema.searchMovieByTitle("Behruz");
//
//        // filtering movies by price
//        cinema.filterByPrice();
//
//        // Sorting the films by rating
//        cinema.sortMoviesByRating();

        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("cinema","postgres","234Bex456");
        db.create_table1(conn, "cinema");
        db.create_table2(conn, "viewers");
        db.create_table3(conn, "movie");
        db.insert_row_cinema(conn,"cinema", "Test1","Inception", 0, 0 );
        db.insert_row_movie(conn,"movie", "Inception",2010, "Sci-Fi", 9 ,148, 12);
        db.insert_row_viewer(conn,"viewers", "Behruz",18);
        db.update_name(conn, "cinema", "Test1", "AITU Cinema");
        db.read_data(conn, "cinema");
        db.search_by_name(conn, "movie","Inception");
        db.delte_row_by_name(conn, "cinema","AITU Cinema");
        db.delte_row_by_id(conn, "movie", 2);
        db.delete_table(conn, "cinema");
        db.delete_table(conn, "viewers");




    }
}
