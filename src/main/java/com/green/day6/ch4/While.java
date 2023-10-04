package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("for=" + i);
        }
        System.out.println("-----------------");
        int i = 10;
        while (i >= 0) {
            System.out.println("while=" + i--);
        }
    }
}
