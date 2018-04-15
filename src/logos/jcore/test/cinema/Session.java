package logos.jcore.test.cinema;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.*;

public class Session implements Serializable {

    transient static final String FILE_NAME = "session.db";

    private static final long serialVersionUID = 950020542350647303L;

    private Movie movie;
    private Hall hall;

    private HashSet<Movie> movies;
    private HashSet<Hall> halls;
    private HashSet<Shedule> shedules;

    private Map<Shedule, List<Session>> seans;
    private Session session;

    public Session(Movie movie, Hall hall) {
        this.movie = movie;
        this.hall = hall;
    }

    public Session() throws Exception {

        movies = new HashSet<>((HashSet<Movie>) Methods.loadFromFile(Movie.FILE_NAME));
        halls = new HashSet<>((HashSet<Hall>) Methods.loadFromFile(Hall.FILE_NAME));
        shedules = new HashSet<>((HashSet<Shedule>) Methods.loadFromFile(Shedule.FILE_NAME) );
        seans = new HashMap<>();
        //  seans = new HashMap<>((HashMap<List<Session>, Shedule>) Methods.loadFromFile(FILE_NAME));
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

    public Session getSession() {
        return this.session;
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
        List<Session> session = new ArrayList<>();
        if (!movies.isEmpty() && !halls.isEmpty()) {
            System.out.println("To create a session, you need to select from list's a movie, a hall and a viewing time");
            System.out.println("Movie list");
            movies.forEach(System.out::println);
            System.out.printf("Please select a movie that has entered its name: ");
            String movieName = new Scanner(System.in).nextLine();
            System.out.println();
            System.out.println("Hall list");
            halls.forEach(System.out::println);
            System.out.printf("Please select the hall entered its name: ");
            String hallName = new Scanner(System.in).nextLine();
            Iterator<Movie> iterMovie = movies.iterator();
            while (iterMovie.hasNext()) {
                Movie im =iterMovie.next();
                if (im.getName().equalsIgnoreCase(movieName)) {
                    Iterator<Hall> iterHall = halls.iterator();
                    while (iterHall.hasNext()) {
                        Hall ih =iterHall.next();
                        if (ih.getName().equalsIgnoreCase(hallName)) {
                            session.add(new Session(im, ih));
                        }
                    }
                }
            }
            if (!shedules.isEmpty()) {
                System.out.println("Shedule list");
                shedules.forEach(System.out::println);
                System.out.printf("Select date and time from list to movie shoving");
                String seansDateTime = new Scanner(System.in).nextLine();
                Iterator<Shedule> iterShedule = shedules.iterator();
                while (iterShedule.hasNext()) {
                    Shedule sh = iterShedule.next();
//                    System.out.println(sh.getDateTime().format(Shedule.FORMATTER));
                    if (sh.getDateTime().format(Shedule.FORMATTER).equalsIgnoreCase(seansDateTime)) {
                        System.out.println("kva");
                        seans.put(sh, session);
                    }
                }


//                if (seans.containsKey(session)) {
//                    System.out.println("sdhf");
//                    Iterator<Shedule> iterShedule = shedules.iterator();
//                    while (iterShedule.hasNext()) {
//                        Shedule sh = iterShedule.next();
//                        System.out.println(sh.getDateTime());
//                        //if (sh.getDateTime().format(Shedule.DATETIME_FORMAT)) {}

//                    seans.put(session,)


            }
        }

     //   seans.forEach(System.out::println);

        System.out.println(seans);


//        Map<Shedule, List<Session>> session =


//        if (!movies.isEmpty()) {
//            movies.forEach(System.out::println);
//            System.out.printf("Select and enter movie name ");
//            String movieName = new Scanner(System.in).nextLine();
//            Iterator<Movie> iterMovie = movies.iterator();
//            while (iterMovie.hasNext()) {
//                if (iterMovie.next().getName().equalsIgnoreCase(movieName)) {
//                    System.err.println("asdfadsf");
//                }
//            }
//        } else {
//            System.out.println("Not films ");
//        }
    }
}
