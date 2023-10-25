package com.green.day20.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
        //method1();
        try {
            method2();

        } catch (Exception e) {
            System.out.println("method2 예외 발생");
        }

    }

    static void method1() {
        int a = 10 / 0;
    }

    static void method2() throws Exception {
        //메소드 옆에 throws를 붙히면 에러 발생시 일단 던져버린다.
        int a = 10 / 0;
    }
}

class ExceptionEx12_2 {
    public static void main(String[] args){
        try {
            method1();
        } catch (Exception e) {

        }
    }
    static void method1() throws Exception{
        method2();
    }

    static void method2() throws Exception {
        int a = 10 / 0;
    }
}
