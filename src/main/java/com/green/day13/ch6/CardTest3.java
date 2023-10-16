package com.green.day13.ch6;

import java.util.Arrays;

class Card {
    String pattern;
    String denomination;
    public void printYourSelf(){
        System.out.printf("%s-%s\n",pattern,denomination);
    }
}

public class CardTest3 {
    public static void main(String[] args) {

        Card [] cards = makeCards();
        System.out.println(Arrays.toString(cards));
    }
    public static Card[] makeCards(){
        Card[] x = new Card[52];
        return x;
    }

}
