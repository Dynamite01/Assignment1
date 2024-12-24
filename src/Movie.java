public class Movie {
    private String title; //private для защиты данных
    private int year;
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
    // метод
    public void displayMovie() {
        System.out.println("Title: " + title + "Year: " + year + "Genre: " + genre + "Rating: " + rating + "Duration: " + duration + "Price: " + price);
    }



}
