package javaOnline.package1.controlflowstatement;

import java.util.Arrays;

public class NestedIfStatement {
    public static void main(String[] args) {
        int i=50;

        //for the nested_if if_statement one or more if_statement
        if(i==50){
            System.out.println("i is equal to 50");
            if(i<75){
                System.out.println("i is less than 75");
            }
            if (i<55){
                System.out.println("i is also less than 55");
            }
        }
    }
}
