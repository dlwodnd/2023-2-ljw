package com.green.day13.ch6;

public class MyMath2 {
    int num;
    static int staticNum;
    //static은 다른 영역에 저장하고 static은 공간이 하나다.
    //static은 객체 생성과는 상관없다.new 를 사용하지 않아도 사용 가능하다.
    static void print(){//static 메소드는 인스턴스 변수를 사용 할 수 없다.
        System.out.printf("staticNum = %d\n",staticNum);
    }
    void print2(){
        System.out.printf("staticNum = %d : num = %d",staticNum,num);
        //같은 class안에 있는 static 메소드는 class명을 생략 가능하다.
        //다른 class 에서는 class명.메소드명을 사용해야한다.
    }
}
