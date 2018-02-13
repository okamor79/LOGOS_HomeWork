package JavaCore_HomeWork6;

public class Robot {
    
    protected String name;

    public Robot() {

    }

    public void work(String name) {
        System.out.println("Я " + name +" – я просто працюю");
    }

    public void work(){
        System.out.println("Я " + name + " – я просто працюю");

    }

    public Robot(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }

    }
