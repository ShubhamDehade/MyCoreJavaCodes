package DataHiding;

import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Student s1=new Student();
        Scanner sc1= new Scanner(System.in);
        System.out.println("WHO ARE YOU\n1.TEACHER\n2.STUDENT");
        int choice=sc1.nextInt();
        if(choice==1){
            s1.getName();
            s1.setName("SHUBHAM");
            s1.getMarks();
            s1.setMarks(88);
        } else if (choice==2) {
            s1.getName();
            s1.getMarks();
        }
    }
}
