import java.util.Objects;

public class Movie {
    private String title; //private для защиты данных
    private int year;  // инкапсуляция
    private String genre;
    private int rating;
    private int duration;
    private int price;
    //constructor
    public Movie(String title, int year, String genre, int rating, int duration, int price) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.price = price;
    }
    // getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    // for showing Movies



    // Override toString() method
    @Override
    public String toString() {    //полиморфизм
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }

    // Override equals() method
    // переопределение
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return year == movie.year && rating == movie.rating && duration == movie.duration &&
                price == movie.price && title.equals(movie.title) && genre.equals(movie.genre);
    }

    // Override hashCode() method
    //переопеределение
    @Override
    public int hashCode() {
        return Objects.hash(title, year, genre, rating, duration, price);
    }




}
