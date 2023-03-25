package ioPackage;

import java.io.*;

public class Copy2fileiIn3 {
    public static void main(String[] args) {
        try {
            FileInputStream f1=new FileInputStream("D:\\FILE1.txt");
            FileInputStream f2=new FileInputStream("D:\\file2.txt");
            SequenceInputStream s1=new SequenceInputStream(f1,f2);
            FileOutputStream f3=new FileOutputStream("D:\\file3.txt");
            int x;
            while ((x=s1.read())!=-1){
                f3.write(x);
            }
          f3.close();
            FileInputStream f4=new FileInputStream("D:\\file3.txt");
            int y;
            while ((y= f4.read())!=-1){
                System.out.print((char) y);
            }
            f4.close();
            f1.close();
            f2.close();
            s1.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
