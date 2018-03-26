package home.work.zooclub;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("zooClub.txt");
        file.createNewFile();


        ZooClub zoo = new ZooClub();
        zoo.Start();

    }
}
