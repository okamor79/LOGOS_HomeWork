package home.work.theards;

import java.util.Scanner;
import java.util.concurrent.*;

public class Program {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newFixedThreadPool(3);

        exec.submit(new RunnableThread());
        exec.submit(new MyThread());
        exec.shutdown();

    }
}
