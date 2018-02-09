package JavaCore_HomeWork2;

import java.util.Scanner;

public class HW2_Work11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = scan.nextInt();

        for (int i = number; i > 0; i--) {
            if((number % i) == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
