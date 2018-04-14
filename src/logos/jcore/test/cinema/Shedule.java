package logos.jcore.test.cinema;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Shedule implements Serializable {

    transient static final String FILE_NAME = "shedule.db";
    transient static final String DATETIME_FORMAT = "dd.MM.yyyy HH:mm";
    transient static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(DATETIME_FORMAT);

    private static final long serialVersionUID = 950020542350647303L;

    private LocalDateTime dateTime;

    transient private HashSet<Shedule> shedule;

    public Shedule() {
        shedule = new HashSet<>();
    }

    public Shedule(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shedule shedule1 = (Shedule) o;
        return Objects.equals(dateTime, shedule1.dateTime) &&
                Objects.equals(shedule, shedule1.shedule);
    }

    @Override
    public String toString() {
        return dateTime.format(FORMATTER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, shedule);
    }

    public void sheduleAdminPanel() throws Exception {
        shedule = (HashSet<Shedule>) Methods.loadFromFile(FILE_NAME);
        while (true) {
            Menu.menu("shedule");
            switch (new Scanner(System.in).next()) {
                case "1":
                    addNewShwdule();
                    break;
                case "2":
                    removeShedule();
                    break;
                case "3":
                    shedule.forEach(System.out::println);
                    break;
                case "0":
                    return;
            }
        }
    }

    void addNewShwdule() throws Exception {
        shedule = (HashSet<Shedule>) Methods.loadFromFile(FILE_NAME);
        shedule.forEach(System.out::println);
        System.out.printf("Enter date (dd.mm.yyyy)");
        String strDate = new Scanner(System.in).nextLine();
        if (Validator.validDate(strDate)) {
            System.out.printf("Enter time (HH:mm) ");
            String strTime = new Scanner(System.in).nextLine();
            if (Validator.validTime(strTime)) {
                LocalDateTime ldt = LocalDateTime.parse(strDate + " " + strTime, FORMATTER);
                shedule.add(new Shedule(ldt));
                Methods.writeToFile(FILE_NAME, shedule);
            } else {
                System.out.println("Entered time " + strTime + " is incorect time format. Please try again.");
            }
        } else {
            System.out.println("Entered date " + strDate + " is incorect date format. Please try again.");
        }
    }

    void removeShedule() throws Exception {
        shedule = (HashSet<Shedule>) Methods.loadFromFile(FILE_NAME);
        shedule.forEach(System.out::println);
        System.out.printf("Enter date to delete from list (dd.mm.yyyy) ");
        String delDate = new Scanner(System.in).nextLine();
        if (Validator.validDate(delDate)) {
            Iterator<Shedule> iter = shedule.iterator();
            while (iter.hasNext()) {
                Shedule s = iter.next();
                if (s.toString().contains(delDate)) {
                    iter.remove();
                    System.out.println("Shedule item has deleted ");
                }
            }
            Methods.writeToFile(FILE_NAME, shedule);
        } else {
            System.out.println("Entered date " + delDate + " is incorect date format. Please try again.");
        }

    }
}
