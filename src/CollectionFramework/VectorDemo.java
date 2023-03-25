package CollectionFramework;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //only difference in ArrayList and Vector is that Vector is Thread safe,i.e, synchronization is possible
        Vector<Integer> data=new Vector<>();
        data.add(1);
        data.add(1);
        data.add(null);
        data.add(2);
        System.out.println(data);

    }
}
