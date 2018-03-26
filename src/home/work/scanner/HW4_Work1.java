package home.work.scanner;

import java.util.Random;

public class HW4_Work1 {
    public static void main(String[] args) {
        int[][] arr = new int[8][5];

        Random random = new Random();

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = random.nextInt(89) + 10;
            }
        }

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
