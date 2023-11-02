package com.green.second.day1;

import org.checkerframework.checker.units.qual.C;

import java.util.*;


public class CardDeck {
    //Card 객체 주소값 여래개 저장할 수있는 배열x
    private List<Card> list;

    public CardDeck(){
        list = new ArrayList<>();
        String[] pattern = {"Spade","Heart","Diamond","Clover"};
        for(int i = 0; i < pattern.length; i++){
            for(int j = 1; j <=13; j++ ){
                String x = Card.getNumberFromInt(j);
                Card c = new Card(pattern[i],x);
                list.add(c);
            }
        }
    }
    public void PrintCard(){
        for(Card c : list){
            System.out.println(c);
        }
    }
}
