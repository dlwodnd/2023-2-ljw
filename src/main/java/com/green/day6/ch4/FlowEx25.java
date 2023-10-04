package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요.(예:1234)");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.println(num);

        while (num != 0) {
            sum += num % 10; //sum = sum + num % 10
            /*
            int modVal = num % 10;
            sum += modVal;
            num = num / 10;
            */
            num /= 10;
        }
        System.out.println("결과 >>" + sum);


    }
}
