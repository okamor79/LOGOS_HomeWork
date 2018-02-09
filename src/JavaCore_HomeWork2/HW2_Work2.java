package JavaCore_HomeWork2;

import java.util.Scanner;

public class HW2_Work2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input N: ");
        double n = scan.nextDouble();
        System.out.print("Input M: ");
        double m = scan.nextDouble();

        if (Math.abs(10.0 - n) > Math.abs(10.0 - m)) {
            System.out.println("M " + m);
        } else {
            System.out.println("N " + n);
        }

    }


}
