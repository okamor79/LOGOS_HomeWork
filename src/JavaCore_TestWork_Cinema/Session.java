package JavaCore_TestWork_Cinema;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Session extends BasicClass {

    private List<Movie> movie = new ArrayList<>();

    private Map<List<Movie>, Map<Hall , List<Shedule>>> session;

    public Session() {
        session = new HashMap<>();
    }


    public void start() throws Exception {
        while (true) {
            menu();
            switch (sc.next()) {
                case "1":
                    createSession();
                    break;
                case "0":
                    return;
            }
        }

    }

    void menu() {
        System.out.println("-----------------------------");
        System.out.println("1. Create new session");
        System.out.println("0. Exit previors");
        System.out.println("-----------------------------");
        System.out.printf(" Select action: ");
    }

    void createSession() throws Exception {
        String valMovie = "";
        importM_S_H();
        System.out.println("\n Movie list");
        movie.forEach(System.out::println);
        System.out.printf(" Select movie id to create session ");
        int movieID = new Scanner(System.in).nextInt();
        Iterator<Movie> iterMovie = movie.iterator();
        while (iterMovie.hasNext()) {
            Movie k = iterMovie.next();
            if (k.getId() == movieID) {
                valMovie = String.valueOf(k.getMovieName());
            }
        }
        System.out.println(valMovie);

    }

    void importM_S_H() throws Exception{
        //import movie
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
                    String[] arr = new String[3];
                    int i = 0;
                    for (String temp : readLine.split("->")) {
                        arr[i++] = temp;
                    }
                    movie.add(new Movie(Integer.valueOf(arr[0]), arr[1], Integer.valueOf(arr[2])));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fr.close();
                br.close();
            }
        }
    }
}
