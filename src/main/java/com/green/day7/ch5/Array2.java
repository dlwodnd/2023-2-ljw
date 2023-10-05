package com.green.day7.ch5;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = {100, 200};
        int[] arr2 = {5, 10, 15};

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr[i]);
        }

        arr = arr2;
        System.out.println("-----");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr[i]);
        }

        System.out.println("arr == arr2 : " + (arr == arr2));
    }
}
