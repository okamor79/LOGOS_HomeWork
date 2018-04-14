package logos.jcore.test.cinema;

public abstract class Menu {

    public static void menu(String str){
        System.out.println("-------------------------------------");
        System.out.println(" 1. Add new " + str);
        System.out.println(" 2. Delete exist " + str);
        System.out.println(" 3. Show " + str +" list to screen");
        System.out.println(" 0. Go back");
        System.out.println("-------------------------------------");
        System.out.printf(" Select action:  ");
    }

    public static void adminMenu() {
        System.out.println("-------------------------------------");
        System.out.println(" 1. Admin movie base");
        System.out.println(" 2. Admin hall base");
        System.out.println(" 3. Admin shedule base");
        System.out.println(" 4. Admin session base");
        System.out.println(" 0. Go back");
        System.out.println("-------------------------------------");
        System.out.printf(" Select action:  ");
    }
}
