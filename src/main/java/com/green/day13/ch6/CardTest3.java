package com.green.day13.ch6;

import com.green.day4.ch4.Switch;

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
        for (Card x : cards){
            x.printYourSelf();
        }
    }
    public static Card[] makeCards(){
        Card[] cArray = new Card[52];
        String [] pattern ={"Spade","Daiamond","Heart","Club"};
        int z = 0;
        for (int i = 0 ; i < pattern.length ; i++){
            for (int j = 1; j <= 13 ; j++){
                String number = cardnum(j);
                Card c = new Card();
                c.denomination = number;
                c.pattern = pattern[i];
                cArray[z++] = c;
            }
        }
        return cArray;
    }
    public static String cardnum(int n1) {
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
