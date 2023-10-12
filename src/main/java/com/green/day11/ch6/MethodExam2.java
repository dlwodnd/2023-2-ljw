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
        } else if (score == 100) {
            return "A+";
        }
        if (score % 10 > 3) {
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
        //String x = String.format()
        //printf를 스트링 타입으로 만들 수 있다.
    }

    String getSeason(int mon) {
        switch (mon) {
            case 3, 4, 5:
                return "봄";
            case 6, 7, 8:
                return "여름";
            case 9, 10, 11:
                return "가을";
            case 1, 2, 12:
                return "겨울";
        }
        return "없음";
    }

    String getSeason2(int mon) {
        if (mon > 12 || mon < 1) {
            return "없음";
        }
        switch (mon) {
            case 12, 1, 2:
                return "겨울";

        }
        if (mon >= 9) {
            return "가을";
        } else if (mon >= 6) {
            return "여름";
        }
        return "봄";
    }
}
