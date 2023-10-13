package com.green.day12.ch6;

public class Card {
    String kind;
    String number;
    int getScore(){
        switch(number){
            case "A":
                return 1;
            case"K":
                return 13;
            case"Q":
                return 12;
            case"J":
                return 11;
        }
        return Integer.parseInt(number);
    }
}
