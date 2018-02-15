package JavaCore_HomeWork7;

public class Main {
    public static void main(String[] args) {

        MyMath mm = new MyMath();
        mm.setRadius(34);

        System.out.println("Довжина кола з радіусом " + MyMath.getRadius() + " = " + mm.calcCircleLength());
        mm.setRadius(40);

        System.out.println("Площа круга з радіусом " + MyMath.getRadius() + " = " + mm.squareCircle());



        Pet cow = new Cow();
        cow.voice();
        Pet cat = new Cat();
        cat.voice();
        Pet dog = new Dog();
        dog.voice();

    }
}
