package javaOnline.package1.collection.Stack;

import java.util.Arrays;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();

        //push() is to add elements to the top of the stack.
        stack.push("India");
        stack.push("America");
        stack.push("Germany");

        //Printing the stack
        System.out.println(stack);  //[India, America, Germany]

        //peek() is used to peek the top element of the stack.
        System.out.println(stack.peek());   //Germany

        //pop() is used to remove the top element from the stack.
        System.out.println(stack.pop());    //Germany

        //Printing the stack.
        System.out.println(stack);  //[India, America]

        //isEmpty() is used to check wheather the stack is empty or not.
        System.out.println(stack.isEmpty());    //false

        //search() is used to search element in the stack.
        System.out.println(stack.search("India"));  //2

        System.out.println(stack.peek());
    }
}
