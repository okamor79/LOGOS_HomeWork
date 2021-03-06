package home.work.arrays;

public class HW3_Work7 {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        for (int i = 1; i <= myArray.length; i++) {
            myArray[i - 1] = fibonachi(i);
            System.out.print(myArray[i - 1] + " ");
        }
        System.out.println(fibonachi(7));
    }

    static int fibonachi(int n) {
        return (n == 0 ) ? 0 : ((n == 1) ? 1 : fibonachi(n - 1) + fibonachi(n - 2));
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        } else {
//            return fibonachi(n - 1) + fibonachi(n - 2);
//        }
    }

}
