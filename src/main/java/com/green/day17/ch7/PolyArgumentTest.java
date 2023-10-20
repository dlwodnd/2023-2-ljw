package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonusPoint = c.getBonusPoint();
        System.out.printf("%d : %d\n", price, bonusPoint);
        Tv tv = new Tv();
        int tvprice = tv.getPrice();
        int tvbonusPoint = tv.getBonusPoint();
        System.out.printf("%d : %d\n", tvprice, tvbonusPoint);
    }
}

class PolyArgumentTest2 {

    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer);
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        //buyer


        //buyer money가 부족하면 "잔액 부족" money 값 마이너스 처리x
        //잔액이 부족하지 않으면 Tv를 구입하셨습니다. > money마이너스처리, bonusPoint 플러스 처리;
    }
}

class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
        money = 1050;
        bonusPoint = 0;
    }

    public void buy(Product p1) {
        if (this.money < p1.getPrice()) {
            System.out.printf("잔액이 부족합니다. (현재 잔액 %d)\n",money);
            return;
        }
        this.money -= p1.getPrice();
        this.bonusPoint += p1.getBonusPoint();
        System.out.printf("%s을(를) 구입하셨습니다. (현재 잔액 %d)\n",p1,money);
        System.out.printf("%d포인트 적립. (총 포인트 %d)\n",p1.getBonusPoint(),bonusPoint);
    }

    @Override
    public String toString() {
        return String.format("money : %d, bonusPoint : %d", money, bonusPoint);
    }
}

class Product {
    private int price;
    private int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = this.price / 10;
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("price : %d, bonusPoint : %d", price, bonusPoint);
    }
}

class Tv extends Product {
    public Tv() {
        super(100);//하드코딩
    }

    @Override
    public String toString() {
        return "Tv";
    }

}

class Computer extends Product {
    public Computer() {
        super(200);
    }

    public String toString() {

        return "Computer";
    }
}
