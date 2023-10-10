package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
                , {51, 52, 53}
        };
        int[] x = new int[score.length];
        /*
        번호 국어 영어 수학 총점 평균
         */
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("--------------------------");
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            System.out.printf("%d\t", i + 1);
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("%d\t", score[i][j]);
            }
            x[i] = sum;
            float avg = (float)x[i] / score[i].length;
            System.out.printf("%d\t%.1f\t",x[i],avg);
            System.out.println();
        }
        System.out.print("총점\t");
        for (int i = 0 ; i< score[0].length ; i++){
            int sum = 0;
            for (int j = 0 ; j < score.length ; j++){
                sum+=score[j][i];
            }
            System.out.printf("%d\t",sum);
        }
        System.out.println(Arrays.toString(x));
    }
}
