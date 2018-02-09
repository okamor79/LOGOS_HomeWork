package JavaCore;

import java.util.Scanner;

public class HW4_Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введіть ціле число ");
            if(sc.hasNextInt()) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    System.out.println("Введене число є парним");
                }  else {
                    System.out.println("Введене число є не парним");
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
