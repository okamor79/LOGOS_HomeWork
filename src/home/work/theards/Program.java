package home.work.theards;

import java.util.Scanner;
import java.util.concurrent.*;

public class Program {
    public static void main(String[] args) throws Exception {

        int cnt;
        int cnt2;
        Scanner sc = new Scanner(System.in);
        ExecutorService exec = Executors.newFixedThreadPool(2);
        System.out.println("Enter Thear Fibon Number  ");
        cnt = sc.nextInt();
        System.out.println("Enter Runnable Fibon Number  ");
        cnt2 = sc.nextInt();

        exec.submit(new RunnableThread(cnt2));
        exec.submit(new MyThread(cnt));
        exec.shutdown();

    }
}
