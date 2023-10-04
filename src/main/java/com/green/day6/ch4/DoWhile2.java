package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int input = 0;
            System.out.println("1~100사이의 숫자 입력 (종료:0) >>");
            input = scan.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println("끝" + sum);
    }
}
