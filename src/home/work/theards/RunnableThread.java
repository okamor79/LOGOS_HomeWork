package home.work.theards;

import java.util.Scanner;

public class RunnableThread implements Runnable {

    private int cnt;

    public RunnableThread(int i) {
        cnt = i;
    }

    int fibonachi(int n) {
        return (n == 0) ? 0 : ((n == 1) ? 1 : fibonachi(n - 1) + fibonachi(n - 2));
    }

    @Override
    public void run() {
        for (int i = cnt; i >= 1; i--) {
            System.out.println(fibonachi(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }}
