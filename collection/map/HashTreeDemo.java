package javaOnline.package1.collection.map;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashTreeDemo {
    public static void main(String[] args) {
        Map<String, Integer> hashmap=new HashMap<String, Integer>();

        //put method is used in hashmap to insert elements
        hashmap.put("a",1);
        hashmap.put("b",2);
        hashmap.put("b",2); //key can't be duplicated
        hashmap.put("c",2); //value can be duplicated
        hashmap.put("d",3);

        System.out.println("size of the map: " + hashmap.size());   //4
        System.out.println(hashmap);    //{a=1, b=2, c=2, d=3}

        if(hashmap.containsKey("a")){
            int a=hashmap.get("a");
            System.out.println("the value of the key 'as' is:" +a); //1
        }

        //keySet() is used for accessing the key
        for(String key:hashmap.keySet()){
            System.out.println("the value of the "+key +" is: "+hashmap.get(key));
        }

        //entrySet() is used for accessing the both key and value.
        //getkey() is used for fetching the key value.
        //getValue() is used for fetching the value of the map.
        for(Map.Entry<String,Integer> entry:hashmap.entrySet()){
            System.out.println("The value of "+entry.getKey()+", is: "+entry.getValue());
        }
    }
}
