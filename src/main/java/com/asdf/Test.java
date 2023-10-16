package com.asdf;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] sides = {3, 6, 5};
        for (int i = 0; i < sides.length - 1; i++) {
            for (int j = i + 1; j < sides.length; j++) {
                if (sides[j] > sides[i]) {
                    int max = sides[j];
                    sides[j] = sides[i];
                    sides[i] = max;
                }
            }
        }
        System.out.println(Arrays.toString(sides));


    }
}
