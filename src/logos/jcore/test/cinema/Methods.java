package logos.jcore.test.cinema;

import java.io.*;

public class Methods {

    public static Object loadFromFile(String filename) throws Exception {
        File f = new File(filename);
        if (!f.exists()) {
            System.out.println("File " + filename + " does not exist");
            f.createNewFile();
            return null;
        }
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fis.close();
            ois.close();
        }
        return null;
    }

    public static void writeToFile(String filename, Object o) throws Exception {
        File f = new File(filename);
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(o);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fos.close();
            oos.close();
        }

    }

}
