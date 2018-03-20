package JavaCore_HomeWork15;

import java.io.Serializable;
import java.util.*;

public class ZooClub implements Serializable {

    private static final long serialVersionUID = 3000862590929626649L;
    private Map<Person, List<Pets>> zooClub;

    private static Scanner sc = new Scanner(System.in);

    public ZooClub() {
        zooClub = new HashMap<>();
    }

    public void Start() {
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
                    System.out.println(zooClub);
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
            while(iter.hasNext()){

                Map.Entry<Person, List<Pets>> i = iter.next();
                Iterator<Pets> listIter = i.getValue().iterator();
                while(listIter.hasNext()) {
                    Pets pets = listIter.next();
                    if(pets.getPetsClass().equalsIgnoreCase(petClass) && pets.getPetsName().equalsIgnoreCase(petName)) {
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

    public void fileStreamMenu(){
        while(true){
            System.out.println();
            System.out.println("1 - Дописати в блокнот");
            System.out.println("2 - Перезаписати в блокнот");
            System.out.println("3 - Зчитати з блонкону і вивести");
            System.out.println("4 - Провести серіалізацію");
            System.out.println("5 - Провести десеріалізацію");
            System.out.println("0 - Повернутись в попереднє меню");
            System.out.println("=====================================================");
            System.out.printf("Оберіть дію:  ");
            switch(sc.next()) {
                case "0": return;
            }
        }
//        System.out.println("sfsf");
    }

    public void removePets() {
        System.out.println("Введіть тип тварини для видалення з клубу  ");
        String petClass = sc.next();
        Iterator<Map.Entry<Person, List<Pets>>> iter = zooClub.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<Person, List<Pets>> i = iter.next();
            Iterator<Pets> p = i.getValue().iterator();
            while(p.hasNext()) {
                Pets pets = p.next();
                if (pets.getPetsClass().equalsIgnoreCase(petClass)) {
                    p.remove();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "zooClub=" + zooClub +
                '}';
    }
}
