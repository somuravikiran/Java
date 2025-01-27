package javaOnline.package1.Java8.stream;

import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> alllist=new ArrayList<Integer>();
        for (int i: list){
            alllist.add(i*i);
        }


    }
}
