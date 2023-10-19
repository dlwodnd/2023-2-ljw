package com.green.day15.ch7;

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;//토글, 호출할 때 마다 항상 반대값을 주는 것
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
    @Override//오버라이딩 에노테이션 : 오버라이딩이 정확하게 되지 않았을 경우 오류가 난다.
    void channelUP(){//오버라이딩
        //오버라이딩을 할때는 구현부와 메소드명이 동일해야한다.
        //상위 클래스 메소드를 사용하지 않고 현재 클래스의 메소드를 사용하겠다.
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
        /*
        private 같은 class 안에서만 접근가능, 멤버필드에는 private를 필수로 넣는다.

        default 같은 class와 같은 pakage에서만 접근가능

        protected 같은 class와 같은 pakage와 같은 상속 끼리만 접근가능

        public 모든 경우 접근가능

         */
    }
}
