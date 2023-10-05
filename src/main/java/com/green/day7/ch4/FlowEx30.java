package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[ ] args){
        //반복문
        //
        int sum = 0;
        int i = 0;
        //i 값이 계속 증가되면 sum에 중첩으로 더하기
        //sum 값이 100 초과가 되는 시점의 i 값
        asd:
        while (true){
            sum += ++i;
            if (sum > 100){
                break asd;
            }

        }
        System.out.println("sum : " + sum);
        System.out.println("i : " + i);
    }
}
