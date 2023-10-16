package com.green.day12.ch6;


import com.green.day13.ch6.CardTest2Rsult;

public class Card {
    public String kind;
    //속성은 정적 담당
    public String number;

    int getScore() {//메소드는 동적담당
        switch (number) {
            case "A":
                return 1;
            case "K":
                return 13;
            case "Q":
                return 12;
            case "J":
                return 11;
        }
        return Integer.parseInt(number);
    }

    public void printYourSelf() {
        System.out.printf("%s (%s)\n",kind, number);
    }
}

