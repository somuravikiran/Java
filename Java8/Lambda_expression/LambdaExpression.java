package javaOnline.package1.Java8.Lambda_expression;

interface Shape{
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("rectangle class : draw() method.");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class : draw() method.");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class : draw() method.");
    }
}
public class LambdaExpression {
    public static void main(String[] args) {
        String str="Hello!";

        Shape Rectangle=()-> System.out.println("Rectangle class : draw() method. ");
        Rectangle.draw();
        Shape Square=()-> System.out.println("Square class : draw() method.");
        Square.draw();
        Shape Circle=()-> System.out.println("Circle class : draw() method. ");
        Circle.draw();
    }
}
