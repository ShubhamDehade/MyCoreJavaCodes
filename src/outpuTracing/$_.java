package outpuTracing;

import java.util.Scanner;

//special character like $ and _ allowed only
public class $_ {
    public static void main(String[] args) {
        if (true){
        ///    break; //--> compile time error- because break can be used only in case of loop or switch case stmt
            // continue;compile time error- because continue can be used only in case of loop
             long num=1234567890;
             short n=123;
             float f=12.78f;
            System.out.println(num);
            int m1=23,m2=34,m3=85,$ =34;
            String p="15",q="25",r="35",s="45";
            q=s;
            p=r;
            r=q;
            s=p;
            System.out.println(p+" "+q+" "+r+" "+s);// for int 35 45 45 35

        }
       else {
            for (int i=0;i<3;i++){
                // break;
                continue;
            }
            int j=1;
            while (j++<3){
                break;
            }
            while(true){
                break;
            }
            //we cannot use boolean parameter in case of switch case
            switch ("shubham"){
                case "shubham":
                    System.out.println("match");//will not printed as control never comes in else
                    break;

                default:
                    System.out.println("no match");



            }
        }
    }
}
 class Hello{ //cant be public

}
