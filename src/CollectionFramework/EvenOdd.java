package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER STARTING POINT AND ENDING POINT");
        int start=sc1.nextInt();
        int end=sc1.nextInt();
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for (int i=start;i<=end;i++){
            if(i%2==0){
                even.add(i);
            }
            else {
                odd.add(i);
            }
        }
        System.out.println(even);
        System.out.println(odd);
        //merging ArrayList
        odd.addAll(even);
        System.out.println(odd);
        //arrange in ascending,descending order
        Collections.sort(odd);//ascending
        System.out.println(odd);
        Collections.sort(odd,Collections.reverseOrder());//descending
        System.out.println(odd);
    }
}
