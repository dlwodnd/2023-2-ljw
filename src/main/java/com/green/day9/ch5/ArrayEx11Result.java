package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11Result {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];
        //numArr 각 방에 0~9 사이의 랜덤한 값을 대입한다
        //cntArr의 0번 방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다
        //0~9의 개수를 출력
        for (int i = 0; i < LEN; i++) {
            int random = (int) (Math.random() * LEN);
            numArr[i] = random;
        }
        System.out.println(Arrays.toString(numArr));
        for (int i = 0; i < LEN; i++) {
            int val = numArr[i];
            cntArr[val]++;
        }
        System.out.println(Arrays.toString(cntArr));
    }
}

