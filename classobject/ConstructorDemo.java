package javaOnline.package1.classobject;

public class ConstructorDemo {

    int length;
    int width;
    int height;

    //Parameter Constructor
    public ConstructorDemo(int length, int width,int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //parameter Constructor with two parameter
    public ConstructorDemo(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //Default Constructor
    public ConstructorDemo(){
        this.length=10;
        this.width=10;
        this.height=10;
    }

    public int area(){
        return length*width;
    }

    public int cube(){
        return length*width*height;
    }

    public static void main(String[] args) {
        ConstructorDemo cd1=new ConstructorDemo(12,25);
        ConstructorDemo cd2=new ConstructorDemo(15,16,17);
        ConstructorDemo cd3=new ConstructorDemo();


        System.out.println("Area of rectangle is "+ cd1.area());
        System.out.println("Volume using three parameter: "+cd2.cube());
        System.out.println("Volume using copy Constructor: "+cd3.cube());
    }
}
