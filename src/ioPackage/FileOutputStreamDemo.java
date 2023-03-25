package ioPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try {
            // It is used for writing byte-oriented data (streams of raw bytes) such as image data, audio, video etc
            FileOutputStream fo=new FileOutputStream("D:\\shubham\\New folder\\.java\\demo.txt");
            fo.write("1234".getBytes());
            String str="THIS IS FILEOUTPUTSTREAM";
            byte []b=str.getBytes();
            fo.write(b);
            //to write only particular letters
            fo.write(str.getBytes(),8,str.length()-8); // FILEOUTPUTSTREAM
            //in above syntx first is our input then from which letter we want to store then how many characters we want

            fo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
