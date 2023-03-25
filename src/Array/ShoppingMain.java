package Array;

import java.util.Scanner;

public class ShoppingMain {
    public static void main(String[] args) {
        boolean status=true;
        while (status){
            ShoppingArray s1=new ShoppingArray();
            int count=0;
            for(String a:s1.product){
                System.out.println(count+ " "+a);
                count++;
            }
            System.out.println("ENTER ANY OTHER KEY TO EXIT THE PROCESS");
            Scanner sc1= new Scanner(System.in);
            System.out.println("SELECT PROPER CHOICE");
            int choice=sc1.nextInt();
            if(choice==0||choice==2||choice==3||choice==1){

                System.out.println("enter quantity");
                int qty= sc1.nextInt();
                s1.calculateBill(choice,qty);
            }
            else {
                System.out.println("THANK YOU");
                status=false;
            }


        }

    }
//    public static void main(String[] args) {
//        Scanner sc1=new Scanner(System.in);
//        boolean status=true;
//        while (status) {
//            System.out.println("0.TV\t1.MOBILE\t2.AC\t3. TO EXIT");
//            System.out.println("select option");
//            int choice=sc1.nextInt();
//            if (choice == 0 || choice == 1 || choice == 2) {
//                ShoppingArray s1=new ShoppingArray();
//                System.out.println("ENTER REQUIRED QUANTITY");
//                int qty = sc1.nextInt();
//                s1.bill(choice,qty);
//            }
//            else{
//                System.out.println("THANK YOU");
//            status=false;
//        }
//    }
//}


}
