package com.green.day10.ch6;

public class Tv {
    String color;
    boolean power;
    int channel;
    //속성, 멤버필드, property


    void power() {
    //선언부
    //void[리턴타입] power[메소드명]()[파라미터(매게변수)]
        power = !power;//구현부
    }//이렇게 까지를 정의했다고 한다.

    void channerUP() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
    //멤버메소드, 메소드

}
