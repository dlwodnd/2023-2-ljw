package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 num = new MyMath2();
        num.num = 10;
        num.staticNum = 30;


        MyMath2 num2 = new MyMath2();
        num2.num = 100;
        num2.staticNum = 40;
        System.out.printf("num.num = %d, num.staticNum = %d\n", num.num, num.staticNum);
        System.out.printf("num.num = %d, num2.staticNum = %d\n", num.num, num2.staticNum);
        //
    }
}
