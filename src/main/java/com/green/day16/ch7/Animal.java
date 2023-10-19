package com.green.day16.ch7;

import com.green.day14.ch6.Car;

import javax.accessibility.AccessibleIcon;

public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }

}

class AnimalTest {
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값 담을 수 있다.
        Dog d1 = new Bulldog();
        Bulldog bulld1 = (Bulldog) d1;
        Animal ani1 = new Bulldog();
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();
        System.out.println("End");
        //2. 자식 타입은 부모 객체 주소값 담을 수 없다.
        //Bulldog bull1 = new Dog();

        //3.타입은 알고 있는 메소드만 호출 할 수 있고,
        //호출이 된다면 객체 기준이다.
        Bulldog bull3 = new Bulldog();
        bull3.jump();
        bull3.crying();

        Dog dog2 = new Bulldog();


    }
}
class AnimalTest3 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog);
        Cat cat = (Cat) ani;
    }
}

class AnimalTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();
        Animal ani = new Animal();
        Animal ani2 = new Bulldog();
        ((Bulldog)ani2).jump();
        callCrying(ani);
        callCrying(dog);
        callCrying(bulldog);
        callCrying(cat);

        //Cat cat2 = (Cat)ani;
    }
    private static void callCrying(Animal ani){
        ani.crying();
        if(ani instanceof Bulldog){
            Bulldog bulldog = (Bulldog)ani;
            bulldog.jump();
        }
    }
}

class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("멍! 멍!");
    }
}

class Bulldog extends Dog {
    public void jump() {
        System.out.println("불독이 점프");
    }
    @Override
    public void crying(){
        System.out.println("불독이 왈 왈");
    }

}

class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("야옹! 야옹!");
    }
}
