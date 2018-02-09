package JavaCore_HomeWork2;

import java.util.Scanner;

public class HW2_Work10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input N:");
        int n = scan.nextInt();
        long factorial = 0;

        for(int i = 0; i<=n;i++) {
            if(i==0) {
                factorial = 1;
            } else {
                factorial = factorial * i;
            }
        }
        System.out.println("Factorial " + n + "! = " + factorial);
    }
}
