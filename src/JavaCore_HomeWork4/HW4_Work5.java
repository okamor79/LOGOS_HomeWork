package JavaCore_HomeWork4;

import java.util.Scanner;

public class HW4_Work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введіть дійсне число A ");
            if (sc.hasNextDouble()) {
                double a = sc.nextDouble();
                while (true) {
                    System.out.print("Введіть дійсне число B ");
                    if (sc.hasNextDouble()) {
                        double b = sc.nextDouble();
                        while (true) {
                            System.out.print("Введіть дійсне число C ");
                            if (sc.hasNextDouble()) {
                                double c = sc.nextDouble();
                                Compare(a,b,c);
                                break;
                            } else {
                                String c = sc.next();
                                System.out.println("Ви ввечели не число або неправильно ввели");
                            }
                        }
                        break;
                    } else {
                        String b = sc.next();
                        System.out.println("Ви ввечели не число або неправильно ввели");
                    }
                }
                break;
            } else {
                String a = sc.next();
                System.out.println("Ви ввечели не число або неправильно ввели");
            }
        }
    }
    static void Compare(double a1, double b1, double c1) {
        if (Math.abs(a1) <= Math.abs(b1) && Math.abs(a1) <= Math.abs(b1)) {
            System.out.println("Мінімальним дійсним числом за модулем є число |A| = " + Math.abs(a1));
        } else if (Math.abs(b1) <= Math.abs(a1) && Math.abs(b1) <= Math.abs(c1)) {
            System.out.println("Мінімальним дійсним числом за модулем є число |B| = " + Math.abs(b1));
        } else {
            System.out.println("Мінімальним дійсним числом за модулем є число |C| = " + Math.abs(c1));
        }
    }
}
