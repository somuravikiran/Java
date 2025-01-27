package javaOnline.package1.Java8.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//We create class for the implements supplier interface.
class SupplierDemoImpl implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}
public class SupplierDemo {
    public static void main(String[] args) {

        //We create object to execute get() method
        Supplier supplier=new SupplierDemoImpl();
        System.out.println("Daate and Time without using Lambda Expression: "+supplier.get());

        //We execute without creating object using lambda Expression.
        Supplier supplier1=()-> {
          return LocalDateTime.now();   //it is used for getting current date and time
        };
        System.out.println("Date and time using Lambda Expression: "+supplier1.get());
    }
}
