package logos.jcore.test.cinema;

import java.util.Scanner;

public class Admin {

    public static void adminPanel() throws Exception {
        while (true) {
            Menu.adminMenu();
            switch (new Scanner(System.in).next()) {
                case "1":
                    Movie m = new Movie();
                    m.movieAdminPanel();
                    break;
                case "2":
                    Hall h = new Hall();
                    h.hallAdminPanel();
                    break;
                case "3":
                    Shedule s = new Shedule();
                    s.sheduleAdminPanel();
                    break;
                case "0":
                    return;
            }
        }


    }
}
