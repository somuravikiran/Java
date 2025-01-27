package javaOnline.package1.Java8.functionalinterface;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{


    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
public class FunctionDemo {

    public static void main(String[] args) {
        //without using lambda
//        Function<String, Integer> function=new FunctionImpl();
//        System.out.println(function.apply("Ramesh Reddy"));

        //With lambda Expression
        Function<String,Integer> functionn=(String s)->s.length();
        System.out.println(functionn.apply("RameshReddy"));
    }
}
