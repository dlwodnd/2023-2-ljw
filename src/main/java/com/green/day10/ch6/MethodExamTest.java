package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10);
        me.checkZero(9);
        me.checkZero(8);
        me.checkZero(0);
        System.out.println("=================");
        int r = me.randomValFormTo(10, 200);
        System.out.println(r);
        System.out.println("=================");
        me.scoreResultPrint(r);
    }
}

