package JavaCore_HomeWork15;

import java.util.*;

public class ZooClub {

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
        System.out.println("9 - Вивести на екран зооклуб");
        System.out.println("0 - Вийти з програми");
        System.out.println("=====================================================");
        System.out.printf("Оберіть дію:  ");
    }

    public void addNewPerson() {
        System.out.printf("Введіть ім'я нового учасника ");
        String personName = sc.next();
        if(zooClub.containsKey(new Person(personName))){
            System.out.println("Такий учасник вже існує");
        } else {
            zooClub.put(new Person(personName), new ArrayList<>());
        }
    }

    public void addNewPetsToPerson() {
        System.out.printf("Введіть ім'я учасника клубу  ");
        String personName = sc.next();
        System.out.println();
        if(zooClub.containsKey(new Person(personName))) {
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


}
