package logos.jcore.test.cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.printf("Select your role: [admin/user or quit for exit]");
            String role = new Scanner(System.in).nextLine();
            System.out.println();
            if (role.equalsIgnoreCase("admin")) {
                Admin.adminPanel();
                System.out.println();
            } else if (role.equalsIgnoreCase("user")) {
                System.out.println("user role");
                System.out.println();
            } else if (role.equalsIgnoreCase("quit")) {
                return;
            } else {
                System.out.println("not select role");
            }


        }
    }
}
