package JavaCore_HomeWork2;

import java.util.Scanner;

public class HW2_Work12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input a number ");
        int number = scan.nextInt();
        for(int i = 2; i <= number/2; i++ ) {
            if(number % i == 0) {
                System.out.println(number + " does not a prime number");
                break;
            }
        }
        System.out.println(number + " it's a prime number");
    }
}
