package JavaCore_HomeWork2;

public class HW2_Work13 {
    public static void main(String[] args) {

        int[] a = new int[12];

        a[0] = 3;
        a[1] = 2;

        System.out.println("a(1) = " + a[0]);
        System.out.println("a(2) = " + a[0]);
        for(int i = 2; i < 12; i++) {
            a[i] = 2 * a[i-2] - 2;
            System.out.println("a(" + (i+1) + ") = " + a[i]);
        }

    }
}
