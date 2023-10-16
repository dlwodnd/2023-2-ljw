package com.green.day13.ch6;

public class OverLoadingTest {
    public static void main(String[] args) {
        System.out.println();
    }
    void print(){}
    void print(int n1,int n2 ,int n3){}

    void print(int n1, String str2){}
    void print(String str2 , int n1){}
}
