package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int total = 0;
        int[] score = {100, 88, 100, 100, 90};//과목 점수
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        int avr = total / score.length;
        System.out.printf("총점 = %d , 평균 = %d", total, avr);

    }
}
