package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMisson {
    public static void main(String[] args) {
        int[] arr1 = new int[6];

        for (int i = 0; i < arr1.length; i++) {

            int a = (int) (Math.random() * 10) + 1;

            arr1[i] = a;

            for (int b = 0; b < i; b++) {

                if (arr1[i] == arr1[b]) {

                    i--;

                    break;
                }
                System.out.printf("i = %d : b = %d\n", i, b);
                System.out.printf("arr1[i] = %d : arr1[b] = %d\n", arr1[i], arr1[b]);

            }


        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d\t", arr1[i]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}



