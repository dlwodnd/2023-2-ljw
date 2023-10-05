package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {
        //for문은 몇번 돌려야 하는지 알떄
        for (int i = 1; i <= 10; i++) {
            System.out.println("for=" + i);
        }
        System.out.println("-----------------");
        //while문은 언제 멈춰야 하는지 알때
        int i = 10;
        while (i >= 0) {
            System.out.println("while=" + i--);
        }
    }
}
