package com.green.day1.ch1;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int c = 0;

        System.out.println("x:" + x);
        System.out.println("y:" + y);
        //리터럴 금지.
        //x와y의 값 바꾸기(스와핑)
        c = y;
        y = x;
        x = c;
        //새로운 변수 c 선언 및 초기화,
        //y의 값을 c에다 복사.
        System.out.println("x:" + x);//+x를 문자열 합치기 라고 함.
        System.out.println("y:" + y);
    }
}
