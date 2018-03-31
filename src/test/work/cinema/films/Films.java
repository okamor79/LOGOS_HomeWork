package test.work.cinema.films;

import test.work.cinema.exception.ValidationMessages;

import java.io.*;
import java.util.*;

public class Films implements Serializable {

    private static final long serialVersionUID = 9215461736277877885L;

    transient Scanner sc = new Scanner(System.in);
    transient Random rnd = new Random();

    private int id;
    private String nameFilm;            // Назва фільму
    private String genreFilm;           // Жанр фільму
    private int timeFilmLength;         // Тривалість фільму в хвилинах
    private int yearFilmProduction;     // Рік виходу в прокат

    private List<Films> film = new ArrayList<>();

    public Films() {

    }

    public Films(String nameFilm, String genreFilm, int timeFilmLength, int yearFilmProduction) {
        this.id = rnd.nextInt(1) + rnd.nextInt(10) + rnd.nextInt(100) + rnd.nextInt(10000) - 1;
        this.nameFilm = nameFilm;
        this.genreFilm = genreFilm;
        this.timeFilmLength = timeFilmLength;
        this.yearFilmProduction = yearFilmProduction;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public int getTimeFilmLength() {
        return timeFilmLength;
    }

    public int getYearFilmProduction() {
        return yearFilmProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Films films = (Films) o;
        return timeFilmLength == films.timeFilmLength &&
                yearFilmProduction == films.yearFilmProduction &&
                Objects.equals(nameFilm, films.nameFilm) &&
                Objects.equals(genreFilm, films.genreFilm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFilm, genreFilm, timeFilmLength, yearFilmProduction);
    }

    @Override
    public String toString() {
        return id + "   \"" + nameFilm + '\"' +
                "  Genre: " + genreFilm +
                "  Time Length: " + timeFilmLength +
                "  Year Production: " + yearFilmProduction;
    }

    public void start() throws Exception {
        try {
            while (true) {
                System.out.println();
                filmMenuActionPrint();
                switch (sc.next()) {
                    case "1":
                        addNewFilm();
                        break;
                    case "2":
                        removeFilm();
                        break;
                    case "3":
                        exportToStream();
                        break;
                    case "4":
                        importFromStream();
                        break;
                    case "5":
                        if (!film.isEmpty()) {
                            listActualMovie();
                        } else {
                            System.out.println();
                            System.out.println("Base is empty. Please import or input manual..");
                        }

                        break;
                    case "0":
                        return;
                }
            }
        } catch (InputMismatchException e) {
            System.err.printf(ValidationMessages.INPUT_MISMATCH);
        }
    }

    void filmMenuActionPrint() {
        System.out.println("=============================================");
        System.out.println("====   Film action menu (admin option)   ====");
        System.out.println("=============================================");
        System.out.println("1 - Add the movie to the base");
        System.out.println("2 - Remove movie from Database");
        System.out.println("3 - Export the movie database");
        System.out.println("4 - Import movie base");
        System.out.println("5 - Print movie list ");
        System.out.println("0 - Exit previous menu");
        System.out.println("=============================================");
        System.out.printf("Choose action: ");
    }

    void addNewFilm() throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.printf("Plase enter a new film name: ");
        String newFilmName = s.nextLine();
        System.out.printf("Plase enter a new film genre: ");
        String newFilmGenre = s.nextLine();
        System.out.printf("Plase enter a new film time length: ");
        int newFilmTimeLength = s.nextInt();
        System.out.printf("Plase enter a new film year production: ");
        int newFilmYearProduction = s.nextInt();
        film.add(new Films(newFilmName, newFilmGenre, newFilmTimeLength, newFilmYearProduction));
        s.close();
    }

    void removeFilm() throws Exception {
        if (!film.isEmpty()) {
            listActualMovie();
            Scanner s = new Scanner(System.in);
            System.out.printf("Enter movie id to delete ");
            int idDelete = s.nextInt();
            Iterator<Films> iter = film.iterator();
            while (iter.hasNext()) {
                if (iter.next().id == idDelete) {
                    iter.remove();
                }
            }
        } else {
            System.out.println();
            System.out.println("Base is empty. Please import or input manual..");
        }
    }

    void exportToStream() throws Exception {
        FileOutputStream fos = new FileOutputStream("films.database");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(film);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fos.close();
            oos.close();
        }
    }

    void importFromStream() throws Exception {
        FileInputStream fis = new FileInputStream("films.database");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            film = (ArrayList<Films>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fis.close();
            ois.close();
        }
    }

    void listActualMovie() {
        System.out.println();
        System.out.println("Actual list movie in database");
        System.out.println("---------------------------------------------");
        film.forEach(System.out::println);
        System.out.println("---------------------------------------------");
    }


}
