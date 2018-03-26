package home.work.arrays;

import java.util.Random;

public class HW3_Work6 {
    public static void main(String[] args) {
        int[] myArray = new int[4];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(89) + 10;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("The Array increase is: " + inCrease(myArray));
    }

    static boolean inCrease(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
