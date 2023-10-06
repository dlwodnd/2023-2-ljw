package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) {
        //int[] a;a에 저장 가능한 값은 주소값
        int[] a = {10, 20, 30};
        String[] b = {"A", "B", "C", "D"};

        int[] c = new int[3];//넣은 숫자 만큼의 0이 들어간 방을 만든다.
        int d [] = new int[10];//c언어 스타일 자바도 사용가능하다.

        System.out.println(c[0]);
        System.out.println("a.length :" + a.length);
    }
}
