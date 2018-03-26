package home.work.arrays;

public class HW3_Work1 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 20; i++){
            if(i % 2 == 0) {counter += 1;}
        }
        int[] myArray = new int[counter];
        createArray(myArray);
        printArray(myArray, "R");
        System.out.println();
        printArray(myArray,"C");
    }

    static void createArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;
        }
    }

    static void printArray(int[] arr, String type) {
        for (int i = 0; i < arr.length; i++) {

            if(type == "C") {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
