package javaOnline.package1.operator.unary;

import java.util.Arrays;

public class UnaryOperator {
    public static void main(String[] args) {

        //unary + operator
        int a=+1;
        System.out.println("+ operator: "+a);

        //unary - operator
        a=-a;
        System.out.println("- operator: " + a);

        //unary ++ operator
        a++;
        System.out.println("++ operator " + a);

        //unary -- operator
        a--;
        System.out.println("-- operator: " + a);

        //unary ! operator
        boolean s= false;
        //without using ! operator
        System.out.println("without using ! operator: " + s);

        //with using !operator
        System.out.println("with using ! operator: " + !s);
    }
}
