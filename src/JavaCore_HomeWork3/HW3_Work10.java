package JavaCore_HomeWork3;

import java.util.Random;

public class HW3_Work10 {
    public static void main(String[] args) {

        int[] myArray = new int[11];
        createArray(myArray);
        System.out.println();
        countEqueElements(myArray);
    }

    static void createArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(3) - 1;
            System.out.print(arr[i] + " ");
        }
    }

    static void countEqueElements(int[] arr) {
        int count_neg_1 = 0, count_0 = 0, count_pos_1 = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case -1: {
                    count_neg_1 += 1;
                    break;
                }
                case 0: {
                    count_0 += 1;
                    break;
                }
                case 1: {
                    count_pos_1 += 1;
                    break;
                }
            }
        }
        System.out.println(count_neg_1 + " " + count_0 + " " + count_pos_1);
    }

}
