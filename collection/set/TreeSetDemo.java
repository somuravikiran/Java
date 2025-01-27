package javaOnline.package1.collection.set;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeset=new TreeSet<String>();

        treeset.add("A");
        treeset.add("C");   //natural sorting in the ascending order
        treeset.add("B");
        treeset.add("B");   //duplicates are not allowed

        //printing the TreeSet
        System.out.println(treeset);


    }
}
