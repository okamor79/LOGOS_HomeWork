package JavaCore_HomeWork5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle(25, 10);
        System.out.println("Площа прямокутника = " + rect.resSquare());
        System.out.println("Перимерт прямокутника = " + rect.resPerimeter());
        System.out.println();
        rect.setHeight(25);
        rect.setWidth(4);
        System.out.println("Площа прямокутника = " + rect.resSquare());
        System.out.println("Перимерт прямокутника = " + rect.resPerimeter());

    }
}
