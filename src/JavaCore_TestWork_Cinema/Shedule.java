package JavaCore_TestWork_Cinema;

import java.time.*;
import java.util.*;

public class Shedule {

    private LocalDate date;
    private LocalTime time;

    private HashSet<Shedule> shedule;

    public Shedule(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public Shedule() {
        shedule = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shedule shedule1 = (Shedule) o;
        return Objects.equals(date, shedule1.date) &&
                Objects.equals(time, shedule1.time) &&
                Objects.equals(shedule, shedule1.shedule);
    }

    @Override
    public int hashCode() {

        return Objects.hash(date, time, shedule);
    }

    void start() {

    }




}
