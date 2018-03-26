package home.work.scanner;

import java.util.Scanner;

public class HW4_Work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введіть ціле число A  ");
            if(sc.hasNextInt()) {
                int a = sc.nextInt();
                while (true) {
                    System.out.print("Введіть ціле число B  ");
                    if(sc.hasNextInt()) {
                        int b = sc.nextInt();
                        System.out.println("A + B = " + (int)(a + b));
                        break;
                    } else {
                        String b = sc.next();
                        System.out.println("Введено не ціле число, повторіть ввід");
                        System.out.println();
                    }
                }
                break;
            } else {
                String a = sc.next();
                System.out.println("Введено не ціле число, повторіть ввід");
                System.out.println();
            }
        }

    }
}
