package com.green.day12.ch6;

public class Gugudan {
    void print(int n1) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n1, i, n1 * i);
        }
    }
    void printFromTo(int n1 , int n2){
        for (int i = n1 ; i <= n2 ; i++){
            print(i);
            System.out.println();
        }
    }
    void printFromTo(int n1, int n2 , String x){
        for (int i = n1 ; i <= n2 ; i++){
            print(i);
            System.out.println(x);
        }
    }
}
