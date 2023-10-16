package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 20;
        changeVal(num);
        changeVal2(num);
        System.out.println("main : " + num);
        System.out.println("==================");
        NumBox box = new NumBox();
        //new + 클래스는 객체주소 복사.
        box.num = 10;
        NumBox box2 = copyObj(box);
        changeVal(box);
        System.out.println(box.num);


    }
    public static NumBox copyObj(NumBox n1){
        n1.num = 10;
        return n1;
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
        dd = new NumBox();
        dd.num = 10;
    }
}

class NumBox {
    int num ;
}
