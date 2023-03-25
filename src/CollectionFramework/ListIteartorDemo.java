package CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteartorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> data=new ArrayList<>();
        data.add(1);
        data.add(1);
        data.add(null);
        data.add(2);
        data.add(3);
        ListIterator itr= data.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //it is not printing itr.hasPrevious() without using hasNext() first
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
