package JavaCore_HomeWork9;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(new Body("Sedan"), new Helm("Wood"), new Wheel(15,"Nokian"));
        car.setColor("Red");
        car.setModel("Porsche");
        car.setMaxSpeed(280);
        System.out.println(car);



    }
}
