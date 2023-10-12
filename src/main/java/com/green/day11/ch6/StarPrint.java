package com.green.day11.ch6;

import com.green.day4.ch4.CharAt;

public class StarPrint {
    void line(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int a) {
        for (int i = 0; i < a; i++) {
            /*
            for(int j = 0 ; j < a ; j++){
                System.out.print("*");
            }
            System.out.println();
             */
            line(a);
            //같은 class 에 있는 메소드도 호출 가능하다.
        }
    }

    void triangle(int a) {
        for (int i = a; i > 0; i--) {
            line(a - i + 1);
        }
    }
    String shkGenderById(String a){
        char x = a.charAt(7);
        switch (x){
            case '2','4':
                return "여성";
            case '1','3':
                return "남성";
        }
        return "유효하지 않은 주민번호";
    }
    int sumFormTo(int min ,int max){
        int sum = 0;
        for (int i = min ; i <= max ; i++){
            sum += i;
        }
        return sum;
    }
}
