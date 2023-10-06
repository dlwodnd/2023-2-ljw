package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMissonResult {
    public static void main(String[] args){
        int[] arr = {5,10,7,3};
        int x = arr.length -1;
        System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for(int i = 0 ; i < arr.length ; i++){
            if (i == x){
                System.out.print(arr[i]+"]");
                break;
            }
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
        System.out.println("-------------------------------");
        System.out.print("[");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print( i < x ? arr[i] + ", " : arr[i]);
        }
        System.out.println("]");
        System.out.println("-----------------");


    }
}
