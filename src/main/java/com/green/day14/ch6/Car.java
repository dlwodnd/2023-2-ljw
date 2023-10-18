package com.green.day14.ch6;

public class Car {
    String color;
    String gearType;//변속기 종류 - auto , manual
    int door;//문 개수

    public Car() {
        this("white");
    }

    public Car(String color) {//오버로딩된 생성자.
        this(color, "auto", 4);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public void printMySelf() {
        System.out.printf("color = %s, gearType = %s, door = %d", color, gearType, door);
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Blue");
        car1.printMySelf();
        car2.printMySelf();
    }
}