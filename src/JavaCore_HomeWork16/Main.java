package JavaCore_HomeWork16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Collection col = new Collection(new ArrayList<>());

        col.getArr().add("1");
        col.getArr().add("2");
        col.getArr().add("3");
        col.getArr().add("4");
        col.getArr().add("5");
        col.getArr().add("6");
        col.getArr().add("7");
        col.getArr().add("8");
        col.getArr().add("9");
        col.getArr().add("10");

        col.printFirstToLast();
        System.out.println();
        col.printLastToString();


    }
}
