package com.green.day10.ch6;

public class TvTest {
    //클래스는 문서 또는 설계도와 같은 역할을 한다.
    //객체는 클래스로 만든 제품과 같으며 인스턴스라고도 불린다.
    public static void main(String[] args) {
        /*
        String str = new String("dd")
        Tv tv3 = str;
        이렇게는 타입이 맞지 않기 때문에 실행되지 않는다.
         */
        Tv tv1 = new Tv();//new는 클래스를 객체화 시키는것.
        //대문자로 시작하는 타입은 래퍼런스 타입
        //래퍼런스 타입은 주소값(객체, 배열의 주소값)만 입력 가능하다.
        //Tv tv1은 Tv객체의 주소값을 사용하기위한 변수선언이다.
        tv1.channel = 10;
        tv1.color = "빨강";
        tv1.power = true;
        //주소값 + . 은 그 주소값에 접근 하고자 하는 동작이다.
        Tv tv2 = new Tv();
        //위의 new Tv와 같은 객체이나 동일하지는 않다.
        //주소값이 동일하지 않으니 다른 값을 줄 수 있다.
        tv2.channel = 20;

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.channel : " + tv1.power);
        System.out.println("tv1.channel : " + tv1.color);
        System.out.println("------------------------------");
        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv2.channel : " + tv2.power);
        System.out.println("tv2.channel : " + tv2.color);
    }
}
