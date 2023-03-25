package ExceptionHandling.Checked;

import java.io.FileWriter;
import java.io.IOException;


public class IOExceptionDemo {
    public static void main(String[] args) {


        FileWriter fw= null;
        try {
            fw = new FileWriter("C:\\Users\\Shree\\Desktop\\J2EE\\demo.txt");
            fw.write("HI SHUBHAM ");
            fw.write("YOU ARE CREATING FILE BY USING FILE WRITER");
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
