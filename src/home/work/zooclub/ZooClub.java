package home.work.zooclub;

import java.io.*;
import java.util.*;

public class ZooClub implements Serializable {

    private static final long serialVersionUID = 3000862590929626649L;
    private Map<Person, List<Pets>> zooClub;

    private static Scanner sc = new Scanner(System.in);

    public ZooClub() {
        zooClub = new HashMap<>();
    }

    public void Start() throws Exception {
        while (true) {
            printMenu();
            switch (sc.next()) {
                case "1":
                    addNewPerson();
                    break;
                case "2":
                    addNewPetsToPerson();
                    break;
                case "3":
                    removePetFromPerson();
                    break;
                case "4":
                    removePerson();
                    break;
                case "5":
                    removePets();
                    break;
                case "6":
                    fileStreamMenu();
                    break;
                case "9":
                    System.out.println(zooClub.toString());
                    break;
                case "0":
                    return;
            }
        }
    }

    public void printMenu() {
        System.out.println("=====================================================");
        System.out.println("1 - Додати учасника клубу");
        System.out.println("2 - Додати тваринку до учасника клубу");
        System.out.println("3 - Видалити тваринку з учасника клубу");
        System.out.println("4 - Видалити учасника клубу");
        System.out.println("5 - Видалити конкретну тваринку зі всіх власників");
        System.out.println("6 - Завантажити/збереги файл");
        System.out.println("9 - Вивести на екран зооклуб");
        System.out.println("0 - Вийти з програми");
        System.out.println("=====================================================");
        System.out.printf("Оберіть дію:  ");
    }

    public void addNewPerson() {
        System.out.printf("Введіть ім'я нового учасника ");
        String personName = sc.next();
        if (zooClub.containsKey(new Person(personName))) {
            System.out.println("Такий учасник вже існує");
        } else {
            zooClub.put(new Person(personName), new ArrayList<>());
        }
    }

    public void addNewPetsToPerson() {
        System.out.printf("Введіть ім'я учасника клубу  ");
        String personName = sc.next();
        System.out.println();
        if (zooClub.containsKey(new Person(personName))) {
            System.out.printf("Введіть вид тварини  ");
            String petClass = sc.next();
            System.out.printf("Введіть кличку тварини  ");
            String petName = sc.next();
            System.out.printf("Введіть вік тварини  ");
            int petAge = sc.nextInt();
            zooClub.get(new Person(personName)).add(new Pets(petName, petClass, petAge));
        } else {
            System.out.println("Такого учасника в клубі немає.");
        }
    }

    public void removePetFromPerson() {
        System.out.println("Введіть ім'я учасника клубу  ");
        Person p = new Person(sc.next());
        if (zooClub.containsKey(p)) {
            Set<Pets> pet = new HashSet<>();
            pet.addAll(zooClub.get(p));
            System.out.println("Перелік тврин учасника клубу - " + p.getPersonName());
            pet.forEach(System.out::println);
            System.out.println();
            System.out.printf("Введіть вид тварини для видалення  ");
            String petClass = sc.next();
            System.out.printf("Введіть кличку тварини для видалення  ");
            String petName = sc.next();
            Iterator<Map.Entry<Person, List<Pets>>> iter = zooClub.entrySet().iterator();
            while (iter.hasNext()) {

                Map.Entry<Person, List<Pets>> i = iter.next();
                Iterator<Pets> listIter = i.getValue().iterator();
                while (listIter.hasNext()) {
                    Pets pets = listIter.next();
                    if (pets.getPetsClass().equalsIgnoreCase(petClass) && pets.getPetsName().equalsIgnoreCase(petName)) {
                        listIter.remove();
                    }
                }
            }
        } else {
            System.out.println("Такого учасника в клубі немає.");
        }
    }

    public void removePerson() {
        System.out.println("Введіть ім'я учасника для видалення ");
        Person p = new Person(sc.next());
        if (zooClub.containsKey(p)) {
            zooClub.remove(p);
        } else {
            System.out.println("Такого учасника в клубі не має");
        }
    }

    public void fileStreamMenu() throws Exception {
        while (true) {
            System.out.println();
            System.out.println("1 - Дописати в блокнот");
            System.out.println("2 - Перезаписати в блокнот");
            System.out.println("3 - Зчитати з блонкону і вивести");
            System.out.println("4 - Провести серіалізацію");
            System.out.println("5 - Провести десеріалізацію");
            System.out.println("0 - Повернутись в попереднє меню");
            System.out.println("=====================================================");
            System.out.printf("Оберіть дію:  ");
            switch (sc.next()) {
                case "1":
                    outZooClubToFile(true);
                    break;
                case "2":
                    outZooClubToFile(false);
                    break;
                case "3":
                    importFromFile();
                    break;
                case "4":
                    exportFileStream();
                    break;
                case "5":
                    importFileStream();
                    break;
                case "0":
                    return;
            }
        }
    }

    public void removePets() {
        System.out.println("Введіть тип тварини для видалення з клубу  ");
        String petClass = sc.next();
        Iterator<Map.Entry<Person, List<Pets>>> iter = zooClub.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Person, List<Pets>> i = iter.next();
            Iterator<Pets> p = i.getValue().iterator();
            while (p.hasNext()) {
                Pets pets = p.next();
                if (pets.getPetsClass().equalsIgnoreCase(petClass)) {
                    p.remove();
                }
            }
        }
    }

    /*
     *  Export ZooClub Map to Stream
     * */
    public void exportFileStream() throws Exception {
        FileOutputStream fos = new FileOutputStream("zooClub.stream.backup");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(zooClub);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fos.close();
            oos.close();
        }
    }

    /*
     *  Import ZooClub Map from Stream
     * */
    public void importFileStream() throws Exception {
        FileInputStream fis = new FileInputStream("zooClub.stream.backup");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            zooClub = (HashMap) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(zooClub);
            fis.close();
            ois.close();
        }
    }

    /*
     * Export our Map to text file  in format:  Person=>PetClass->PetName->PetAge
     * Input Parametr is boolean flag: true - Append file open; false - Rewrite file open
     * */
    public void outZooClubToFile(boolean b) throws Exception {
        FileWriter fw = new FileWriter("zooClub.backup", b);
        try {
            Iterator<Map.Entry<Person, List<Pets>>> i = zooClub.entrySet().iterator();
            while (i.hasNext()) {
                Map.Entry<Person, List<Pets>> m = i.next();
                String outPerson = String.valueOf(m.getKey().forWrite());
                Iterator<Pets> iterPets = m.getValue().iterator();
                while (iterPets.hasNext()) {
                    String outPets = String.valueOf(iterPets.next().forWrite());
                    fw.write(outPerson + outPets);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fw.close();
        }
    }

    /*
     * Read file and generate persons and there pets of ZooClub
     * */
    public void importFromFile() throws Exception {
        FileReader fr = new FileReader("zooClub.backup");
        BufferedReader br = new BufferedReader(fr);
        try {
            String readLine;
            Person p = null;
            while ((readLine = br.readLine()) != null) {
                for (String pars : readLine.split("=>")) {
                    if (!pars.contains("->") && pars != null) {
                        if (!zooClub.containsKey(new Person(pars))) {
                            p = new Person(pars);
                            zooClub.put(p, new ArrayList<>());
                        } else {
                            p = new Person(pars);
                        }
                    } else {
                        String[] petElement = new String[3];
                        int i = 0;
                        for (String parsPet : pars.split("->")) {
                            petElement[i++] = parsPet;
                        }
                        zooClub.get(p).add(new Pets(petElement[1], petElement[0], Integer.parseInt(petElement[2])));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fr.close();
            br.close();
        }
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "zooClub=" + zooClub +
                '}';
    }
}
