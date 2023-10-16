package com.green.day13.ch6;

class Card2 {
    String pattern;
    String denomination;
    public void printYourSelf(){
        System.out.printf("%s-%s\n",pattern,denomination);
    }
}

public class CardTest3Result {
    public static void main(String[] args) {

        Card2 [] cards = makeCards();
        for (Card2 x : cards){
            x.printYourSelf();
        }
    }
    public static Card2[] makeCards(){
        Card2[] cArray = new Card2[52];
        String [] pattern ={"Spade","Daiamond","Heart","Club"};
        for(int i = 0 ; i < cArray.length ; i++){
            String kind = pattern[i / 13];
            String num = cardnum((i + 1) % 13);
            cArray[i] = new Card2();
            cArray[i].pattern = kind;
            cArray[i].denomination = num;
        }
        return cArray;
    }
    public static String cardnum(int n1) {
        switch (n1) {
            case 0:
                return "K";
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
        }
        return String.valueOf(n1);
    }

}
