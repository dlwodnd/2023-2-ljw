package com.green.day7.ch4;

public class FlowEx30result {
    public static void main(String[] args) {
        //반복문
        //
        int sum = 0;
        int i = 0;
        int target = 100;
        //i 값이 계속 증가되면 sum에 중첩으로 더하기
        //sum 값이 100 초과가 되는 시점의 i 값

        while (sum < target) {
            sum += i++;
        }
        System.out.printf("sum : %d . i : %d ",sum ,i );
    }
}
