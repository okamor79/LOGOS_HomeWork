package JavaCore_HomeWork14;

import java.util.*;

public class Main {


    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static Set<Commodity> set = new TreeSet<>();

    public static void main(String[] args) {



        while(true){
            printMenu();
            System.out.print("Зробіть ваш вибір:  ");
            String choise = sc.next();
            switch(choise) {
                case "1":
                    addNewCommodity();
                    break;
                case "2":
                    removeCommodityByCode();
                    break;
                case "9" :
                    printList();
                    break;
                case "0":
                    return;
            }
        }
    }

    public static void printList(){
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
        set.add(new Commodity(id,title,code,price));
    }

    public static void removeCommodityByCode() {
        System.out.printf("Введіть код товару на видалення ");
        String s = sc.next();
        Iterator<Commodity> iter = set.iterator();
        while(iter.hasNext()){
            Commodity c = iter.next();
            if (c.getCode().equalsIgnoreCase(s)) {
                iter.remove();
            }

        }
    }

}
