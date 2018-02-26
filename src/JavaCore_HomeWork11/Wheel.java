package JavaCore_HomeWork11;

public class Wheel {

    private int radius;
    private String name;

    public Wheel(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setName(String name) {
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
