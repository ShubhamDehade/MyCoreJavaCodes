package StringDemo;

import java.util.Scanner;

public class AccountCreation {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        String name = sc1.nextLine().trim();
        if (!name.isEmpty()) {
            System.out.println("ENTER EMAIL");
            String email = sc1.next().trim();
            if (email.contains("@") && email.contains(".")) {
                System.out.println("ENTER PASSWORD");
                String pass = sc1.next().trim();
                if (pass.length() > 8 && !pass.contains(name)) {
                    System.out.println("CONFIRM PASSWORD");
                    String paas2 = sc1.next();
                    if (pass.equals(paas2)) {
                        System.out.println("ACCOUNT CREATED");
                        System.out.println("WELCOME "+name.toUpperCase());
                    }
                }
            }
        }
    }
}