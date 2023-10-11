package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4Result {
    public static void main(String[] args) {
        String[][] word = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
        };
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < word.length; i++) {
            int a = 1;
            String[] wordArr = word[i];
            System.out.printf("Q%d. %s의 뜻은?\n", i + 1, wordArr[0]);
            String str = scan.nextLine();
            if (!str.equals(wordArr[a])) {
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n", wordArr[a]);
                i--;
            }
            System.out.println("정답입니다.");
        }
    }
}

