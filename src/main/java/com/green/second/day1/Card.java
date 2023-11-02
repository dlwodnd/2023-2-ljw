package com.green.second.day1;

public class Card {
    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }
    @Override
    public String toString(){
        return String.format("%s(%s)",pattern,denomination);
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
