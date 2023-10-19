package com.green.day15.ch7;


import com.green.day14.ch6.Car;

class Card {
    static int pick = 0;
    static final int KIND_MAX = 4;//카드 무늬의 수.
    //상수는 한번 입력된 값이 변하지 않는 것
    //리터럴은 값 그자체
    static final int NUM_MAX = 13;//무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLUVER = 1;
    int kind;
    int number;

    public Card() {
        this(SPADE, 1);
    }

    public Card(int c1, int n1) {
        kind = c1;
        number = n1;
    }
    @Override
    public String toString(){
        //String.format() = printf와 다르게 값을 출력하는 것이 아니라 값을 String 값으로 바꿔준다.
        return "kind : " + kind + ", number : " + number;
    }
}
class Deck{
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];
    int [] card = {Card.SPADE,Card.DIAMOND,Card.HEART,Card.CLUVER};
    public Deck(){
        int num = 0;
        for(int i = 0 ; i < Card.KIND_MAX ; i++){
            int kindnum = card[i];
            for (int j = 1; j <= Card.NUM_MAX ; j++){
                cardArr[num++] = new Card(kindnum,j);
            }
        }
    }
    public void printall(){
        for (int i = 0 ; i < cardArr.length ; i++){
            System.out.println(cardArr[i]);
            System.out.println(i);
        }
    }
    public Card pick(){
        int x = (int)(Math.random() * cardArr.length);
        return pick(x);
    }
    public Card pick(int n1 ){
        return cardArr[n1];
    }
    public void shuffle(){
        for (int i = 0 ; i < cardArr.length ; i++){
            int x = (int)(Math.random() * cardArr.length);
            Card c = cardArr[x];
            cardArr[x] = cardArr[i];
            cardArr[i] = c;
        }
    }
        }
public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
    }
}
