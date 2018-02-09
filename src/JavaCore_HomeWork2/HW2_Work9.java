package JavaCore_HomeWork2;

public class HW2_Work9 {

    public static void main(String[] args) {

        for (int a = -166; a < 100; a = 2 * a + 200) {

            if ((a > -100 && a < 0) || (a > 0 && a < 100)) {
                System.out.println(a);
            }
        }

    }
}
