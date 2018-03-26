package home.work.arrays;

import java.util.Random;

public class HW3_Work3 {
    public static void main(String[] args) {
            int[] myArray = new int[15];
        createArray(myArray);
        printArray(myArray);
    }

    static void createArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(9);
        }
    }

    static void printArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) count++;
        }
        System.out.println();
        System.out.print(count);

    }
}
