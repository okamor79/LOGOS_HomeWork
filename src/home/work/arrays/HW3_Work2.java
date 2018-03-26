package home.work.arrays;

public class HW3_Work2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0) count++;
        }
        int[] myArray = new int[count];
        createArray(myArray);
        printArray(myArray, 0);
        System.out.println();
        printArray(myArray, 1);
    }

    static void createArray(int[] arr) {
        for (int i = 0, j = 0; i < 100; i++ ){
            if(i % 2 != 0) {
                arr[j++] = i;
            }
        }
    }

    static void printArray(int[] arr, int a) {
        if (a == 0) {
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        } else if (a == 1) {
            for(int i = arr.length - 1; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
        }

    }
}
