package JavaCore_HomeWork3;

import java.util.Random;

public class HW3_Work5 {
    public static void main(String[] args) {
        int[] arrA = new int[5];
        int[] arrB = new int[5];

        createArray(arrA);
        System.out.println();
        createArray(arrB);
        System.out.println();

        if (avgArr(arrA) > avgArr(arrB)) {
            System.out.println("Середнє арифметине масиву А більше ніж масиву В ");
        } else if (avgArr(arrA) < avgArr(arrB)) {
            System.out.println("Середнє арифметине масиву B більше ніж масиву A ");
        } else {
            System.out.println("Середнє арифметине масиву A та масиву В рівні ");
        }

    }

    static void createArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5);
            System.out.print(arr[i] + " ");
        }
    }

    static double avgArr(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (double) (sum + arr[i]);
        }
        return sum / arr.length;
    }
}
