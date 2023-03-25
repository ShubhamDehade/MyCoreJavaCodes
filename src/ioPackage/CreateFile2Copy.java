package ioPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile2Copy {
    FileWriter fw;
    FileReader fr;
   static String copy="";
    void file1(){
        try {
            fw=new FileWriter("D:\\FILE1.txt");
            fw.write("I AM FILE CONTENT");
            //closing file is important otherwise content will not be saved in it
            fw.close();
             fr=new FileReader("D:\\FILE1.txt");
            int b;
            while ((b=fr.read())!=-1){
               copy+=(char)b;
            }
            System.out.println(copy);
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    void file2(){
        try {
             fw=new FileWriter("D:\\file2.txt");
            fw.write(copy.toLowerCase());
            fw.close();
             fr=new FileReader("D:\\file2.txt");
            int x;
            String temp="";
            while ((x=fr.read())!=-1){
                temp+=(char)x;
            }
            System.out.println(temp);
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        CreateFile2Copy c1=new CreateFile2Copy();
        c1.file1();
        c1.file2();

    }
}
