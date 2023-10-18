package com.green.day15.ch7;

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUP() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}
class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
    @Override//오버라이딩 하는 경우에는 이걸 입력하면 착각하지 않는다.
    void channelUP(){//오버라이딩
        //오버라이딩을 할때는 구현부와 객체명이 동일해야한다.
        //상위 클래스 객체를 사용하지 않고 현재 클래스의 객체를 사용하겠다.
        channel += 2;
    }
}

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n", cTv.power);
        cTv.channel = 10;
        cTv.channelUP();
        System.out.printf("cTv.channel : %d\n",cTv.channel);
        cTv.displayCaption("반갑다 친구들");
        cTv.caption = true;
        cTv.displayCaption("sdsadsdasds");
    }
}
