package com.green.day5.ch4;

public class RandomValMission {
    public static void main(String[] args) {
        final int MIN = 0, MAX = 1;

        //MIN MAX 상수만 사용하여
        //MIN ~ MAX나올 수 있는 랜덤 숫자를 만드는 로직을 구연하세요.


        for (int i = 0; i < 2000; i++) {
            int Val = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("Val : " + Val);
            if (Val < MIN || Val > MAX) {
                System.out.println("범위를 벗어났습니다.");

            }

        }
    }
}
