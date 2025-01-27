package javaOnline.package1.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> arraylist = new ArrayList<Integer>(5);

        //check the arraylist is empty or not.
        System.out.println(arraylist.isEmpty());    //true

        //elements are added in order form without using index number.
        for (int i = 1; i <= 8; i++){
            arraylist.add(i);   //without index number.
        }

        //Display of the ArrayList.
        System.out.println(arraylist);  //[1, 2, 3, 4, 5, 6, 7, 8]

        //Remove the element bby using index number
        arraylist.remove(4);    // 4 is a index number.

        //Display of the arraylist.
        System.out.println(arraylist);  //[1, 2, 3, 4, 6, 7, 8]

        int n;
        //size() is used to find the size of the arraylist.
        n=arraylist.size();
        System.out.println(n);  //7

        //We are specifically accessing the element in index 5.
        System.out.println(arraylist.get(5));   //7


        //printing the elements one by one.
        //We will use get to access the elements in the ArrayList using index_number
        for (int i=0;i<arraylist.size();i++){
            System.out.print(arraylist.get(i) + " ");   //1 2 3 4 6 7 8
        }
        System.out.println();

        //isEmpty is used to check the arraylist is empty or not.
        System.out.println(arraylist.isEmpty());    //false


        for (int i:arraylist){
            System.out.print(i + " ");  //1 2 3 4 6 7 8
        }
    }
}
