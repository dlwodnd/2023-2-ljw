package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.print(9); //n단 구구단 콘솔에 출력
        System.out.println("===================");
        gugudan.printFromTo(4,5);
        System.out.println("===================");

        gugudan.printFromTo(2,11,"--------------");
    }
}
