package javaOnline.package1.operator.Arithmetic;

public class ArithmeticOperator {
    public void Addition(){
        int a=3+5;
        System.out.println("Addition Operator: "+a);
    }
    public void Subtraction(){
        int a=3-5;
        System.out.println("Addition Operator: "+a);
    }
    public void Multiplication(){
        int a=3*5;
        System.out.println("Addition Operator: "+a);
    }
    public void Division(){
        int a=50/5;
        System.out.println("Addition Operator: "+a);
    }
    public void Remainder(){
        int a=50%3;
        System.out.println("Addition Operator: "+a);
    }

    public static void main(String[] args) {
        ArithmeticOperator ao1=new ArithmeticOperator();
        ao1.Addition();
        ao1.Subtraction();
        ao1.Multiplication();
        ao1.Division();
        ao1.Remainder();
    }
}
