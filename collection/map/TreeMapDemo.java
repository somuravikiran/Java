package javaOnline.package1.collection.map;

import java.util.Arrays;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treemap=new TreeMap<Integer, String>();

        //put method is used in treemap to insert elements
        treemap.put(1,"a");
        treemap.put(2,"b");
        treemap.put(2,"b"); //key can't be duplicated
        treemap.put(2,"c"); //value can be duplicated
        treemap.put(3,"d");

        System.out.println("Size of the Tree is: "+treemap.size()); //3

        System.out.println(treemap);    //{1=a, 2=c, 3=d}
    }
}
