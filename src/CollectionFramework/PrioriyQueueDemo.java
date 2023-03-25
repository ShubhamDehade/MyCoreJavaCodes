package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrioriyQueueDemo {
    public static void main(String[] args) {
        //used to retrieve data in ascending order
     Queue<Integer> data=new PriorityQueue <>();
        data.offer(1);
        data.offer(3);
        data.offer(2);
        data.offer(56);
        data.offer(23);
        System.out.println(data);

    }
}
