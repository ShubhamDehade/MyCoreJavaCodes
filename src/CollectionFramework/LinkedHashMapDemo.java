package CollectionFramework;

import javafx.beans.binding.SetBinding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> data=new LinkedHashMap<>();
        data.put(1,"SHUBHAM");
        data.put(2,"ram");
        data.put(3,"shyam");
        data.put(4,"lalau");
        data.put(5,"bulu");
        System.out.println(data);
        //display ALL KEYS
        System.out.println(data.keySet());
        Set<Integer> key=data.keySet();
        System.out.println(key);
        //display all values
        System.out.println(data.values());
        //display all entries
        System.out.println(data.entrySet());
        Set<Map.Entry<Integer,String>> d=data.entrySet();
        System.out.println("KEY   VALUE");
        for (Map.Entry<Integer,String> m:d ) {//data.entrySet()
            System.out.println(m.getKey()+"  "+m.getValue());
        }
        //display specific value by providing key as input
        System.out.println(data.get(1));
        //check object is present or not
        System.out.println(data.containsValue("lalau"));
        System.out.println(data.containsKey(6));


    }
}
