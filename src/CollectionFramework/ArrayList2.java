package CollectionFramework;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(0,12);
        l1.add(32);
        l1.add(90);
        l1.add(47);
        //using for loop
        for (int i=0;i<l1.size();i++){
            System.out.print(" "+l1.get(i));
        }
        System.out.println();
        //using enhanced for loop
        for (Integer x:l1) {
            System.out.print(" "+x);
        }
        System.out.println();
        //using forEach and lambda expression
        l1.forEach ((x)-> System.out.print(" "+x));
        System.out.println();
        //if number is more than 20
        l1.forEach(l->show(l));

    }
    static  void show(int n){
        if (n>20)
            System.out.println(n);
    }
}
