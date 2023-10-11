package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int n1) {
        //System.out.println(n1 == 0 ?"0이 맞습니다.":"0이 아닙니다.");
        if (n1 == 0) {
            System.out.println("0이 맞습니다.");
            return;
        }
        System.out.println("0이 아닙니다.");

    }

    int randomValFormTo(int n1, int n2) {
        return (int) (Math.random() * (n2 - n1 + 1)) + n1;
    }

    void scoreResultPrint(int n1) {
        if (n1 < 0 || n1 > 100) {
            System.out.println("잘못된 점수 입니다.");
            return;
        }
        int x = n1 / 10;
        String grade = "D";
        switch (x) {
            case 10, 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;

        }
        System.out.printf("%s학점입니다.",grade);
    }
}
