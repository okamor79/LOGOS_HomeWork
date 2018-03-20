package JavaCore_HomeWork14;

import java.util.*;

public class Main {


    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static Set<Commodity> set = new TreeSet<>();

    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("Зробіть ваш вибір:  ");
            String choise = sc.next();
            switch (choise) {
                case "1":
                    addNewCommodity();
                    break;
                case "2":
                    removeCommodityByCode();
                    break;
                case "3":
                    replaceCommodity();
                    break;
                case "9":
                    List<Commodity> listSort = new ArrayList<>();
                    listSort.addAll(set);
                    System.out.println("1 - Сортувати по коду (зростаючий)");
                    System.out.println("2 - Сортувати по коду (спадаючий)");
                    System.out.println("3 - Сортувати по назві (зростаючий)");
                    System.out.println("4 - Сортувати по назві (спадаючий)");
                    System.out.println("5 - Сортувати за ціною (зростаючий)");
                    System.out.println("6 - Сортувати за ціною (спадаючий)");
                    System.out.println("0 - Повернутись на попереднє меню");
                    String choisePrint = sc.next();
                    switch (choisePrint) {
                        case "1":
                            listSort.sort(new CommoditySortByCode());
                            break;
                        case "2":
                            listSort.sort(new CommoditySortByCode(true));
                            break;
                        case "3":
                            listSort.sort(new CommoditySortByTitle());
                            break;
                        case "4":
                            listSort.sort(new CommoditySortByTitle(true));
                            break;
                        case "5":
                            listSort.sort(new CommoditySortByPrice());
                            break;
                        case "6":
                            listSort.sort(new CommoditySortByPrice(true));
                            break;
                        case "0":
                            break;
                    }
                    listSort.forEach(System.out::println);
                    break;
                case "0":
                    return;
            }
        }
    }

    public static void printList() {
        set.forEach(System.out::println);
    }

    public static void printMenu() {
        System.out.println("Виберіть дію:");
        System.out.println(" 1 - Додати товар");
        System.out.println(" 2 - Видалити товар");
        System.out.println(" 3 - Замінити товар");
        System.out.println(" 9 - Вивести список товарів");
        System.out.println(" 0 - Вихід");
        System.out.println();
    }

    public static void addNewCommodity() {
        System.out.println();
        System.out.println("Введіть товар: ");
        System.out.printf("Введіть ID товару");
        int id = sc.nextInt();
        System.out.printf("Введіть назву товару   ");
        String title = sc.next();
        System.out.printf("Введіть код товару   ");
        String code = sc.next();
        System.out.printf("Введіть вартість товару  ");
        double price = sc.nextDouble();
        set.add(new Commodity(id, title, code, price));
    }

    public static void replaceCommodity() {
        printList();
        System.out.println();
        System.out.printf("Введіть код товару для заміни");
        String codeReplace = sc.next();
        System.out.println("Введіть новий товар: ");
        System.out.printf("Введіть ID товару");
        int id = sc.nextInt();
        System.out.printf("Введіть назву товару   ");
        String title = sc.next();
        System.out.printf("Введіть код товару   ");
        String codeNew = sc.next();
        System.out.printf("Введіть вартість товару  ");
        double price = sc.nextDouble();
        Iterator<Commodity> iter = set.iterator();
        while (iter.hasNext()) {
            Commodity c = iter.next();
            if (c.getCode().equalsIgnoreCase(codeReplace)) {
                c.setId(id);
                c.setTitle(title);
                c.setCode(codeNew);
                c.setPrice(price);
            }
        }
    }

    public static void removeCommodityByCode() {
        System.out.printf("Введіть код товару на видалення ");
        String s = sc.next();
        Iterator<Commodity> iter = set.iterator();
        while (iter.hasNext()) {
            Commodity c = iter.next();
            if (c.getCode().equalsIgnoreCase(s)) {
                iter.remove();
            }
        }
    }
}
