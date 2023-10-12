package com.asdf;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] x = {24,32,21,42,7,2,65,22};
        for (int i = 0 ; i < x.length ; i++){
            for (int j = i + 1 ; j < x.length ; j++){
                if (x[i] > x[j]){
                    int num = x[i];
                    x[i] = x[j];
                    x[j] = num;
                }
            }
        }
        System.out.println(Arrays.toString(x));




    }
}
