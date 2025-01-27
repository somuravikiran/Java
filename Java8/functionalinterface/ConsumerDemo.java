package javaOnline.package1.Java8.functionalinterface;

import java.util.function.Consumer;

//We need to create class to perform without using lambda function.
class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {
        ConsumerImpl consumer=new ConsumerImpl();
        consumer.accept("Hello!");

        //lambda function directly access the function interface without using class
        Consumer consumer1=(s) -> System.out.println(s);
        consumer1.accept("Hello!!");
    }
}
