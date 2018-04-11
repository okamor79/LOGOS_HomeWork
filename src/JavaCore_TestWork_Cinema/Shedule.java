package JavaCore_TestWork_Cinema;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Shedule {


    public final static DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public final static DateTimeFormatter timeFormat = DateTimeFormatter.ISO_LOCAL_TIME;

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
                Objects.equals(time, shedule1.time);
    }

    @Override
    public String toString() {
        return date + "    " + time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, time);
    }

    void start() throws Exception {
        while (true) {
            menu();
            switch (new Scanner(System.in).next()) {
                case "1":
                    addNewItem();
                    break;
                case "2":
                    writeToFile();
                    break;
                case "3":
                    loadFromFile();
                    break;
                case "9":
                    shedule.forEach(System.out::println);
                    break;
                case "0":
                    return;
            }
        }
    }

    void menu() {
        System.out.println("================================");
        System.out.println("1. Add new");
        System.out.println("2. Write to File");
        System.out.println("3. Load from file");
        System.out.println("9. Print list");
        System.out.println("0. Exit previors");
        System.out.println("--------------------------------");
        System.out.printf("Select action: ");
    }

    void addNewItem() {
        System.out.printf("Enter new Date  ");
        String newDate = new Scanner(System.in).next();
        System.out.printf("Enter new Time  ");
        String newTime = new Scanner(System.in).next();
        if (Validator.validDate(newDate) && Validator.validTime(newTime)) {
            shedule.add(new Shedule(LocalDate.parse(newDate, dataFormat), LocalTime.parse(newTime, timeFormat)));
        } else {
            System.out.println("Not valid date or time ....");
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    void loadFromFile() throws Exception {
        File f = new File("shedule.txt");
        if (!f.exists()) {
            System.out.println("File does not exists ...");
            return;
        } else {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            try {
                String readLine;
                while ((readLine = br.readLine()) != null) {
                    String[] arr = new String[2];
                    int i = 0;
                    for (String temp : readLine.split("->")) {
                        arr[i++] = temp;
                    }
                    shedule.add(new Shedule(LocalDate.parse(arr[0], dataFormat), LocalTime.parse(arr[1], timeFormat)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fr.close();
                br.close();
            }
        }
    }

    void writeToFile() throws Exception {
        File f = new File("shedule.txt");

        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            Iterator<Shedule> iter = shedule.iterator();
            while (iter.hasNext()) {
                Shedule s = iter.next();
                fw.write(s.getDate() + "->" + s.getTime() + '\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fw.close();
            bw.close();
        }
    }


}
