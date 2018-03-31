package test.work.cinema.hall;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Hall implements Serializable {

    transient Scanner sc = new Scanner(System.in);
    transient Random rnd = new Random();

    private int idHall;
    private String nameHall;
    private String addressHall;
    private int capacityHall;

    public Hall() {
    }

    public Hall(String nameHall, String addressHall, int capacityHall) {
        this.idHall = rnd.nextInt(100) - 1;
        this.nameHall = nameHall;
        this.addressHall = addressHall;
        this.capacityHall = capacityHall;
    }

    public void start() {

    }
}
