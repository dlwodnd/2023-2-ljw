package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {
    int[] plusMap(int[] n1, int n2) {
        int[] xarr = new int[n1.length];
        int i = 0;
        for (int arr : n1) {
            xarr[i] = arr + n2;
            i++;
        }
        return xarr;
    }

    void plusOrigin(int[] arr, int n1) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += n1;
        }
    }

    int[] randomValFromTo(int arr, int min, int max) {
        int[] arr2 = new int[arr];
        for (int i = 0; i < arr; i++) {
            int x = (int) (Math.random() * (max - min + 1)) + min;
            arr2[i] = x;
        }
        return arr2;
    }

    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = {10, 20, 30};
        int[] rArr1 = me4.plusMap(arr, 14);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr1));
        System.out.println("=====================(비파괴)");


        me4.plusOrigin(arr, 4);
        System.out.println(Arrays.toString(arr));
        System.out.println("======================(파괴)");
        // 배열크기, 랜덤 min , 랜덤 max
        int[] rArr2 = me4.randomValFromTo(10, 5, 20);
        System.out.println(Arrays.toString(rArr2));

    }
}
