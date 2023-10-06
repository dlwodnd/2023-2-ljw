package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7_1 {
    public static void main(String[] args){
        //1. 정수 10개를 저장할 수 있는 배열을 만든다.
        //0~9값을 순차적으로 대입한다.
        int [] x = new int [10];
        for (int i = 0 ; i < x.length ; i++){
            x[i] = i;
        }
        System.out.println(Arrays.toString(x));
    }
}
