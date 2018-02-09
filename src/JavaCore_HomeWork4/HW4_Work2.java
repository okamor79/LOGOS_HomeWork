package JavaCore_HomeWork4;

import java.util.Random;

public class HW4_Work2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][8];
        int max = 0;

        Random random = new Random();

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = random.nextInt(200) - 100;
            }
        }

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(arr[i][j] >= max){max = arr[i][j];}
                System.out.printf("%3d",arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Max element in array = " + max);

    }
}
