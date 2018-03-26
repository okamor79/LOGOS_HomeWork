package home.work.arrays;

import java.util.Random;

public class HW3_Work8 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] myArray = new int[12];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(30) - 15;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        findMaxElement(myArray);
    }

    static void findMaxElement(int[] arr) {
        int maxEl = -16, maxInd = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] >= maxEl) {
                maxEl = arr[i];
                maxInd = i;
            }
        }
        System.out.println("Max Element is " + maxEl + " last him index " + maxInd);
    }

}
