package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add(1);
        l1.add(34);
        l1.add(23);
        l1.add(20);
      l1.add(2,3);
      //  l1.addFirst(4);
        l1.addLast(8);
//        l1.removeFirst();
//        l1.removeLast();
//        l1.remove(34);
//        l1.remove(3);
        l1.remove();//by default top element will be removed as it implemeents Queue interface as well

        System.out.println(l1 );
        System.out.println(l1.contains(23));
    }
}
