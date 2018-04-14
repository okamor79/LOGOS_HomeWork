package logos.jcore.test.cinema;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Hall implements Serializable {


    private static final long serialVersionUID = 950020542350647303L;
    private String name;

    transient static final String FILE_NAME = "halls.db";
    transient private HashSet<Hall> hall;

    public Hall(String name) {
        this.name = name;
    }

    public Hall() throws Exception {
        hall = new HashSet<>((HashSet<Hall>) Methods.loadFromFile(FILE_NAME));
    }

    @Override
    public String toString() {
        return "Hall - " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hall hall1 = (Hall) o;
        return Objects.equals(name, hall1.name) &&
                Objects.equals(hall, hall1.hall);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, hall);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hallAdminPanel() throws Exception {
        while (true) {
            Menu.menu("hall");
            switch (new Scanner(System.in).next()) {
                case "1":
                    addNewHall();
                    break;
                case "2":
                    removeHall();
                    break;
                case "3":
                    hall.forEach(System.out::println);
                    break;
                case "0":
                    return;
            }
        }
    }

    void addNewHall() throws Exception {
        System.out.printf(" Enter hall name: ");
        String hallName = new Scanner(System.in).nextLine();
        if (!hall.contains(hallName)) {
            hall.add(new Hall(hallName));
            try {
                Methods.writeToFile(FILE_NAME, hall);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("This hall is exist in list ....");
        }
    }

    void removeHall() throws Exception {
        hall.forEach(System.out::println);
        System.out.printf("Enter movie name to delete: ");
        String nameDel = new Scanner(System.in).nextLine();
        Iterator<Hall> iter = hall.iterator();
        while (iter.hasNext()) {
            Hall m = iter.next();
            if (m.getName().contains(nameDel)) {
                iter.remove();
            }
        }
        Methods.writeToFile(FILE_NAME, hall);
    }
}
