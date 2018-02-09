package JavaCore_HomeWork2;

import java.util.Scanner;

public class HW2_Work15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input number ");
        int number = scan.nextInt();
        int sum = 0;

        while(number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        System.out.println("Sum of digits " + sum);


    }
}
