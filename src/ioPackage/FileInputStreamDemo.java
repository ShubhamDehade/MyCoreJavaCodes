package ioPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fr=new FileInputStream("D:\\shubham\\New folder\\.java\\demo.txt");
            //read byte by byte
            int x;
            while((x=fr.read())!=-1){
                System.out.print((char) x);
                //in above we are type casting byte into char.byte is 1 byte and char is 2byte i.e, widening
                //we ahve to do it explicitely to show output in arrray of characters ar string as we have stored
            }
            //it is used to read data
//            byte []arr=new byte[fr.available()];
//            fr.read(arr);
//            String str=new String(arr);
//            System.out.println(str);

            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
