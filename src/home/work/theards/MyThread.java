package home.work.theards;

import java.util.Scanner;

public class MyThread extends Thread {

    private int cnt;
    Scanner sc =new Scanner(System.in);

    public MyThread(){

    }

    int fibonachi(int n) {
        return (n == 0) ? 0 : ((n == 1) ? 1 : fibonachi(n - 1) + fibonachi(n - 2));
    }

    @Override
    public void run() {
        System.out.println("Enter Thear Fibon Number  ");
        cnt = sc.nextInt();
        for (int i = 1; i <= cnt; i++) {
            System.out.printf(fibonachi(i)+" ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
