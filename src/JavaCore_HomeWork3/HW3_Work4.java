package JavaCore_HomeWork3;

import java.util.Random;

public class HW3_Work4 {
    public static void main(String[] args) {
        int[] myArray = new int[8];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(9) + 1;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        arrReplaceElement(myArray);
    }

    static void arrReplaceElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) arr[i] = 0;
            System.out.print(arr[i] + " ");
        }

    }

}
