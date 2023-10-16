package com.asdf;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int hp = 999;
        int answer = 0;
        if(hp / 5 > 0){
            answer += hp / 5;
            hp = hp % 5;
            System.out.printf("%d : %d\n",answer ,hp);
        }
        if(hp / 3 > 0){
            answer += hp / 3;
            hp = hp % 3;
            System.out.printf("%d : %d\n",answer ,hp);
        }
        answer += hp;
        System.out.printf("%d : %d\n",answer ,hp);



    }
}
