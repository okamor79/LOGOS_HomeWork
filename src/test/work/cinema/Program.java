package test.work.cinema;

import test.work.cinema.films.Films;

public class Program {
    public static void main(String[] args) throws Exception {

        Films f = new Films();
        try {
            f.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
