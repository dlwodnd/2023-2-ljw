package com.green.day12.ch6;

import com.green.day7.ch5.Array;

import java.util.Arrays;
public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};
        printArr(arr);
        System.out.println(Arrays.toString(arr));
        sortArr(arr);

        printArr(arr);
        System.out.println(Arrays.toString(arr));
        //.이 없다면 같은 공간에 있고 동급

        sumArr(arr);
        System.out.printf("sum = " + sumArr(arr));
    }

    public static void sortArr(int[] arr1) { //오름차순
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int num = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = num;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        System.out.printf("[%d",arr[0]);
        for (int i = 1 ; i < arr.length ;i++){
            System.out.printf(", %d",arr[i]);
        }
        System.out.println("]");
        System.out.println("================");
    }
    public static int sumArr(int[] arr){
        int num = 0;
        for (int i = 0 ; i < arr.length ; i++){
            num += arr[i];
        }
        return num;
    }
}

