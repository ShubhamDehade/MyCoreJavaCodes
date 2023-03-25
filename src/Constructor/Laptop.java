package Constructor;

import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.println("ENTER RAM");
        int ram=sc1.nextInt();
        System.out.println("ENTER COMPANY BRAND");
        String brand=sc1.next();
        System.out.println("ENTER YOUR BUDGET");
        int budget=sc1.nextInt();
        Laptop l1=new Laptop(ram,brand,budget);
        l1.display(ram,brand,budget);
    }
    Laptop(int rambo,String brand,int budget){
//      rambo=ram; Parameter 'rambo' is never used
//        brand=brand; Parameter 'brand' is never used
//        budget=budget; Parameter 'budget' is never used
    }
    void display(int ram,String brand,int budget){
        System.out.println(ram+"\t"+brand+"\t"+budget);
    }

}
