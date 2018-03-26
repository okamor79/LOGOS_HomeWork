package home.work.theards;

public class MyThread extends Thread {

    private int[] arrFibon;

    public MyThread(int cnt) {
        this.arrFibon = new int[cnt];
        for (int i = 1; i < cnt; i++) {
            this.arrFibon[i - 1] = fibonachi(i);
        }
    }

    int fibonachi(int n) {
        return (n == 0) ? 0 : ((n == 1) ? 1 : fibonachi(n - 1) + fibonachi(n - 2));
    }


    @Override
    public void run() {

    }
}
