package com.green.day15.ch7;

public class Parent {//extends Object는 상위 클래스에 생략되어있고, Object는 최상위 클래스이다.

    public Parent(){
        super();//Object라는 최상위 클래스가있으므로 상위 클래스도 super를 사용가능하다.
    }
    int age;

}
class Child extends Parent {
    public Child(){
        super();//super와 this의 차이점은 super는 상위 클래스의 객체 값을 참조하는것이고.
                          //this.은 현재 클래스의 객체 값을 참조하는 것이다.
    }
    void play(){
        System.out.println("놀자");
    }
}
class Child2 extends Child{
    public Child2(){

    }
    void jump() {
        System.out.printf("%d살 아이가 점프를 하였다. ",age);
    }
}
class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();

        Child2 c2 = new Child2();
        c2.age = 12;
        c2.jump();

    }
}