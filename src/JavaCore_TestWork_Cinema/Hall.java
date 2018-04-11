package JavaCore_TestWork_Cinema;

import jdk.jfr.events.FileWriteEvent;

import java.io.*;
import java.util.*;

public class Hall {

    private String nameHall;
    private String addressHall;

    private HashSet<Hall> hall;

    public Hall() {
        hall = new HashSet<>();
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
                case "2": writeToFile(); break;
                case "3": loadFromFile(); break;
                case "9":
                    hall.forEach(System.out::println);
                    break;
                case "0":
                    return;
            }

        }
    }

    void menu() {
        System.out.println("-----------------------");
        System.out.println(" 1. Add new item");
        System.out.println(" 2. Write to File");
        System.out.println(" 3. Load from File");
        System.out.println(" 9. Print list");
        System.out.println(" 0. Exit previors");
        System.out.println("------------------------");
        System.out.printf("  Select action:  ");
    }

    void addNewItem() {
        System.out.printf(" Enter hall name ");
        String hallName = new Scanner(System.in).nextLine();
        System.out.printf(" Enter hall address ");
        String hallAddress = new Scanner(System.in).nextLine();
        if (!hall.contains(hallName)) {
            hall.add(new Hall(hallName, hallAddress));
        } else {
            System.out.println("Hall exist");
        }
    }

    void loadFromFile() throws Exception {
        File f = new File("hall.txt");
        if (!f.exists()) {
            System.out.println("File does not exist");
            return;
        } else {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            try {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    String[] arr = new String[2];
                    int i = 0;
                    for (String tempLine : readLine.split("->")) {
                        arr[i++] = tempLine;
                    }
                    hall.add(new Hall(arr[0], arr[1]));
                }

            } catch (Exception e){
                e.printStackTrace();
            } finally {
                fr.close();
                br.close();
            }
        }
    }

    void writeToFile() throws Exception {
        File f = new File("hall.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            Iterator<Hall> iter = hall.iterator();
            while (iter.hasNext()) {
                Hall h = iter.next();
                fw.write(h.nameHall + "->" + h.addressHall + '\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fw.close();
            bw.close();
        }


    }
}
