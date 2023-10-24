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
    @Override
    public void run(){
        System.out.println("로봇이 달린다.");
    }
}
