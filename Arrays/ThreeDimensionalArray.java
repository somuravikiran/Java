package javaOnline.package1.Arrays;

import java.util.Arrays;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        int[][][] arr={{{1,2,3},{4,5,6}},{{7,8,9},{0,10,11}}};
        System.out.println(arr[0][1][2]);//6
        System.out.println(arr[1][0][2]);//9
        System.out.println(arr[1][1][2]);//11
    }
}
