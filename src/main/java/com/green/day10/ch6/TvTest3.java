package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();

        Tv tv2 = new Tv();
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        tv1.channerUP();
        //디파인 메소드.콜 메소드
        tv1.channerUP();
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        System.out.printf("tv1.channel : %d\n", tv2.channel);
        /*
        steck메모리는 퍼스트 인 라스트 아웃이라고 설명한다.
        steck 메모리는 넣을때 1 2 3 순으로 넣고 빠져나올때는 3 2 1순으로 나온다.
        heap 메모리는 퍼스트 인 퍼스트 아웃 이라고 설명한다.
        heap 메모리는 1 2 3 순으로 넣고 1 2 3 순으로 빠져나온다.
        */


    }
}
