package com.green.day16.ch7;

public class Singleton {
    static int num;
    private Singleton(){
        num++;
    }
    private static Singleton singleton;
    //singleton 객채생성 하나로 돌려쓰는 방법. 객체생성 여러번 하지 않겠다.
    public static Singleton getInstance(){
        singleton = new Singleton();
        return singleton;
    }
    static void print(Singleton s1){
        System.out.println(s1.num);
    }
}
class SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton.print(s1);
        Singleton.print(s2);
    }
}
/*
다형성을 이해하기 위해 필요한 것
1. 부모 타입은 자식 객체 주소값 담을 수 있다.
2. 자식 타입은 부모 객체 주소값 담을 수 없다.
3. 타입은 알고 있는 메소드만 호출 할 수 있고,
호출이 된다면 객체 기준이다.
 */

