package com.green.day14.ch6;

public class Card {
    String pattern;
    String denomination;

    public Card(String pattern, String denomination) {
        //지역변수와 전역변수의 이름이 같으면 가장 가까운 변수를 호출한다.
        //전역변수는 객체가 살아있는동안 계속 살아있다.
        //지역변수는 호출이 끝나고 나면 값이 사라진다.
        //this.은 주소값 메소드를 호출할때 사용한다.
        //this ()는 생성자를 호출 할때 사용한다.
        this.pattern = pattern;
        this.denomination = denomination;
    }


    void printMySelf() {
        System.out.printf("%s (%s)\n", pattern, denomination);
    }

}
