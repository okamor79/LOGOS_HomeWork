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

                case "0":
                    return;
            }
        }
    }

    void menu() {
        System.out.println("----------------------");
        System.out.println(" 1. Admin films");
        System.out.println(" 2. Admin Shedule");
        System.out.println(" 0. Exit program");
        System.out.println("----------------------");
        System.out.printf(" Select action:  ");
    }
}
