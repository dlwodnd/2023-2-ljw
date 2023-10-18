package com.green.day15.ch7;
class Card{
    static final int KIND_MAX = 4;//카드 무늬의 수.
    //상수는 한번 입력된 값이 변하지 않는 것
    //리터럴은 값 그자체
    static final int NUM_MAX = 13;//무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART= 2;
    static final int CLUVER = 1;
    int kind;
    int number ;
    public Card(){
        this(SPADE ,1);
    }
    public  Card(int c1 , int n1){
        kind =c1;
        number = n1;
    }


}
public class DeckTest {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.printf("c.kind = %d, c.number = %d\n",c.kind,c.number);

        Card c2 = new Card(Card.HEART, 3);
        System.out.printf("c.kind = %d, c.number = %d\n",c2.kind,c2.number);

    }
}
