package JavaCore_HomeWork2;

import java.util.Scanner;

public class HW2_Work3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scan.nextDouble();
        System.out.println("Input b: ");
        double b = scan.nextDouble();
        System.out.println("Input c: ");
        double c = scan.nextDouble();

        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }

}
