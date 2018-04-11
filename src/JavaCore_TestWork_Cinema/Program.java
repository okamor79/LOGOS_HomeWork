package JavaCore_TestWork_Cinema;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception{

        System.out.printf("Enetr role user/admin:  ");
        String role = new Scanner(System.in).next();
        if (role.equalsIgnoreCase("admin")) {
            Adminka a = new Adminka();
            a.start();
        } else {
            System.out.println("You not have permission....");
        }
    }


}
