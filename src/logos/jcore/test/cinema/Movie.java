package logos.jcore.test.cinema;

import java.io.Serializable;
import java.util.*;

public class Movie implements Serializable {


    transient static final String FILE_NAME = "movie.db";

    private static final long serialVersionUID = 950020542350647303L;

    private String name;

    transient private HashSet<Movie> movie;

    public Movie(String name) {
        this.name = name;
    }

    public Movie() {
        movie = new HashSet<>();
    }

    @Override
    public String toString() {
        return "Movie - " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie1 = (Movie) o;
        return Objects.equals(name, movie1.name) &&
                Objects.equals(movie, movie1.movie);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, movie);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void movieAdminPanel() throws Exception {
        while (true) {
            Menu.menu("movie");
            switch (new Scanner(System.in).next()) {
                case "1":
                    addNewMovie();
                    break;
                case "2":
                    removeMovie();
                    break;
                case "3":
                    movie.forEach(System.out::println);
                    break;
                case "0":
                    return;
            }
        }
    }

    void addNewMovie() throws Exception {
        movie = (HashSet<Movie>) Methods.loadFromFile(FILE_NAME);
        System.out.printf(" Enter movie name: ");
        String movieName = new Scanner(System.in).nextLine();
        if (!movie.contains(movieName)) {
            movie.add(new Movie(movieName));
            try {
                Methods.writeToFile(FILE_NAME, movie);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("This movie is exist in list ....");
        }
    }

    void removeMovie() throws Exception {
        movie = (HashSet<Movie>) Methods.loadFromFile(FILE_NAME);
        movie.forEach(System.out::println);
        System.out.printf("Enter movie name to delete: ");
        String nameDel = new Scanner(System.in).nextLine();
        Iterator<Movie> iter = movie.iterator();
        while (iter.hasNext()) {
            Movie m = iter.next();
            if (m.getName().contains(nameDel)) {
                iter.remove();
            }
        }
        Methods.writeToFile(FILE_NAME, movie);
    }
}
