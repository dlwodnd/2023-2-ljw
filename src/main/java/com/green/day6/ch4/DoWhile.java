package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        do{
            System.out.println("1~100사이의 숫자 입력 >>");
            input = scan.nextInt();
            sum += input;
        }while (input != 0);
        System.out.println("끝");
    }
}
