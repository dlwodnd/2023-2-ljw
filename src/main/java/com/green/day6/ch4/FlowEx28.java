package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
        System.out.println("answer : " + answer);
        Scanner scan = new Scanner(System.in);
        while (input != answer) {
            System.out.println("1~100사이의 숫자를 입력하세요");
            input = scan.nextInt();
            if (input > answer) {
                System.out.println("DOWN");
            } else{
                System.out.println("UP");
            }
        }
        System.out.println("끝!!");
    }
}
