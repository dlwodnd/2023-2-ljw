package com.asdf;

import java.util.Arrays;

public class StringFunction {
    public static void main(String[] args) {
        //(String값).toLowerCase = String 문자열 값을 소문자로 바꾸는방법
        //(String값)toUpperCase() = String 문자열 값을 대문자열로 바꾸는방법
        //split(String regex(구분자));
        // -> 구분자를 바탕으로 배열 형식으로 문자열을 잘라줍니다
        //split(String regex(구분자), int limit(배열에 값의 개수));
        // -> 위와 마찬가지로 구분자를 바탕으로 배열 형식으로 문자열을 자르지만 limit 수만큼 잘라줍니다
        //.substring(x) = 문자열을 문자열x번 부터 끝까지의 값을 받고 싶을떄 사용한다.
        //.substring( x , y ) = 문자열을 x번째 부터 y까지 호출한다.
        //String x.contains(String y) = x 문자열에 y가 포함이 되어있는지 확인하는 작업.
        //String x.replaceAll("x", "y") = x문자열에 포함된 x 값음 y로 변환시킨다.
        String x = "1a2s4d5f7g8";
        String[] y = x.split("");
        int [] arr = new int[20];
        int z = 0;
        x.toCharArray();
        x.charAt(0);
        boolean b = 10 < 20;
        System.out.println(b);





    }


}
