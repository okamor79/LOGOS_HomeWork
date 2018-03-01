package JavaCore_HomeWork12;

import java.util.*;

public class Main {

    static List<Student> univer = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            printMenu();

            String choise = sc.next();
            switch (choise) {
                case "1":
                    addNewStudent();
                    break;
                case "2":
                    printList();
                    System.out.println("Введіть індекс студента на видалення");
                    int index = sc.nextInt();
                    removeStudentByIndex(index);
                    break;
                case "3":
                    printList();
                    System.out.println("Введіть прізвище студента на видалення");
                    String name = sc.next();
                    removeStudentByName(name);
                    printList();
                    break;
                case "9":
                    printList();
                    break;
                case "0":
                    return;
            }
        }

    }

    public static void printList() {

        if (!univer.isEmpty()) {
            ListIterator i = univer.listIterator(univer.size());
            univer.forEach(System.out::println);
        } else {
            System.out.println("Список пустий");
            System.out.println();
            return;
        }

//        if (!univer.iterator().hasNext()) {
//        } else {
//            for (ListIterator i = univer.listIterator(); i.hasNext(); ) {
//                System.out.println(i.nextIndex() + " " + i.next());
//            }
//            System.out.println();
//        }
    }

    public static void addNewStudent() {
        System.out.println("Введіть прізвище ");
        String lastName = sc.next();
        System.out.println("Введіть ім'я ");
        String firstName = sc.next();
        System.out.println("Введіть спеціальність ");
        String group = sc.next();
        System.out.println("Введіть курс ");
        int course = sc.nextInt();
        univer.add(new Student(lastName, firstName, course, group));
        System.out.println("Студента додано");
        System.out.println();
    }

    public static void removeStudentByName(String name) {
        ListIterator<Student> iter = univer.listIterator();
        while (iter.hasNext()) {
            Student s = iter.next();
            if( s.getFirstName().equalsIgnoreCase(name)) {
                iter.remove();
            }
        }
    }

    public static void removeStudentByIndex(int index) {
        ListIterator<Student> i = univer.listIterator();

        while (i.hasNext()) {
            Student s = i.next();
            System.out.println(i.nextIndex());
            if (i.nextIndex() == index) {
                i.remove();
            }

        }
        System.out.println("Студента видалено");
        printList();

    }

    public static void printMenu() {
        System.out.println("Виберіть дію:");
        System.out.println("1 - Додати нового студента");
        System.out.println("2 - Видалити студента по індексу");
        System.out.println("3 - Видалити студента по прізвищу");
        System.out.println("9 - Друк списку");
        System.out.println("0 - Вихід");
    }


}
