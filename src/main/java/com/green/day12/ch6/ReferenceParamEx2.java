package com.green.day12.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int x = 10;
        System.out.printf("main() : x = %d\n",x);

        change(x);
        System.out.printf("main() : x = %d\n",x);
    }
    static void change(int x){
        x =1000;
        System.out.printf("3 change() : x = %d\n",x);
    }
}
