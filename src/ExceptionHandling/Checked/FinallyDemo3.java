package ExceptionHandling.Checked;

import java.io.FileInputStream;
import java.util.Scanner;

public class FinallyDemo3 {
   static FileInputStream fi;
  static   Scanner sc1;
  static void  test() throws Exception{
       try {
           fi=new FileInputStream("D:\\DemoRes\\demo.txt");
           sc1=new Scanner(fi);
           int a= sc1.nextInt();
           int b= sc1.nextInt();
           int c= sc1.nextInt();
           System.out.println(a);
           System.out.println(b/a);
       //   System.out.println(a/c); java.lang.ArithmeticException: / by zero
       }finally {
           fi.close();
        // sc1.close(); if scanner is closed here then o/p ==>java.lang.IllegalStateException: Scanner closed
       }
   }

    public static void main(String[] args) {
        try {
            test();
            int d= sc1.nextInt();
            System.out.println(d);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
