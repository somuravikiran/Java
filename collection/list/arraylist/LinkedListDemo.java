package javaOnline.package1.collection.list.arraylist;

import java.awt.datatransfer.FlavorListener;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        //assign the elements.
        list.add("A");
        list.add("B");
        list.add("B");
        System.out.println("Add method for the LinkedList");
        System.out.println(list);   //[A, B]

        list.addLast("C");  //assign the element last in the  linked_list.
        System.out.println(list);   //[A, B, C]

        list.addFirst("D"); //assign the element first in the linked_list.
        System.out.println(list);   //[D, A, B, C]

        list.add(2,"E");    //assign the element in the specific index mentioned.

        //Printing the LinkedList
        System.out.println(list);   //[D, A, E, B, C]


        System.out.println("Remove Method for the LinkedList:");
        list.remove("B");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);


    }
}
