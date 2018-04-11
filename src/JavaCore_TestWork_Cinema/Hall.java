package JavaCore_TestWork_Cinema;

import java.util.*;

public class Hall {

    private String nameHall;
    private String addressHall;

    private List<Hall> hall;

    public Hall() {
        hall = new ArrayList<>();
    }

    public Hall(String nameHall, String addressHall) {
        this.nameHall = nameHall;
        this.addressHall = addressHall;
    }

    public String getNameHall() {
        return nameHall;
    }

    public String getAddressHall() {
        return addressHall;
    }

    @Override
    public String toString() {
        return nameHall + "    " + addressHall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hall hall = (Hall) o;
        return Objects.equals(nameHall, hall.nameHall) &&
                Objects.equals(addressHall, hall.addressHall);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameHall, addressHall);
    }

    public void start() throws Exception {
        while (true) {
            menu();
            switch (new Scanner(System.in).next()) {
                case "1":
                    addNewItem();
                    break;
                case "0":
                    return;
            }

        }
    }

    void menu() {
        System.out.println("-----------------------");
        System.out.println(" 1. Add new item");
        System.out.println(" 0. Exit previors");
        System.out.println("------------------------");
        System.out.printf("  Select action:  ");
    }

    void addNewItem() {
        System.out.printf(" Enter hall name ");
        String

    }
}
