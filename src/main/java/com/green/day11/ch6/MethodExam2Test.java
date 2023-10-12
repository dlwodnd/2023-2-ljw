package com.green.day11.ch6;

public class MethodExam2Test {
    public static void main(String[] args) {
        MethodExam2 me2 = new MethodExam2();
        String r1 = me2.scoreResultOpt(77);
        System.out.println(r1);
        System.out.println("=====================");
        String season = me2.getSeason(13);
        System.out.println(season);
        System.out.println("========================");
        String season2 = me2.getSeason2(12);
        System.out.println(season2);
    }
}
