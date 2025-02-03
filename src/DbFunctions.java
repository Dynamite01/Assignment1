import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunctions {
    public Connection connect_to_db(String dbname, String user, String pass) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Connected to PostgreSQL database");
            } else {
                System.out.println("Failed to connect to PostgreSQL database");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;

    }

    public void create_table1(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = "CREATE TABLE " + table_name + " (" +
                    "cinema_id SERIAL, " +
                    "cinema_name VARCHAR(200), " +
                    "movies VARCHAR(200), " +
                    "tickets VARCHAR(200), " +
                    "bookings VARCHAR(200), " +
                    "age INTEGER, " +
                    "PRIMARY KEY(cinema_id));";
            statement = conn.createStatement();
            statement.execute(query);
            System.out.println("Table created: " + table_name);
        } catch (Exception e) {
            System.out.println("Error creating table " + table_name + ": " + e);
        }
    }


    public void create_table2(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = "CREATE TABLE " + table_name + " (" +
                    "viewer_id SERIAL, " +
                    "name VARCHAR(200), " +
                    "age INTEGER, " +
                    "PRIMARY KEY(viewer_id));";
            statement = conn.createStatement();
            statement.execute(query);
            System.out.println("Table created: " + table_name);
        } catch (Exception e) {
            System.out.println("Error creating table " + table_name + ": " + e);
        }
    }

    public void create_table3(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = "CREATE TABLE " + table_name + " (" +
                    "movie_id SERIAL, " +
                    "title VARCHAR(200), " +
                    "year INTEGER, " +
                    "genre VARCHAR(200), " +
                    "rating INTEGER, " +
                    "duration INTEGER, " +
                    "price INTEGER, " +
                    "PRIMARY KEY(movie_id));";
            statement = conn.createStatement();
            statement.execute(query);
            System.out.println("Table created: " + table_name);
        } catch (Exception e) {
            System.out.println("Error creating table " + table_name + ": " + e);
        }
    }

    public void insert_row_cinema(Connection conn, String table_name, String cinema_name, String movies, int tickets, int bookings) {
        Statement statement;
        try {
            String query = String.format("INSERT INTO %s(cinema_name, movies, tickets, bookings ) values('%s', '%s', %d, %d);",
                    table_name, cinema_name, movies, tickets, bookings );
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted into cinema table");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insert_row_viewer(Connection conn, String table_name, String name, int age) {
        Statement statement;
        try {
            String query = String.format("INSERT INTO %s(name, age) values('%s', %d);", table_name, name, age);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted into viewer table");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insert_row_movie(Connection conn, String table_name, String title, int year, String genre, int rating, int duration, int price) {
        Statement statement;
        try {
            String query = String.format("INSERT INTO %s(title, year, genre, rating, duration, price) values('%s', %d, '%s', %d, %d, %d);",
                    table_name, title, year, genre, rating, duration, price);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row inserted into movie table");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void read_data(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try {
            String query = String.format("SELECT * FROM %s", table_name);
            statement = conn.createStatement();
            statement.executeQuery(query);
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getString("empid") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.println(rs.getString("adress") + " ");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update_name(Connection conn, String table_name, String old_name, String new_name) {
        Statement statement;
        try {
            // Использование подготовленного выражения для предотвращения SQL инъекций
            String query = String.format("UPDATE %s SET cinema_name = '%s' WHERE cinema_name = '%s'", table_name, new_name, old_name);
            statement = conn.createStatement();

            // Выполнение запроса
            statement.executeUpdate(query);
            System.out.println("Table updated");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void search_by_name(Connection conn, String table_name, String title) {
        Statement statement;
        ResultSet rs =null;
        try{
            String query = String.format("SELECT * FROM %s WHERE title = '%s'", table_name, title);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getString("movie_id") + " ");
                System.out.print(rs.getString("title") + " ");
                System.out.println(rs.getString("duration") + " ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void delte_row_by_name(Connection conn , String table_name, String name ){
        Statement statement;
        try{
            String query = String.format("DELETE FROM %s WHERE cinema_name = '%s'", table_name, name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table deleted");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void delte_row_by_id(Connection conn , String table_name, int id ){
        Statement statement;
        try{
            String query = String.format("DELETE FROM %s WHERE movie = '%s'", table_name, id);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table deleted");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void delete_table(Connection conn, String table_name) {
        Statement statement;
        try{
            String query = String.format("DELETE FROM %s", table_name);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table deleted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
