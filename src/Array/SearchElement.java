package Array;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int[] arrr={1,2,4,4,3,4,54,466,7,4,4443,6,466,5,4,4,79,78,34};
        System.out.println("ENTER NUMBER TO BE SEARCHED");
        int num=sc1.nextInt();
        int count=0;
        boolean status=false;
        for (int a:arrr) {
            if(a==num)
            {System.out.println("number found");
               status=true;
            break;}
        }
        if(!status)
            System.out.println("number doesnt exist");
//            if(a==num) {
//
//                System.out.println("number found at index "+count);
//                count++;
//                break;
//
//            }
//            else {
//                System.out.println("number not found");
//                count++;
//            }


    }
}
