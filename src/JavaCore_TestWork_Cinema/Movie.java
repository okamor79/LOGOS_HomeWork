package JavaCore_TestWork_Cinema;

import java.io.*;
import java.util.*;

public class Movie {

    private String movieName;
    private int yearMovie;

    private List<Movie> movie;

    public Movie() {
        movie = new ArrayList<>();
    }

    public Movie(String movieName, int yearMovie) {
        this.movieName = movieName;
        this.yearMovie = yearMovie;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYearMovie() {
        return yearMovie;
    }

    public void setYearMovie(int yearMovie) {
        this.yearMovie = yearMovie;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", yearMovie=" + yearMovie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return yearMovie == movie.yearMovie &&
                Objects.equals(movieName, movie.movieName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieName, yearMovie);
    }

    public String forWrite() {
        return movieName + "->" + yearMovie;
    }

    public void start() throws Exception {
        while (true) {
            menu();
            switch (new Scanner(System.in).next()) {
                case "1":
                    addNewMovie();
                    break;
                case "2":
                    writeToFile();
                    break;
                case "3":
                    loadFromFile();
                    break;
                case "4":
                    removeExist();
                    break;
                case "9":
                    movie.forEach(System.out::println);
                    break;

                case "0":
                    return;
            }
        }

    }

    void menu() {
        System.out.println("================================");
        System.out.println("1. Add new");
        System.out.println("2. Write to File");
        System.out.println("3. Load from file");
        System.out.println("4. Remove exist");
        System.out.println("9. Print list");
        System.out.println("0. Exit previors");
        System.out.println("--------------------------------");
        System.out.printf("Select action: ");
    }

    void addNewMovie() {
        System.out.println("Enter film name");
        String movName = new Scanner(System.in).nextLine();
        System.out.println("Enter film year");
        int movYear = new Scanner(System.in).nextInt();

        if (!movie.contains(movName)) {
            movie.add(new Movie(movName, movYear));
        } else {
            System.out.println("Movie has exist");
        }
    }

    void loadFromFile() throws Exception {
        File f = new File("films.txt");
        if (!f.exists()) {
            System.out.println("File does not exist....");
            return;
        } else {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            try {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    String[] arr = new String[2];
                    int i = 0;
                    for (String temp : readLine.split("->")) {
                        arr[i++] = temp;
                    }
                    movie.add(new Movie(arr[0], Integer.valueOf(arr[1])));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fr.close();
                br.close();
            }
        }

    }

    void writeToFile() throws Exception {
        File f = new File("films.txt");

        FileWriter fw = new FileWriter(f, false);
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            Iterator<Movie> iter = movie.iterator();
            while (iter.hasNext()) {
                Movie a = iter.next();
                fw.write((a.getMovieName() + "->" + a.getYearMovie() + '\n'));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fw.close();
            bw.close();
        }
    }

    void removeExist() throws Exception {
        if (!movie.isEmpty()) {
            movie.forEach(System.out::println);
            System.out.println("---------------------------");
            System.out.printf("Enter name to remove  ");
            String removeItem = new Scanner(System.in).nextLine();
            Iterator<Movie> iter = movie.iterator();
            while (iter.hasNext()){
                if (iter.next().movieName.contains(removeItem)) {
                    iter.remove();
                    System.out.println("Item removed ....");
                }
            }
        } else {
            System.out.println("List is empty...");
            return;
        }

    }
}
