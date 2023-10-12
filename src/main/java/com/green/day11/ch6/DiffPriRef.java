package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 20;
        changeVal(num);
        changeVal2(num);
        System.out.println("main : " + num);
        System.out.println("==================");
        NumBox box = new NumBox();
        box.num = 20;
        changeVal(box);
        System.out.println(box.num);


    }

    public static void changeVal(int n1) {
        int num = 30;
        System.out.println("changeVal : " + num);

    }
    public static void changeVal2(int n2){
        int num = 40;
        System.out.println("changeVal : " + num);
    }

    public static void changeVal(NumBox dd) {
        System.out.println("changeVal - NumBox");
        dd.num = 10;
        dd = new NumBox();
    }
}

class NumBox {
    int num;
}
