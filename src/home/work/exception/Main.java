package home.work.exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Methods m = new Methods();

        try {
            System.out.println(m.ariphmetcOperation(sc.nextInt(), sc.nextInt(), sc.next()));
        } catch (IllegalArgumentException e) {
            System.err.print("IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.err.print("ArithmeticException");
        } catch (IllegalAccessException e) {
            System.err.print("IllegalAccessException");
        } catch (Exception e) {
            System.err.print(Methods.MyException);
        }

    }
}
