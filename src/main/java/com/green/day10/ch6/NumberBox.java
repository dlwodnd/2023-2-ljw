package com.green.day10.ch6;

public class NumberBox {
    void sum(int n1, int n2) {
        //정의 하는 부분에서는 일일히 변수를 선언해 줘야 한다.
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
        //값을 정의
        //객체는 속성과 메소드. 속성은 변수 선언을 해야 존재하는것
    }

    void minus(int n1, int n2) {//선언부
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));//구현부
    }

    void abs(int n1) {
        System.out.println(n1 < 0 ? -n1 : n1);
    }
    //모든 메소드는 return이라는 키워드를 만나야 한다.
    //보통은 return은 생략되어 실행된다.
}
