package com.green.day14.ch6;

import java.util.Arrays;

public class CardDeck {
    Card[] cards;//전역변수로 호출한것

    //지역변수로 호출하면 그 지역을 벗어나면 값을 버리기때문이다.
    public CardDeck() {
        //Card[] cards; = 지역변수로 호출 한 것.
        cards = new Card[52];
        int x = 0;
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int z = 1; z <= 13; z++) {
                String denomination = getNumberFromInt(z);
                cards[x++] = new Card(pattern, denomination);
            }
        }
    }

    private String getNumberFromInt(int n1) {
        //private는 같은 클래스에서만 사용가능.
        //static은 this.을 사용 할 수 없다.
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

    public void printAll() {
        for (int i = 0; i < cards.length; i++) {
            Card c = cards[i];
            c.printMySelf();
        }
    }

    public Card getCard() {
        Card c = null;
        while (true) {
            int x = (int) (Math.random() * cards.length);
            c = cards[x];
            if (c != null){
                cards[x]=null;
                break;
            }
        }
        return c;
    }
}