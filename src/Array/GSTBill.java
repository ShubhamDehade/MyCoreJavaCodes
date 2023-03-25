package Array;

import java.util.Scanner;

public class GSTBill {
    public static void main(String[] args) {
        BillCalculation b1= new BillCalculation();
        System.out.println("ENTER TOTAL NUMBER OF BILLS");
        Scanner sc1= new Scanner(System.in);
        int bill= sc1.nextInt();
        double[] amount=new double[bill];
        System.out.println("enter "+bill+" amounts");
        for(int i=0;i<bill;i++){
            amount[i]=sc1.nextDouble();
        }
        b1.billCal(amount);


    }
}
