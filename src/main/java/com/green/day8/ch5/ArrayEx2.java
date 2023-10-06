package com.green.day8.ch5;

public class ArrayEx2 {
    public static void main(String[] args) {
        //5개 방을 가지고 있는 정수형 배열을 만들고
        //각 방의 1~10의 랜덤한 값을 넣어주세요
        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            int a = (int) (Math.random() * 10) + 1;
            arr1[i] = a;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);

        }
    }
}
