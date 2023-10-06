package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7_2 {
    public static void main(String[] args) {
        //1. 정수 10개를 저장할 수 있는 배열을 만든다.
        //0~9값을 순차적으로 대입한다.
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = i;
        }
        for (int i = 0; i < x.length; i++) {
            int y = (int) (Math.random() * x.length);
            if (i != y) {
                int a = x[i];
                System.out.println("a = " + a);

                x[i] = x[y];
                System.out.println("x[i] = " + x[i]);

                x[y] = a;
                System.out.println("x[y] = " + x[y]);

                System.out.println("-------------------");
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
