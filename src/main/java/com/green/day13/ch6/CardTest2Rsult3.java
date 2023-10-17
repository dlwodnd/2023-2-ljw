package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2Rsult3 {
    public static void main(String[] args) {

        Card[] cards = makecard();
        System.out.println(cards.length);
        for (Card c : cards) {
            c.printYourSelf();
        }
        //52개의 배열 만들기
    }

    public static Card[] makecard() {
        Card[] cards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;
        for (int z = 0; z < kinds.length; z++) {
            for (int i = 1; i <= 13; i++) {
                String number = getNumberFromInt(i);
                Card c = new Card();
                c.kind = kinds[z];
                c.number = number;
                //cards[i + (z*13) - 1] = c;
                cards[cnt++] = c;
            }
        }
        return cards;
    }

    public static String getNumberFromInt(int n1) {
        switch (n1) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(n1);
    }
}
