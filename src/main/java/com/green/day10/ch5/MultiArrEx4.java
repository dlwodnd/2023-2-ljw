package com.green.day10.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] word = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
        };
        Scanner scan = new Scanner(System.in);
        for (int i = 0 ; i < word.length ; i++){
            int a = 1;
            System.out.printf("Q%d. %s의 뜻은?\n",i+1,word[i][0]);
            String str = scan.nextLine();
            if (str.equals(word[i][a])){
                System.out.println("정답입니다.");
            }
            else{
                System.out.printf("틀렸습니다. 정답은 %s입니다.",word[i][a]);
                i--;
            }


        }


    }
}

