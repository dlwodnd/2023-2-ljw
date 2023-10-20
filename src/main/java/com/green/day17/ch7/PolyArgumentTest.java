package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Tv tv = new Tv(); //Tv
        System.out.println(tv);
        //price에는 100이 저장 , bonusPoint 10 저장
    }
}

class Product {
    private int price;
    private int bonusPoint;
    public Product(int price){
        this.price = price;
        bonusPoint = this.price/10;
    }
    @Override
    public String toString(){
        return String.format("price : %d, bonusPoint : %d",price,bonusPoint);
    }
}
class Tv extends Product{
    public Tv(){
        super(100);
    }
    @Override
    public String toString(){
        return "Tv, " + super.toString();
    }

}
