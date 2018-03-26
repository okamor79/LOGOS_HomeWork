package home.work.lists;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static LinkedHashSet<User> user = new LinkedHashSet<>();

    public static void main(String[] args) {
        user.add(new User("Vasyl", "vasa", rnd.nextInt(25) + 20));
        user.add(new User("Oleg", "kuka", rnd.nextInt(25) + 20));
        user.add(new User("Zakhar", "dozik", rnd.nextInt(25) + 20));
        user.add(new User("Igor", "tsar", rnd.nextInt(25) + 20));
        user.add(new User("Serg", "grom", rnd.nextInt(25) + 20));
        user.add(new User("Alex", "kipish", rnd.nextInt(25) + 20));
        user.add(new User("Vetal", "hurben", rnd.nextInt(25) + 20));
        user.add(new User("Roman", "datel", rnd.nextInt(25) + 20));
        user.add(new User("Maxim", "vasa1", rnd.nextInt(25) + 20));
        user.add(new User("Vadim", "vasa2", rnd.nextInt(25) + 20));
        user.add(new User("Taras", "vasa3", rnd.nextInt(25) + 20));

        while (true) {
            printMenu();
            String choise = sc.next();
            switch (choise) {
                case "1":
                    System.out.print("Enter user username to delete: ");
                    String name = sc.next();
                    removeByUsername(name);
                    break;
                case "2":
                    System.out.print("Enter user nickname to delete: ");
                    String nickname = sc.next();
                    removeByNickname(nickname);
                    break;
                case "3":
                    System.out.print("Enter user username to search: ");
                    String searchName = sc.next();
                    searchByName(searchName);
                    break;
                case "4":
                    System.out.print("Enter user nickname to search: ");
                    String nickName = sc.next();
                    searchByNickname(nickName);
                    break;
                case "5":
                    System.out.print("Enter age for search user: ");
                    int age = sc.nextInt();
                    searchByAge(age);
                    break;
                case "9":
                    printList();
                    break;
                case "0":
                    return;
            }
        }
    }

    public static void searchByAge(int age) {
        Iterator<User> iter = user.iterator();
        while (iter.hasNext()) {
            User u = iter.next();
            if (u.getAge() == age) {
                System.out.println(u.toString());
            }
        }

    }

    public static void searchByName(String name) {
        Iterator<User> iter = user.iterator();
        while (iter.hasNext()) {
            User u = iter.next();
            if (u.getUsername().equalsIgnoreCase(name)) {
                System.out.println(u.toString());
            }
        }
    }

    public static void searchByNickname(String name) {
        Iterator<User> iter = user.iterator();
        while (iter.hasNext()) {
            User u = iter.next();
            if (u.getNickname().equalsIgnoreCase(name)) {
                System.out.println(u.toString());
            }
        }
    }


    public static void removeByUsername(String name) {
        Iterator<User> iter = user.iterator();
        while (iter.hasNext()) {
            User u = iter.next();
            if (u.getUsername().equalsIgnoreCase(name)) {
                iter.remove();
            }
        }
    }

    public static void removeByNickname(String name) {
        Iterator<User> iter = user.iterator();
        while (iter.hasNext()) {
            User u = iter.next();
            if (u.getNickname().equalsIgnoreCase(name)) {
                iter.remove();
            }
        }
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("1 - Delete element by username");
        System.out.println("2 - Delete element by nickaname");
        System.out.println("3 - Find by username");
        System.out.println("4 - Find by nickname");
        System.out.println("5 - Find by age");
        System.out.println("9 - Print List");
        System.out.println("0 - Exit");
        System.out.println("=====================================");
        System.out.print("Enter your choise:");

    }

    public static void printList() {
        Iterator<User> iter = user.iterator();
        while (iter.hasNext()) {
            User u = iter.next();
            System.out.println(u);
        }
    }

}
