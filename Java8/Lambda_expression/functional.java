package javaOnline.package1.Java8.Lambda_expression;

import java.util.function.Function;

public class functional {
    public static void main(String[] args) {
        Function<String, Integer> function=(s)->s.length();
        System.out.println(function.apply("Ramesh reddy"));
    }
}
