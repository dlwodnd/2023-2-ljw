package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        /*
        (1) square
        (2) tri
        (3) log
        원하는 메뉴(1~3)를 선택하세요. (종료 = 0) >>
        */
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("원하는 메뉴(1~3)를 선택하세요. (종료 = 0) >>");
            int num = scan.nextInt();
            if (num > 0 && num < 4) {
                System.out.printf("선택하신 메뉴는 %d번 입니다\n", num);
            } else if (num == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("숫자를 잘못 입력하셨습니다.");
            }
        }
    }
}