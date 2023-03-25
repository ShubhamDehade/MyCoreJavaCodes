package ExceptionHandling.Checked;

import java.io.FileWriter;
import java.io.IOException;

public class FileNotFoundExceptionDemo {

    public static void main(String[] args) {
        String s1="MY NAME IS SHUBHAM";
        FileWriter fw=null ;
        try {
             fw=new FileWriter("D://MY-JAVA//text.txt");
             fw.write(s1);
             fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
