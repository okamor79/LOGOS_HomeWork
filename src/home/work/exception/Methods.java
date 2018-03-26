package home.work.exception;

public class Methods {
    private int a;
    private int b;

    public static final Exception MyException = new Exception("MyException");

    public Methods() {

    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void validator(int a, int b) throws Exception {
        if (a < 0 && b < 0) {
            throw new IllegalArgumentException();
        } else if (a > 0 && b > 0) {
            throw new Exception(MyException);
        }else if ((a > 0 && b != 0) || (a != 0 && b == 0)) {
            throw new ArithmeticException();
        } else if (a == 0 && b == 0) {
            throw new IllegalAccessException("IllegalAccessException");
        }
    }

    public int ariphmetcOperation(int a, int b, String c) throws Exception {
        validator(a, b);
        int res = 0;
        switch (c) {
            case "+":
                res = a + b;
            break;
            case "-":
                res = a - b;
            break;
            case "*":
                res = a * b;
            break;
            case "/":
                res = a / b;
            break;
        }
        return res;
    }

}
