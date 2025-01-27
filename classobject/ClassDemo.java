package javaOnline.package1.classobject;

import java.util.Arrays;

public class ClassDemo {

    int sno;
    String name;
    String Depart;

    public ClassDemo(int sno, String name, String depart) {
        this.sno = sno;
        this.name = name;
        this.Depart = depart;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepart() {
        return Depart;
    }

    public void setDepart(String depart) {
        Depart = depart;
    }

    public static void main(String[] args) {
        ClassDemo cd1=new ClassDemo(1,"ravi kiran","ECE");
        System.out.println("Serial number: "+cd1.getSno());
        System.out.println("Student Name: "+cd1.getName());
        System.out.println("Student Department: "+cd1.getDepart());

        cd1.setSno(2);
        cd1.setName("Sumanth gowda");
        cd1.setDepart("CSE");

        System.out.println("Serial number: "+cd1.getSno());
        System.out.println("Student Name: "+cd1.getName());
        System.out.println("Student Department: "+cd1.getDepart());

    }
}
