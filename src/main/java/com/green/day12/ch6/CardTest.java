package com.green.day12.ch6;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = "A";

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = "10";
        //c1 과 c2 값은 같을 수 있으나 주소값은 전혀 다르다.

        //A = 1 , J = 11 , Q = 12 , K = 13
        System.out.println(c1.getScore());//1
        System.out.println(c2.getScore());
    }

}
