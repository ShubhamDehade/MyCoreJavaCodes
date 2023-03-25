package StringDemo;


import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        System.out.println("china".compareTo("hyna"));
        String email = "shubhamdehade1982000@gmail.com";
        String userName = email.substring(0, email.indexOf('@'));
        String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));
        System.out.println(userName);
        System.out.println(domain);
        System.out.println(domain.contains("gmail"));

        binary();
       hexadecimal();
       date();

    }
   static void binary(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER NUMBER IN BINARY");
        try{ sc1.useRadix(2);
            int n1= sc1.nextInt();
            String s1=String.valueOf(n1);//valueOf(int n)
          if(s1.contains("0")||s1.contains("1"))                //if(s1.matches("[01]*"))
            {
                System.out.println("NUMBER IS BINARY");
                System.out.println("IN DECIMAL IT REFERS TO "+n1);
            }
        else {
              System.out.println("NUMBER IS NOT  BINARY");}
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("YOU HAVE NOT ENTERED BINARY NUMBER");
        }

    }
    static void hexadecimal(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER AND CHECK IT IS HEXADECIMAL OR NOT");
        String h1= sc1.next();
        System.out.println(h1.matches("[0-9A-F]*"));
    }
   static void date(){
        Scanner sc1=new Scanner(System.in);
        System.out.println("ENTER ANY DATE AND CHECK IF IT IS IN(DD/MM/YYYY) FORMAT OR NOT");
        String date=sc1.next();
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }

}