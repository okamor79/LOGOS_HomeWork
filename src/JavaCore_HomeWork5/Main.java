package JavaCore_HomeWork5;

public class Main {
    public static void main(String[] args) {


        Rectangle rect = new Rectangle(25, 10);
        System.out.println("Площа прямокутника = " + rect.resSquare());
        System.out.println("Перимерт прямокутника = " + rect.resPerimeter());
        System.out.println();
        Rectangle rect2 = new Rectangle();
        rect2.setHeight(13);
        rect2.setWidth(48);
        System.out.println("Площа прямокутника = " + rect2.resSquare());
        System.out.println("Перимерт прямокутника = " + rect2.resPerimeter());

    }
}
