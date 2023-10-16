package com.green.day13.ch6;

public class VarArgEx {
    public static void sum(int ... n){//가변함수.이때 n은 배열로 적용이 된다.
        int x = 0;
        for (int i = 0 ; i < n.length ; i++){
            x += n[i];
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
        sum(10,20,30);
        sum(10,20,30);
        sum(10,20,30);

    }
}
