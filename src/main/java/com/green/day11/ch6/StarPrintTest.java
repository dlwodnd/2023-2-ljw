package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5);
        System.out.println("======================");

        sp.square(4);
        System.out.println("=======================");
        sp.triangle(7);
        System.out.println("=========================");
        String gender = sp.shkGenderById("011231-4117111");
        System.out.println(gender);
        /*
        8번째 자리의 숫자가
        2 4 면 여성
        1 2 면 남성
        이외는 유효하지 않은 주민번호
         */
        System.out.println("======================");
        int sum = sp.sumFormTo(1,100);
        System.out.println(sum);
        System.out.println("======================");

    }
}
