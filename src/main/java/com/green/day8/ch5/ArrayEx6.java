package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 10, 55, 95, 100, 200};
        int min = 0;
        int max = 0;
        //score 안에서 min값과 max값을 구해주세요
        for (int i = 0; i < score.length; i++) {
            for (int z = 0; z < i; z++) {
                if (score[i] > score[z]) {
                    max = score[i];
                }
            }
        }
        System.out.printf("min = %d , max = %d ", min, max);

    }
}
