package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMisson {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[");
            } else if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
                break;
            }
            System.out.print(arr[i] + " ,");
        }
    }
}
