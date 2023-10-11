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
                //int x = arr[j];
                int val = score[i][j];
                System.out.printf("score[%d][%d] = %d\n", i, j, arr[j]);
            }
        }
        System.out.println("sum : " + sum);
        System.out.println("====================");
        //향상된 for 문으로 sum 값을 구하는법.

        for (int[] arr : score) {
        /*for (int i = 0; i < score.length; i++) {
            int[] arr = score[i];}
            와 같은 식
            */
            for (int val : arr) {
            /*
            for (int j = 0; j < arr.length; j++) {
                int val = score[i][j];
                }
                와 같은 식
             */
                sum += val;
            }
        }
        System.out.println("sum : " + sum);
    }
}
