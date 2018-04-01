package test.work.cinema.hall;

import java.io.Serializable;
import java.util.*;

public class Hall implements Serializable {

    transient Scanner sc = new Scanner(System.in);
    transient Random rnd = new Random();

    private int idHall;
    private String nameHall;
    private String addressHall;
    private int capacityHall;

    private List<Hall> hall = new ArrayList<>();

    public Hall() {
    }

    public Hall(String nameHall, String addressHall, int capacityHall) {
        this.idHall = rnd.nextInt(100) - 1;
        this.nameHall = nameHall;
        this.addressHall = addressHall;
        this.capacityHall = capacityHall;
    }

    public int getIdHall() {
        return idHall;
    }

    public String getNameHall() {
        return nameHall;
    }

    public String getAddressHall() {
        return addressHall;
    }

    public int getCapacityHall() {
        return capacityHall;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "idHall=" + idHall +
                ", nameHall='" + nameHall + '\'' +
                ", addressHall='" + addressHall + '\'' +
                ", capacityHall=" + capacityHall +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hall hall = (Hall) o;
        return idHall == hall.idHall &&
                capacityHall == hall.capacityHall &&
                Objects.equals(nameHall, hall.nameHall) &&
                Objects.equals(addressHall, hall.addressHall);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idHall, nameHall, addressHall, capacityHall);
    }

    public void start() {

    }
}
