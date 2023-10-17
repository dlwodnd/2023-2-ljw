package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //void메소드(정확한 값도 없고 =이없기 때문이다)
        //Card c1 = cd.getCard();

        for(int i = 0 ; i < 10 ; i++){
            Card c = cd.getCard();
            c.printMySelf();
        }
        cd.printAll();


    }
}
