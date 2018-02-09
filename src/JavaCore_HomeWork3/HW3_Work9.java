package JavaCore_HomeWork3;

import java.util.Random;

public class HW3_Work9 {
    public static void main(String[] args) {

        int[] arrA = new int[10];
        int[] arrB = new int[10];
        double[] arrC = new double[10];

        System.out.print("Array A - ");
        createArray(arrA);
        System.out.println();
        System.out.print("Array B - ");
        createArray(arrB);
        System.out.println();
        System.out.print("Count Integer number in Array C - " + createArray(arrC, arrA, arrB));

    }

    static void createArray(int[] arr) {
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(8) + 1;
            System.out.print(arr[i] + " ");
        }
    }

    static int createArray(double[] arr, int[] arr_A, int[] arr_B) {
        System.out.print("Array C - ");
        int countInt = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (double) arr_A[i] / arr_B[i];
            if (arr[i] == Math.round(arr[i])) {
                countInt += 1;
            }
            System.out.printf("%.2f", arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        return countInt;
    }

}
