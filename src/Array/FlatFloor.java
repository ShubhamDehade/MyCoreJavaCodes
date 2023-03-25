package Array;

import java.util.Scanner;

public class FlatFloor {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER TOTAL NO OF FLOOR");
        int floor=sc1.nextInt();
        System.out.println("ENTER FLATS ON EACH FLOOR");
        int flat= sc1.nextInt();
        int[][] data=new int[floor][flat];
        System.out.println("ENTER "+(flat*floor)+"FLAT NUMBERS");
        for (int i=0;i<floor;i++){
            for (int k=0;k<flat;k++){
                data[i][k]= sc1.nextInt();
            }
        }
        System.out.println("============================================");
        for(int i=0;i<floor;i++){
            System.out.println("Floor no "+(i+1));
            for (int j=0;j<flat;j++){
                System.out.print("flat no "+data[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
