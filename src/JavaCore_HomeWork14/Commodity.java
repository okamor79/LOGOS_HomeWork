package JavaCore_HomeWork14;

public class Commodity implements Comparable<Commodity> {
    private int id;
    private String title;
    private String code;
    private double price;

    public Commodity() {
    }

    public Commodity(int id, String title, String code, double price) {
        this.id = id;
        this.title = title;
        this.code = code;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + code + " " + title + "     " + price;
    }

    @Override
    public int compareTo(Commodity o) {
        int res = id - o.id;
        return res;
    }
}
