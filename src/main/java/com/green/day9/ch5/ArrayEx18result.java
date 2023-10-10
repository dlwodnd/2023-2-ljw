package com.green.day9.ch5;

public class ArrayEx18result {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
        };
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            int[] arr = score[i];
            for (int j = 0; j < arr.length; j++) {
                int x = arr[j];
                System.out.printf("score[%d][%d] = %d\n", i, j, arr[j]);
                sum += x;
            }
        }
        System.out.println("sum : " + sum);
    }
}
