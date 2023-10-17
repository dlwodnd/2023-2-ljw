package com.green.day14.ch6;

public class Car2 {
    String color = "ddd";
    //{color = "aaa";}
    //변수 초기화의 우선 순서는 1명시적  2초기화블럭 3생성자 순으로 되어 결과는 생성자가 지정한 값으로 나온다.
    String gearType;
    int door;
    public Car2(String color){

    }

    public Car2() {

    }

    public Car2(Car2 c1) {
        color = c1.color;
        gearType = c1.gearType;
        door = c1.door;
    }

    public void printMySelf() {
        System.out.printf("color = %s, gearType = %s, door = %d\n", color, gearType, door);
    }
}

class Car2Test {
    public static void main(String[] args) {
        int i = 0;//지역변수는 사용하기 전에 반드시 초기화 해주어야 한다.
        Car2 c1 = new Car2();
        c1.color = "Black";
        c1.gearType = "Manual";
        c1.door = 5;

        Car2 c2 = new Car2(c1);

        c1.printMySelf();//color black, geartype manual, door 5
        c2.printMySelf();
    }
}