package com.green.day11.ch6;

public class MethodExam2 {
    /*
    100초과 0미만은 "점수를 확인해 주세요" 리턴
    A학점 8점이상 + 3점이아 - 나머지 x
    B학점 8점이상 + 3점이아 - 나머지 x
    C학점 8점이상 + 3점이아 - 나머지 x
    D학점 (+-없음)
     */
    String scoreResultOpt(int score) {
        String grade = "D";
        String x = "-";
        if (score > 100 || score < 0) {
            return "점수를 확인해 주세요.";
        } else if (score < 70) {
            return grade;
        } else if (score == 100){
            return "A+";
        }
        if (score % 10 > 3 ){
            x = score % 10 >= 8 ? "+" : "";
        }

        switch (score / 10) {
            case 10, 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
        }
        return grade + x;

    }
}
