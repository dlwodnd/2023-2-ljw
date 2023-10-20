package com.green.Conceptsummary;

public class Conceptsummary {

    public static void main(String[] args) {//메인메소드
        Example ex = new Example();
        ex.num = 0;
        Example.num3 = 0;

    }
}
class Example {//클래스
    //객체는 속성과 메소드로 이루어져 있다.
    int num;//속성(멤버필드)
    int num2;//전역변수(객체변수) : 객체화를 해야 다른 클래스에서도 사용 가능하다.
    private int number;//인스턴스 변수에는 되도록 private를 입력해주어야 한다.
    static int num3;//전역변수(클래스변수) : 객체화를 하지 않아도 다른 클래스에서 사용 가능하다.

    void ex() {
        int num4 = 0;//지역변수 : 메소드가 끝나는 시점에 바로 삭제된다.
    }

    void ex2() {
        this.num = 0;//this.은 같은 클래스안의 멤버필드를 호출할떄 사용한다.
        //일반적인 this.의 사용법은 메게변수와 멤버필드의 구분을 위해 사용한다.
    }

    public Example() {//기본생성자
        //기본생성자. 기본생성자는 파라미터가 없다.
        //생성자의 이름은 클래스의 이름과 같다
        //생성자는 리턴값이 없다.
        //생성자가 하나도 없을때 컴파일러가 기본생성자를 자동으로 넣어준다.
        //기본생성자와 파라미터 생성자를 같이 쓰고 싶으면 둘다 입력 해야한다.
        //기본 생성자의 존재이유
        //1 멤버필드 값을 객체생성과 동시에 밀어넣을 수 있다.
        //2 객체를 생성할 수 있다.

        this(num3);//this()는 생성자 내에서 다른 생성자를 호출할 떄 사용한다.
    }

    public Example(int x) {//메게변수를 가진 기본생성자.

    }

    public static void member() {//메소드
        //메소드는 리턴타입과 리턴값이 없는 메소드(void)타입이 있다.
        //public[접근제한자] static[메모리영역 타입] void[반환명] member[메소드명]()[메게변수]
        //메모리영역 타입에는 static과 heap 타입이 있다.
        //static 타입은 heap 타입과는 다른 영역에 저장되며 프로그램이 종료할때 까지 메모리에 할당된다.
        //static 타입
        //static은 다른 영역에 저장하고 static은 공간이 하나다.
        //static은 객체 생성과는 상관없다.new 를 사용하지 않아도 사용 가능하다.
        //같은 class안에 있는 static 메소드는 class명을 생략 가능하다.
        //다른 class 에서는 class명.메소드명을 사용해야한다.
        //static메소드에서는 인스턴드 변수를 사용 할 수 없으나. 인스턴트 메소드 에서는 스태틱 변수를 사용가능하다.
    }
}
class Example2{
    boolean power;
    int channel;
    void power() {
        power = !power;//토글, 호출할 때 마다 항상 반대값을 주는 것
    }
    void channelUP() {
        channel++;
    }
    void channelDown() {
        channel--;
    }
}
class Example2Test extends Example2{// X extends Y  = 'Y의 필드와 메소드를 X에게 상속한다' 라는 의미이다.
    @Override//오버라이딩 에노테이션 : 오버라이딩이 정확하게 되지 않았을 경우 오류가 난다.
    void channelUP(){//오버라이딩
        //오버라이딩을 할때는 구현부와 메소드명이 동일해야한다.
        //상위 클래스 메소드를 사용하지 않고 현재 클래스의 메소드를 사용하겠다.
        channel += 2;
    }
    int[]x = {13,7,20,19,2,10};
}
