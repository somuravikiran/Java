package javaOnline.package1.controlflowstatement;

import java.util.Arrays;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int score=85;


        if (score>=90){
            System.out.println("Grade: " + "A");
        }
        else if (score>=80) {
            System.out.println("Grade: "+ "B");
        }
        else if (score>=70) {
            System.out.println("Grade: "+ "C");
        }
        else if(score>=60){
            System.out.println("Grade: "+ "D");
        }
        else if(score>=50){
            System.out.println("Grade: "+ "E");
        }
        else{
            System.out.println("Grade: " + "F");
        }
    }
}
