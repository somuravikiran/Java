package javaOnline.package1.controlflowstatement;

import java.util.Arrays;

public class TernaryOperator {
    public static void main(String[] args) {
        int a=5;
        int b=4;

        boolean result;

        //ternary operator syntax is "condition?true_statement:false_statement;"
        result=a>b?true:false;
        System.out.println(result);
    }
}
