package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox();
        //new 는 객체 생성. 클래스이름+()은 주소값 지정이다.
        nb1.sum(10, 20);
        nb1.sum(30, 40);//아규먼트(파라미터)
        //결과를 호출
        nb1.minus(40, 20);

        nb1.abs(50);

    }
}
