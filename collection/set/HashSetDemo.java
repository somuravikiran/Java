package javaOnline.package1.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashset=new HashSet<String>();

        hashset.add("A");
        hashset.add("B");
        hashset.add("C");
        hashset.add("C");   //Hashset will not allow duplicates.

        //Printing the hashset
        System.out.println(hashset);    //[A, B, C]

        //Contain method in hashset
        System.out.println("hashset contain c or not " + hashset.contains("z"));    //true

        //remove "A" for hashset
        hashset.remove("A");
        System.out.println(hashset);    //[B, C]
    }
}
