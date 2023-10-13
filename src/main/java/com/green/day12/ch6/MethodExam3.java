package com.green.day12.ch6;

import com.green.day10.ch6.MethodExam;

public class MethodExam3 {

    int sumTest(String str) {
        int sum = 0;
        int num = Integer.parseInt(str);
        while (true) {
            sum += num % 10;
            if (num / 10 == 0) {
                return sum;
            }
            num /= 10;
        }
    }

    int sumTest2(String str) {
        char[] charArr = str.toCharArray();
        //srt.toCharArray() = str의 값의 한자리 한자리를 charArr 의 배열로 만든다.
        int sum = 0;
        for (char ch : charArr) {
            sum += Character.getNumericValue(ch);
            //Character.gteNumericValue(x) = x의 값을 char 에서 정수값 으로 변경 한다.
        }
        return sum;
    }


    public static void main(String[] args) {
        MethodExam3 x = new MethodExam3();
        //MethodExam3 x = MethodExam3 의 주소값을 담을 수 있는 메소드값.
        int sum = x.sumTest("123");
        int sum2 = x.sumTest2("123");
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println("=========================================");

    }
}
