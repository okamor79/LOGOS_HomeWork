package JavaCore_HomeWork11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> car = new ArrayList<>();

        car.add(new Car("red", "sedan", 200, new Body("Sedan"), new Helm("Wood"), new Wheel(15, "Nokian")));
        car.add(new Car("red", "sedan", 200, new Body("Sedan"), new Helm("Wood"), new Wheel(15, "Nokian")));
        car.add(new Car("rwwwed", "sedan", 200, new Body("Sedan"), new Helm("Wood"), new Wheel(15, "Nokian")));
        car.add(new Car("resdfd", "sedan", 200, new Body("Sedan"), new Helm("Wood"), new Wheel(15, "Nokian")));
        car.add(new Car("red", "sedan", 200, new Body("Sedan"), new Helm("Wood"), new Wheel(15, "Nokian")));





        car.add(new Car("red", "sedan", 200, new Body("Sedan"), new Helm("Wood"), new Wheel(15, "Nokian")));

        System.out.println(car);

        car.get(3).setBody(new Body("sdfsdfsdf"));


        System.out.println(car);

    }
}
