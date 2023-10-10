package com.green.day9.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        /*
        3개의 String 값을 담을 수 있는 배열을 생성,
        3번 문자열로 입력을 받는다.(Scanner 이용)
        입력받은 문자열들을 순차적을 배열에 값을 넣는다
        값 넣는게 종료가 되면 향상된 for 문을 이용하여
        저장 되어있는 값들을 콘솔에 출력한다
        */
        Scanner scan = new Scanner(System.in);
        String[] name = new String[3];
            for (int i = 0; i < name.length; i++) {
                System.out.println("문자열");
                String x = scan.nextLine();
                name[i] = x;
            }
        for(String strArr : name){
            System.out.println(strArr);
        }
        System.out.println(Arrays.toString(name));
    }
}
