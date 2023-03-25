package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList data=new ArrayList();
        data.add("1");
        data.add("SHUBHAM");
        data.add("ANIL");
        data.add("DEHADE");
        //Iterator interface can be used with other classes also
        //it can be used for traverse data in forward direction only
        Iterator itr=data.iterator();
        while(itr.hasNext()){
            if (itr.next()=="SHUBHAM"){
                itr.remove();
            }
        }
        System.out.println(data);
    }
}
