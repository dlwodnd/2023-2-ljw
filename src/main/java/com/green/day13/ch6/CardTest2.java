package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2 {
    public static void main(String[] args) {

        Card[] cards = makecard();
        System.out.println(cards.length);
        //52개의 배열 만들기
    }

    public static Card[] makecard() {
        String[] x = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        Card[] num = new Card[52];
        Card spa = new Card();


        //Spade, Heart, Dia ,Club
        //A, 2~10 J, Q, K
        return num;
    }
}

