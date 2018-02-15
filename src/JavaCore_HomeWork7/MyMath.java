package JavaCore_HomeWork7;

public class MyMath {

    public static final double PI = 3.14;
    public static final double EXP = 2.71828;


    private static double radius;

    public MyMath( double radius) {
        this.radius = radius;
    }

    public MyMath() {

    }
    public static double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double calcCircleLength() {
        return 2*PI*radius;
    }

    public static double squareCircle() {
        return PI*radius*radius;
    }
}
