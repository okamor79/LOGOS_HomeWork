package JavaCore_TestWork_Cinema;

import java.util.Scanner;

public class Adminka {
    public Adminka() {

    }

    public void start() throws Exception {
        while (true) {
            menu();
            switch (new Scanner(System.in).next()) {
                case "1":
                    Movie m = new Movie();
                    m.start();
                    break;
                case "2":
                    Shedule sh = new Shedule();
                    sh.start();
                    break;
                case "3":
                    Hall h = new Hall();
                    h.start();
                    break;
                case "4":
                    Session s = new Session();
                    s.start();
                    break;
                case "0":
                    return;
            }
        }
    }

    void menu() {
        System.out.println("----------------------");
        System.out.println(" 1. Admin films");
        System.out.println(" 2. Admin Shedule");
        System.out.println(" 3. Admin Hall");
        System.out.println(" 4. Admin Session");
        System.out.println(" 0. Exit program");
        System.out.println("----------------------");
        System.out.printf(" Select action:  ");
    }
}
