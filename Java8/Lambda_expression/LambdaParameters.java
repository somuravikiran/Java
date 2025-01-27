package javaOnline.package1.Java8.Lambda_expression;

interface Addable{
    int addition(int a, int b);
}
class Demo implements Addable{

    @Override
    public int addition(int a, int b) {
        return a+b;
    }
}

public class LambdaParameters {
    public static void main(String[] args) {
        //Lambda Expression with one statement
        Addable add=(y,z) -> (y+z);

        int res=add.addition(10,20);
        System.out.println("Addition method using lambda method: "+res);

        //Lambda Expression uso=ing lambda body.
        Addable abc=(x,y)->{
          int c=x+y;
          return c;
        };
        System.out.println("Addition method using lambda body: "+abc.addition(10,20));
    }
}
