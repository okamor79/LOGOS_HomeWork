package JavaCore_HomeWork2;

public class HW2_Work14 {
    public static void main(String[] args) {

        int[] fib = new int[11];
        fib[0] = 1;
        fib[1] = 1;

        System.out.print(fib[0] + " " + fib[1]);
        for(int i = 2; i < 11; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.print(" " + fib[i]);
        }

    }
}
