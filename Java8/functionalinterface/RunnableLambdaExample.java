package javaOnline.package1.Java8.functionalinterface;

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method is called....");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread=new Thread(new ThreadDemo());
        thread.run();

        //Runnable interface using Lambda Expression
        Runnable runable=()-> System.out.println("run method is called....");
        Thread thread1=new Thread(runable);
        thread1.run();
    }
}
