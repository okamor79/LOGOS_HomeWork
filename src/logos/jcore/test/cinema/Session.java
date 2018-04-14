package logos.jcore.test.cinema;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Session implements Serializable {

    transient static final String FILE_NAME = "session.db";

    private static final long serialVersionUID = 950020542350647303L;

    private Movie movie;
    private Hall hall;

    private HashSet<Movie> movies;
    private HashSet<Hall> halls;

    public Session(Movie movie, Hall hall) {
        this.movie = movie;
        this.hall = hall;
    }

    public Session() throws Exception {
        movies = new HashSet<>();
        halls = new HashSet<>();
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return Objects.equals(movie, session.movie) &&
                Objects.equals(hall, session.hall);
    }

    @Override
    public int hashCode() {

        return Objects.hash(movie, hall);
    }

    @Override
    public String toString() {
        return "Session{" +
                "movie=" + movie +
                ", hall=" + hall +
                '}';
    }

    public void adminSessionPanel() throws Exception {
        while (true) {
            Menu.menu("session");
            switch (new Scanner(System.in).next()) {
                case "1":
                    addNewSession();
                    break;
                case "0":
                    return;
            }
        }

    }

    void addNewSession() throws Exception {
        movies = (HashSet<Movie>) Methods.loadFromFile(Movie.FILE_NAME);
        if (!movies.isEmpty()) {
            movies.forEach(System.out::println);
            System.out.printf("Select and enter movie name ");
            String movieName = new Scanner(System.in).nextLine();
            Iterator<Movie> iterMovie = movies.iterator();
            while (iterMovie.hasNext()) {
                if (iterMovie.next().getName().equalsIgnoreCase(movieName)) {
                    System.err.println("asdfadsf");
                }
            }
        } else {
            System.out.println("Not films ");
        }
    }
}
