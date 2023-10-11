package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4Result2 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
        };
        Scanner scan = new Scanner(System.in);
        int i = 1;
        for (String[] wordArr : words) {
            System.out.printf("Q%d. %s의 뜻은?\n", i++, wordArr[0]);
            String str = scan.nextLine();
            if (!str.equals(wordArr[1])) {
                System.out.printf("틀렸습니다. 정답은 %s입니다.\n", wordArr[1]);
                continue;
            }
            System.out.println("정답입니다.");


        }
    }
}

