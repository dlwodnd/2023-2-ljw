package com.green.day2.ch3;

public class OperatorEx24 {
    public static void main(String[] args){

        boolean b1=1==1&&2==2; //and 연산자.
        System.out.println("b1 : "+b1);

        boolean b2=1==1&&2==2&&3==4; //and 연산자.
        System.out.println("b2 : "+b2);

        System.out.println("----------------");

        boolean b3=1==2||2==3||4==4;//or 연산자.
        System.out.println("b3 : "+b3);

        boolean b4=1==2||2==3||4==5;//or 연산자.
        System.out.println("b4 : "+b4);

        //부정연산자
        System.out.println("----------------");

        boolean b5=1==1;
        System.out.println("b5 : "+b5);
        System.out.println("b5 : "+!b5);//true 의 반대 = false
        System.out.println("b5 : "+!!b5);//true 의 반대(false)의 반대 = true

    }
}
