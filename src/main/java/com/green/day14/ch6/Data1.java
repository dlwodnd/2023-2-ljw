package com.green.day14.ch6;

public class Data1 {
    private int value;
    private int value2;
    private int value3;
    //private 를 넣으면 주소값 복사로하는 접근이 =으로는 불가능 해진다.
    //private 를

    public Data1() {
        //기본생성자. 기본생성자는 파라미터가 없다.
        //생성자의 이름은 클래스의 이름과 같다
        //생성자는 리턴값이 없다.
        //생성자가 하나도 없을때 컴파일러가 기본생성자를 자동으로 넣어준다.
        //기본생성자와 파라미터 생성자를 같이 쓰고 싶으면 둘다 입력 해야한다.

        //기본 생성자의 존재이유
        //1 멤버필드 값을 객체생성과 동시에 밀어넣을 수 있다.
        //2 객체를 생성할 수 있다.
        //value = 100;
        //value2 = 200;
        //value3 = 300;
        //this.은 주소값. 과 같은 개념이다.
        //this() 생성자를 오버로딩해서 호출한다.
        this(100,200,300);
    }

    public void printMySelf() {
        System.out.printf("value : %d. value2 : %d. value2 : %d\n ", value, value2, value3);
    }

    public Data1(int a, int b, int c) {
        value = a;
        value2 = b;
        value3 = c;

    }

    public Data1(int... a) {
    }
}

class ConstructocTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        data1.printMySelf();

        Data1 data1_2 = new Data1(10, 20, 30);
        data1_2.printMySelf();
        //기본 생성자의 존재이유
        //1 멤버필드 값을 객체생성과 동시에 밀어넣을 수 있다.
        //2 객체를 생성할 수 있다.
    }
}