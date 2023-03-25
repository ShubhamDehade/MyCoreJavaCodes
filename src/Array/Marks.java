package Array;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("enter total no of Subjects");
        Scanner sc1=new Scanner(System.in);
        int sub=sc1.nextInt();
        int[] marks=new int[sub];
        System.out.println("enter marks");
        for(int i=0;i<sub;i++){
            marks[i]=sc1.nextInt();
        }


        int total=0;
        for (int mark : marks) {
            total += mark;
            System.out.println(mark);
        }
        System.out.println("total marks "+total);
        System.out.println("average marks "+total/ marks.length );



    }
}
