package javaOnline.package1.collection.queues;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        //PriorityQueue help's in natural sorting phenomena.
        Queue<String> queue=new PriorityQueue<String>();

        queue.add("India");
        queue.add("America");
        queue.add("Germany");
        queue.add("London");
        queue.add("Canada");

        System.out.println("Original Queue: "+queue);   //[America, Canada, Germany, London, India]

        //remove method deletes the head element of the queue.
        queue.remove();
        System.out.println("Queue after remove method: "+ queue);   //[Canada, India, Germany, London]

        //peek method is used to for finding the head element of the queue.
        System.out.println("Peek element of the queue: "+queue.peek()); //Canada

        //Poll method is used to find the head of the element and remove the head element.
        String head=queue.poll();
        System.out.println("head of the queue: "+head); //Canada
        System.out.println("queue of poll method: "+queue); //[Germany, India, London]

    }
}
