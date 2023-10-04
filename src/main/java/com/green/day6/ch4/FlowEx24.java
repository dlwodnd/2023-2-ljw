package com.green.day6.ch4;

public class FlowEx24 {
    public static void main(String[] args){
        int i = 11;
        System.out.println("카운트 다운을 시작합니다.");
        while (i-- > 0){
            System.out.println(i);

            for(int x = 1 ; x < 1_000_000_000D ; x++);
        }
        System.out.println("Launch!!");
    }
}
