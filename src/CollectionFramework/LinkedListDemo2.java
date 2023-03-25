package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        Queue q1=new LinkedList();
        q1.offer(1);
        q1.offer(12);
        q1.offer(35);
        System.out.println(   q1.peek());
        System.out.println(q1);
        q1.poll();
        q1.add(null);
        System.out.println(q1);
        q1.remove(35);//nothing removed as no object as 2,
        // here method AVAILABLE IN remove(object o) signature only
        //remove(index i) not available
        System.out.println(q1);
    }
}
