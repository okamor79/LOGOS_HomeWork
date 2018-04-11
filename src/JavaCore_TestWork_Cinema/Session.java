package JavaCore_TestWork_Cinema;

import java.util.*;

public class Session extends BasicClass {

    private Map<Hall, Map<Movie, List<Shedule>>> session;

    public Session() {
        session = new HashMap<>();
    }


    public void start() {
        while (true) {
            menu();
            switch (sc.next()) {
                case "1": createSession(); break;
                case "0": return;
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

    void createSession() {

    }
}
