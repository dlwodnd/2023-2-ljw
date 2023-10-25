package com.green.day19.ch7.starcraft2;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobot();
        Runnable2 run2 = new Runnable2() {
            //Runnable2 run = new RunRobot();와 동일하나 이름이 없는 클래스이다.
            //만들 때 마다 값을 다르게 하고 싶을 때 사용한다.
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };
    }
}
interface Runnable2 {
    void run();
}
class RunRobot implements Runnable2{
    //보통은 인터페이스를 implements한 클래스 이름 뒤에는 Impl을 추가해서
    //이름을 보고 인터페이스를 상속했다고 추측 할 수 있도록 만든다.
    @Override
    public void run(){
        System.out.println("로봇이 달린다.");
    }
}
