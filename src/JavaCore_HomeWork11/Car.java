package JavaCore_HomeWork11;

public class Car {

    private String color;
    private String model;
    private int maxSpeed;

    private Body body;
    private Helm helm;
    private Wheel wheel;

    public Car(String color, String model, int maxSpeed, Body body, Helm helm, Wheel wheel) {
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.body = body;
        this.helm = helm;
        this.wheel = wheel;
    }

    public Car(Body body, Helm helm, Wheel wheel) {
        this.body = body;
        this.helm = helm;
        this.wheel = wheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Body getBody() {
        return body;
    }

    public Helm getHelm() {
        return helm;
    }

    public Wheel getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", body=" + body +
                ", helm=" + helm +
                ", wheel=" + wheel +
                '}';
    }
}
