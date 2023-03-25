package ExceptionHandling.Unchecked;

import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER NUMBER");
      try {
          String s1=sc1.next();
          int num=Integer.parseInt(s1);
          System.out.println("NO IS :"+num);
      }catch (NumberFormatException e){
          System.out.println(e);
      }

    }
}
