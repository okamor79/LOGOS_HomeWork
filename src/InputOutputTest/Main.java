package InputOutputTest;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("text.txt");
        file.createNewFile();

//        FileWriter fw = new FileWriter("bc.txt", true);
//        fw.write(new User("Ivan","test").forWrite());
//        fw.write(new User("Ivan","test").forWrite());
//        fw.write(new User("Ivan","test").forWrite());
//        fw.write(new User("Ivan","test").forWrite());
//        fw.flush();
//        fw.close();

        FileReader fr = new FileReader("bc.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        while((line = br.readLine()) != null) {
            String[] arr = new String[2];
            int i = 0;
            for( String tempLine : line.split("&&")) {
                arr[i++] = tempLine;
            }
            User u = new User(arr[0], arr[1]);

            System.out.println(u);
       }



        fr.close();




    }
}
