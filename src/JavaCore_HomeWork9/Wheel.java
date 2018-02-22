package JavaCore_HomeWork9;

public class Wheel {

    private int radius;
    private String name;

    public Wheel(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
