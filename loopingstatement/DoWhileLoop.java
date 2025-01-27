package javaOnline.package1.loopingstatement;

import java.util.Arrays;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i=0;        //initialization

        //We will do use do_while if we want to execute the statement before checking the condition.
        do {
            System.out.print(i++ + " ");
        }while(i<=10);
    }
}
