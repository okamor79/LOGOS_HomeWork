package JavaCore_HomeWork2;

import java.util.Scanner;

public class HW2_Work1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input Number");
        int number = scan.nextInt();

        if ((number % 2) == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
